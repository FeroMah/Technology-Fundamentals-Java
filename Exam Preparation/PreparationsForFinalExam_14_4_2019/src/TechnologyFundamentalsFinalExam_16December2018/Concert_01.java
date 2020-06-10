package TechnologyFundamentalsFinalExam_16December2018;

import java.util.*;

public class Concert_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> stageTime = new TreeMap<>();
        Map<String, List<String>> bandMembers = new LinkedHashMap<>();
        String isItStartConcert = sc.nextLine();

        while (!"start of concert".equalsIgnoreCase(isItStartConcert)) {

            String[] consoleInput = isItStartConcert.split("; ");
            String addOrPlay = consoleInput[0].toUpperCase();
            String bandName = consoleInput[1];

            switch (addOrPlay) {
                case "ADD":
                    bandMembers.putIfAbsent(bandName, new ArrayList<>());
                    String[] listAllMembersForBand = consoleInput[2].split(", ");
                    for (int i = 0; i < listAllMembersForBand.length; i++) {
                        String member = listAllMembersForBand[i];
                        if (!bandMembers.get(bandName).contains(member)) {
                            bandMembers.get(bandName).add(member);
                        }
                    }
                    break;
                case "PLAY":
                    int time = Integer.parseInt(consoleInput[2]);
                    stageTime.putIfAbsent(bandName, 0);
                    stageTime.put(bandName, stageTime.get(bandName) + time);

                    break;
            }
            isItStartConcert = sc.nextLine();
        }
        int totalTime = 0;
        for (Integer time : stageTime.values()) {
            totalTime += time;
        }
        String printBand = sc.nextLine();
        System.out.println(String.format("Total time: %d", totalTime));
        stageTime.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue(), a.getValue())).forEach(e -> System.out.println(String.format("%s -> %d", e.getKey(), e.getValue())));
        bandMembers.entrySet().stream().forEach(e -> {
                    if (e.getKey().equals(printBand)) {
                        System.out.println(e.getKey());
                        e.getValue().stream().forEach(member -> System.out.println(String.format("=> %s", member)));
                    }
                }
        );
    }
}
