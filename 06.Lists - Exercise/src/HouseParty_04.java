import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbOfGuests = Integer.parseInt(sc.nextLine());
        List<String> guestsList = new ArrayList<String>();

        for (int i = 0; i < numbOfGuests; i++) {
            String inputConsole = sc.nextLine();
            String[] invited = inputConsole.split(" ");
            String guestName = invited[0];
            if (!inputConsole.contains("not")) {
                if (!guestsList.contains(guestName)) {
                    guestsList.add(guestName);
                } else {
                    System.out.println(String.format("%s is already in the list!", guestName));
                }
            } else {
                if (guestsList.contains(guestName)) {
                    guestsList.remove(guestName);
                    continue;
                }
                System.out.println(String.format("%s is not in the list!", guestName));
            }

        }
        guestsList.toString().replaceAll("[\\[\\],]", "");
        for (int i = 0; i < guestsList.size(); i++) {
            System.out.println(guestsList.get(i));
        }
    }
}
