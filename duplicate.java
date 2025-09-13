import java.util.HashSet;
import java.util.Set;

public class duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2};
        boolean bol = false;
        
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            if(set.contains(i)){
                bol = true;
            }
            set.add(i);
        }
        
        System.out.print(bol);
    }
}
