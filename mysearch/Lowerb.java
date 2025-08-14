package mysearch;

public class Lowerb {
    public static int lowerb(int[] arr,int target, int n){
            int low = 0 , high = n - 1;
            int ans = n;
            while(low <= high){
                int mid = low + ((high - low) /2);
                if(arr[mid] >= target){
                    ans = mid;
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
            return ans;
        }
}
