class Solution {
    
     static void flip(int arr[]){
      int n = arr.length;
      int i=0;
      int j=n-1;

      while(i<j){
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
        i++;
        j--;
      }
    }

    static void invert(int arr[]){
      int n = arr.length;

      for(int i=0; i<n; i++){
        if(arr[i]==0) arr[i] = 1;
        else arr[i] = 0;
      }
    }
    
    public int[][] flipAndInvertImage(int[][] image) {
        
          int n = image.length;
          int m = image[0].length;

          int ans[][] = new int[n][m];

          for(int i=0; i<n; i++){
            flip(image[i]);
            invert(image[i]);
            ans[i] = image[i];      
          }
          return ans;
        
    }
}