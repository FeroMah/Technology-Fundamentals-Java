import java.util.Scanner;

public class SnowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int snowBallMade = Integer.parseInt(scanner.nextLine());
        double bestScore = 0;
        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;
        for (int i = 0; i < snowBallMade; i++) {
            int snowBallSnow = Integer.parseInt(scanner.nextLine());
            int snowBallTime = Integer.parseInt(scanner.nextLine());
            int snowBallQuality = Integer.parseInt(scanner.nextLine());

            double current = Math.pow((snowBallSnow / snowBallTime), snowBallQuality);
            if (current > bestScore) {
                bestScore = current;
                bestSnow = snowBallSnow;
                bestTime = snowBallTime;
                bestQuality = snowBallQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",bestSnow,bestTime,bestScore,bestQuality);
    }
}
