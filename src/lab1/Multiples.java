package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(3,5, 1000));
    }

     public static int multiples(int a, int b, int n) {
        int count = 0;
        for (int i = 1; i < n; i++){
            if (i % a == 0 || i % b == 0) {
                count++;
            }
        }
        return count;
    }
}
