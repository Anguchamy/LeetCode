class Solution {
    public String countAndSay(int n) {
        HashMap<Integer, String> map = new HashMap<>();
		map.put(1,"1");
		map.put(2,"11");
        int arr[] = new int[10];
		for(int i=3;i<=30;i++) {
			String temp = map.get(i-1);
			String tempres = "";
			arr[temp.charAt(0)-'0']++;
			for(int tempi=1;tempi<temp.length();tempi++) {
				if(temp.charAt(tempi) == temp.charAt(tempi-1)) {
					arr[temp.charAt(tempi)-'0']++;
				} else {
					tempres += (arr[temp.charAt(tempi-1) - '0'] + "" + temp.charAt(tempi-1));
					arr[temp.charAt(tempi-1) - '0'] = 0;
					arr[temp.charAt(tempi) - '0']++;
				}

                if(tempi == temp.length()-1) {
                    tempres += arr[temp.charAt(tempi) - '0'] + "" + temp.charAt(tempi);
                    arr[temp.charAt(tempi) - '0'] = 0;
                }
			}

			map.put(i, tempres);
		}

		return map.get(n);
    }
}