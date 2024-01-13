class Solution {
    public int minSteps(String s, String t) {
        int[] alphabetS = new int[26];
        int[] alphabetT = new int[26];
        for(char a : s.toCharArray()) {
            alphabetS[a-'a']++;
        }

        for(char a : t.toCharArray()) {
            alphabetT[a-'a']++;
        }

        int result = 0;
        for(int i=0;i<26;i++) {
            //System.out.println(alphabet[i]);
            result += Math.abs(alphabetS[i] - alphabetT[i]);
        }

        return result/2;
    }
}
