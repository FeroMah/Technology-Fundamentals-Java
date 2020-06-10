import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumb = Integer.parseInt(sc.nextLine());

        BigInteger result = new BigInteger(String.valueOf(1));

        for (int i = 1; i <= inputNumb; i++) {
            result = result.multiply(BigInteger
                    .valueOf(Integer.parseInt
                            (String.valueOf(i))));
        }
        System.out.println(result);
    }
}

