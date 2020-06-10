import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger fist = new BigInteger(sc.nextLine());
        BigInteger second = new BigInteger(sc.nextLine());
        BigInteger sum = fist.add(second);
        System.out.println(sum);
    }
}