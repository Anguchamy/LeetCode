class Solution {
    public boolean isCircularSentence(String sentence) {
        String splittedStrings[] = sentence.split(" ");
        boolean result = false;

        String firstWord = splittedStrings[0];
        String lastWord = splittedStrings[splittedStrings.length - 1];

        result = firstWord.charAt(0) == lastWord.charAt(lastWord.length()-1);


        if(result) {
            for(int i=0;i<splittedStrings.length-1;i++) {
                if(splittedStrings[i].charAt(splittedStrings[i].length()-1) == splittedStrings[i+1].charAt(0)) {
                    continue;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}