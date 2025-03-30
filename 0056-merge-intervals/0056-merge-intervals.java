class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, (int[] a, int[] b) ->{
            return a[0] - b[0];
        });
        Stack<int[]> intervals = new Stack<>();
        intervals.push(arr[0]);
        int n = arr.length;

        for(int i = 1; i < n;i++){
            int st = arr[i][0];
            int et = arr[i][1];

            if(intervals.peek()[1]>=st){
                int[] last_interval = intervals.pop();
                int[] merged = new int[2];

                merged[0] = last_interval[0];
                merged[1] = Math.max(et,last_interval[1]);

                intervals.push(merged);
            }
            else{
                intervals.push(arr[i]);
            }
        }
        Stack<int[]> temp = new Stack<>();

        while(intervals.size()>0){
            temp.push(intervals.pop());
        }

        int[][] result = new int[temp.size()][2];

        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = temp.pop();
        }
        
        return result;
    }
}