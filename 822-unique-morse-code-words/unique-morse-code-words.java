class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String arr[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> result = new HashSet<>();
        String temp = "";
        for(int i=0;i<words.length;i++) {
            temp = "";
            for(char a : words[i].toCharArray()) {
                temp += arr[a-'a'];
            }
            result.add(temp);
        }

        return result.size();
    }
}