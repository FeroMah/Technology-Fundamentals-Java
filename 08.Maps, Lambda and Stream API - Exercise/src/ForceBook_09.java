package ExercisesHomeWork;

import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, ArrayList<String>> data = new TreeMap<>();
        String input = sc.nextLine();


        String isItEnd = input;
        while (!isItEnd.equalsIgnoreCase("Lumpawaroo")) {

            if (input.contains(" -> ")) {
                String[] userRegisterInput = input.split("->");
                //you should check if there is such forceUser already and if so, change his/her side.
                // If there is no such forceUser, add him/her to the corresponding forceSide, treating the command as new registered forceUser.
                String user = userRegisterInput[0].trim();
                String forceSide = userRegisterInput[1].trim();

                for (Map.Entry<String, ArrayList<String>> kvp : data.entrySet()) {
                    if (kvp.getValue().contains(user)) {

                        int removeIndex = kvp.getValue().indexOf(user);
                        String removeKey = kvp.getKey();

                        data.get(removeKey).remove(removeIndex);
                    }
                }
                data.putIfAbsent(forceSide, new ArrayList<>());
                data.get(forceSide).add(user);
                System.out.println(String.format("%s joins the %s side!", user, forceSide));
            }
            if (input.contains(" | ")) {
                String[] userChangeSide = input.split("\\|");
                // you should check if such forceUser already exists, and if not, add him/her to the corresponding side!
                String sideN = userChangeSide[0].trim();
                String nameU = userChangeSide[1].trim();
                data.putIfAbsent(sideN, new ArrayList<>());
                boolean isItUsed = false;
                for (ArrayList<String> v : data.values()) {
                    if (v.contains(nameU)) {
                        isItUsed = true;
                        break;
                    }
                }
                if (!isItUsed) {
                    data.get(sideN).add(nameU);
                }
            }
            input = sc.nextLine();
            isItEnd = input;
        }
        data.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size())).filter(e -> e.getValue().size() > 0)
                .forEach(h -> {
                    System.out.println(String.format("Side: %s, Members: %d", h.getKey(), h.getValue().size()));
                    h.getValue().stream().sorted().forEach(z -> System.out.println(String.format("! %s", z)));
                });
    }
}

