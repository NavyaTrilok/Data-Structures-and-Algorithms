class Solution {
    public int search(int[] arr, int target) {

        int si = 0;
        int ei = arr.length - 1;

        while(si <= ei){
            int mid = (si + ei)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[si] <= arr[mid]){
                //si to mid is sorted
                if(arr[si] <= target && arr[mid] > target){
                    ei = mid - 1;
                }else{
                    si = mid + 1;
                }

            }else{
                //mid to ei is sorted
                if(arr[mid] < target && target <= arr[ei]){
                    si = mid + 1;
                }else{
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }
}