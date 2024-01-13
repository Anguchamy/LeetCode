class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum = 0;

        for(int i=s.length()-1;i>=0;i--) {
            int temp = map.get(s.charAt(i));
            while(i>0 && map.get(s.charAt(i)) > map.get(s.charAt(i-1))) {
                temp -= map.get(s.charAt(i-1));
                i--;
            }

            sum += temp;
        }

        return sum;
    }
}