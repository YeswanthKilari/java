class Main{
    public static void main(String[] args) {
        //finding the if element is odd or even
        int number = 29;

        System.out.println("the number is " + (isodd(number)? " odd":" even"));

    }
    
    static boolean isodd(int n) {
        if ((n & 1) == 1) {
            return true;
        }
        return false;
    }
}