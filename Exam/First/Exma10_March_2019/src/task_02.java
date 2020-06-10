import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] consoleInput = sc.nextLine().split("#");
        int waterLeft = Integer.parseInt(sc.nextLine());
        double totalEffort = 0;
        List<String> firePutOut = new ArrayList<>();

        for (int i = 0; i < consoleInput.length; i++) {
            String[] fire = consoleInput[i].split(" = ");
            String typeOfFire = fire[0].toLowerCase();
            int valueOfCell = Integer.parseInt(fire[1]);
            switch (typeOfFire) {
                case "high":
                    if (valueOfCell >= 81 && valueOfCell <= 125) {
                        if (waterLeft >= valueOfCell) {
                            waterLeft -= valueOfCell;
                            totalEffort = totalEffort + valueOfCell * 0.25;
                            firePutOut.add(fire[1]);
                        }
                    }

                    break;
                case "medium":
                    if (valueOfCell >= 51 && valueOfCell <= 80) {
                        if (waterLeft >= valueOfCell) {
                            waterLeft -= valueOfCell;
                            totalEffort = totalEffort + valueOfCell * 0.25;
                            firePutOut.add(fire[1]);
                        }
                    }
                    break;
                case "low":
                    if (valueOfCell >= 1 && valueOfCell <= 50) {
                        if (waterLeft >= valueOfCell) {
                            waterLeft -= valueOfCell;
                            totalEffort = totalEffort + valueOfCell * 0.25;
                            firePutOut.add(fire[1]);
                        }
                    }
                    break;

            }
        }
        System.out.println("Cells:");
        int totalFire= 0;
        for (int i = 0; i < firePutOut.size(); i++) {
            int firesssFinale = Integer.parseInt(firePutOut.get(i));
            totalFire+= firesssFinale;
            System.out.println(String.format("- %s", firePutOut.get(i)));
        }
        System.out.println(String.format("Effort: %.2f",totalEffort));
        System.out.println(String.format("Total Fire: %d",totalFire));
    }
}
