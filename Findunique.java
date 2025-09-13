public class Findunique {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 1, 2, 3 };
        System.out.println("the unique element is " + findunique(arr));
    }
    
    static int findunique(int[] arr) {
        int unique = 0;
        for (int i : arr) {
            unique ^= i;
        }

        return unique;
    }
}
