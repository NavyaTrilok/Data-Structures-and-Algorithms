class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (int[] a, int[] b) -> {
            return a[0] - b[0];
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int[] interval: intervals){

            if(pq.size() == 0){
                pq.add(interval[1]);
            }else{

                int st = interval[0];
                int et = interval[1];

                if( st >= pq.peek()){
                    pq.poll();
                    pq.add(et);
                }else{
                    pq.add(et);
                }

            }

        }
        return pq.size();
    }
}