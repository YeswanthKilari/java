public class kadane {
     public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        int currentsum = 0;
        int max = Integer.MIN_VALUE;
        
        int start =0;
        int beststart = 0;
        int end = 0;
        
        
        for(int i=0;i<nums.length;i++){
            currentsum += nums[i];
            // max = Math.max(currentsum,max);
            if(currentsum > max){
                max = currentsum;
                beststart = start;
                end = i;
            }
            if(currentsum < 0){
                currentsum = 0;
                start = i + 1;
            }
        }
        
        System.out.print(beststart+" "+ end+" "+ max);
    }
}
