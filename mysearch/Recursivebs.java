package mysearch;

public class Recursivebs {
    public static int Recursivebs(int[] arr, int key, int high, int low ){
        if(low > high){
            return -1;
        }
        int mid = low + ((high - low) / 2);
        if(arr[mid] == key){
            return mid;
        }
        else if(key > arr[mid]){
            return Recursivebs(arr, key , high, mid+1);
        }
        return Recursivebs(arr,key,mid-1,low);
    }
}
