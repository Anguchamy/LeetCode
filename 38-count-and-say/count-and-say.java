class Solution {
    public String countAndSay(int n) {
        String s = "1";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "1");
        for(int i=2;i<=30;i++) {
            sb = new StringBuilder();
            for(int j=0;j<s.length();j++) {
                count = 1;
                while(j+1 < s.length() && s.charAt(j) == s.charAt(j+1)) {
                    j++;
                    count++;
                }

                sb.append(count).append(s.charAt(j));
            }
            s = sb.toString();
            map.put(i, s);
        }
        return map.get(n);
    }
}