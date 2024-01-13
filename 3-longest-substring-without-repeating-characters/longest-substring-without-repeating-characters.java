class Solution {
    public int lengthOfLongestSubstring(String s) {
        int characters[] = new int[256];

        int pointerOne = 0;
        int pointerTwo = 0;
        int result = 0;
        for(;pointerTwo<s.length();pointerTwo++) {
            characters[s.charAt(pointerTwo)]++;
            while(characters[s.charAt(pointerTwo)] > 1) {
                characters[s.charAt(pointerOne)]--;
                pointerOne++;
            }

            result = Math.max(result, pointerTwo - pointerOne + 1);
        }

        return result;
    }
}