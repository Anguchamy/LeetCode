class Solution {
    public static List<String> letterCasePermutation(String s) {
		List<String> result = new ArrayList<>();

		dfs(s, result);

		return result;
	}

	public static void dfs(String s, List<String> result) {
		if(result.contains(s)) {
			return;
		}

		result.add(s);
		char arr[] = s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(Character.isAlphabetic(arr[i])) {
				if(Character.isUpperCase(arr[i])) {
					arr[i] = Character.toLowerCase(arr[i]);
                    dfs(String.valueOf(arr), result);
                    arr[i] = Character.toUpperCase(arr[i]);
				} else {
					arr[i] = Character.toUpperCase(arr[i]);
					dfs(String.valueOf(arr), result);
					arr[i] = Character.toLowerCase(arr[i]);
				}
                
			}
		}
	}
}