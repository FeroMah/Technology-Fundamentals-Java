import java.util.Scanner;

public class Problem02_DungeonestDark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int health = 100;
        int coins = 0;
        String inputConsole = sc.nextLine();
        int numberOfRooms = calculationOfRooms(inputConsole);

        String[] roomsContent = getRoomInside(inputConsole, numberOfRooms);
        String[] action = getActionArray(numberOfRooms, roomsContent);
        int[] points = getPointsArray(numberOfRooms, roomsContent);

        for (int i = 0; i < numberOfRooms; i++) {
            switch (action[i]) {
                case "potion":
                    if (health + points[i] > 100) {
                        System.out.println(String.format("You healed for %d hp.", 100 - health));
                        System.out.println("Current health: 100 hp.");
                        health = 100;
                    } else {
                        health += points[i];
                        System.out.println(String.format("You healed for %d hp.", points[i]));
                        System.out.println(String.format("Current health: %d hp.", health));

                    }
                    break;
                case "chest":
                    coins += points[i];
                    System.out.println(String.format("You found %d coins.", points[i]));
                    break;
                default:
                    if (health - points[i] <= 0) {
                        System.out.println(String.format("You died! Killed by %s.", action[i]));
                        System.out.println(String.format("Best room: %d", i + 1));
                        return;
                    } else {
                        health -= points[i];
                        System.out.println(String.format("You slayed %s.", action[i]));
                    }
                    break;
            }
        }
        System.out.println("You've made it!");
        System.out.println(String.format("Coins: %d", coins));
        System.out.println(String.format("Health: %d", health));
    }

    private static int[] getPointsArray(int numberOfRooms, String[] roomsContent) {
        int[] points = new int[numberOfRooms];
        for (int j = 0; j < numberOfRooms; j++) {

            String[] room = roomsContent[j].split(" ");
            points[j] = Integer.parseInt(room[1]);
        }
        return points;
    }

    private static String[] getActionArray(int numberOfRooms, String[] roomsContent) {
        String[] action = new String[numberOfRooms];
        for (int j = 0; j < numberOfRooms; j++) {

            String[] room = roomsContent[j].split(" ");
            action[j] = room[0];
        }
        return action;
    }

    private static String[] getRoomInside(String inputConsole, int numberOfRooms) {
        String insideRoom = "";
        int index = 0;  // Position of element in roomsContent array;
        String[] roomsContent = new String[numberOfRooms];
        for (int i = 0; i < inputConsole.length(); i++) {
            String symbol = String.valueOf(inputConsole.charAt(i));
            if (!symbol.equals("|")) {
                insideRoom += symbol;
                if (i == inputConsole.length() - 1) {   // For adding last symbol to string "insideRoom"!
                    roomsContent[index++] = insideRoom;
                    break;
                }
            } else {
                roomsContent[index++] = insideRoom;
                insideRoom = "";
            }
        }
        return roomsContent;
    }


    private static int calculationOfRooms(String input) {
        int roomsCount = 1;
        for (int i = 0; i < input.length(); i++) {
            String symbol = String.valueOf(input.charAt(i));
            if (symbol.equals("|")) {
                roomsCount++;
            }
        }
        return roomsCount;
    }
}


