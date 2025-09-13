public class maxprofit {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i : arr){
            if(i < min){
                min = i;
            }else if(i - min > max){
                max = i - min;
            }
        }
        
        System.out.print(max);
    }
}
