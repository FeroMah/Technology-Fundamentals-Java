import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputNum = scanner.nextLine();
        int inputInt = Integer.parseInt(inputNum);
        int sum =0;

        for (int i = 0; i < inputNum.length(); i++) {
            int number = Integer.parseInt(String.valueOf(inputNum.charAt(i)));
            int factorial = 1;

            for (int j = 1; j <= number; j++) {
                factorial *= j;
                //System.out.println(factorial);    FOR DEBUGGING ONLY!
            }
            sum+=factorial;
        }
        if (inputInt == sum){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
