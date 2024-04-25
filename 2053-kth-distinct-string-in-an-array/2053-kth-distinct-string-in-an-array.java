class Solution {
    public String kthDistinct(String[] arr, int k) {
        
        int count = 0;
        Map<String, Boolean> map = new HashMap<>();

        for (int i = 0; i <= arr.length-1; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], false);
            } else map.put(arr[i], true);
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i])) {
                count++;
                if (count==k) return arr[i];
            }
        }
        
        return "";
        
    }
}