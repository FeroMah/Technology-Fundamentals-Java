import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fieldSize = Integer.parseInt(sc.nextLine());
        String[] startingPositions = sc.nextLine().split("\\s+");
        String[] field = new String[fieldSize];

//        Filling the empty String[] with "0"
        for (int i = 0; i < field.length; i++) {
            field[i] = "0";
        }

//        Filling of the field!!
        for (int i = 0; i < startingPositions.length; i++) {
            int indexBug = Integer.parseInt(startingPositions[i]);
            if (indexBug >= 0 && indexBug < field.length) {
                field[indexBug] = "1";
            }

        }


        String[] commandInput = sc.nextLine().split("\\s+");
        String isItEnd = commandInput[0];
        while (!isItEnd.equalsIgnoreCase("End")) {

            int index = Integer.parseInt(commandInput[0]);
            int jump = Integer.parseInt(commandInput[2]);
            String direction = commandInput[1].toLowerCase();
            if (index < field.length && index >= 0
                    && field[index].equals("1") && jump != 0) {

                switch (direction) {
                    case "right":

                        for (int i = index; i < fieldSize; i+=jump) {
                            if (i + jump < fieldSize) {
                                if (field[i + jump].equals("0")) {
                                    field[i + jump] = "1";
                                    field[index] = "0";
                                    break;
                                }
                            } else {
                                field[index] = "0";
                                break;
                            }
                        }
                        break;

                    case "left":
                        for (int i = index; i > 0; i-=jump) {
                            if (i - jump >= 0) {
                                if (field[i - jump].equals("0")) {
                                    field[i - jump] = "1";
                                    field[index] = "0";
                                    break;
                                }
                            } else {
                                field[index] = "0";
                                break;
                            }

                        }
                        break;
                }
            }
            commandInput = sc.nextLine().split("\\s+");
            isItEnd = commandInput[0];

        }
        String result = "";
        for (int i = 0; i < field.length; i++) {
            result += field[i] + " ";
        }
        System.out.println(result.trim());
    }
}

