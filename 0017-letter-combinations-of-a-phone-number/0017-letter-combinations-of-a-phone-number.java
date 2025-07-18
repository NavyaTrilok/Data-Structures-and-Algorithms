class Solution {

    String[] arr = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>(); // ✅ return [] for empty input
        }
        return helper(digits); // ✅ delegate to recursive helper
    }

    private List<String> helper(String digits) {
        if (digits.length() == 0) {
            List<String> base = new ArrayList<>();
            base.add("");  // ✅ base case for recursion
            return base;
        }

        List<String> sans = helper(digits.substring(1));
        List<String> ans = new ArrayList<>();

        char first_char = digits.charAt(0);
        int idx = first_char - '0';
        String key = arr[idx];

        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);

            for (int j = 0; j < sans.size(); j++) {
                String toAdd = ch + sans.get(j);
                ans.add(toAdd);
            }
        }

        return ans;
    }
}
