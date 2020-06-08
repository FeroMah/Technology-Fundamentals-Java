import java.util.*;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> courses = Arrays.stream(sc.nextLine().split(", ")).map(String::toString).collect(Collectors.toList());

        String[] input = sc.nextLine().split("\\:+");
        String isStartTheCourse = input[0].toLowerCase();

        while (!isStartTheCourse.equalsIgnoreCase("course start")) {
            String commandInput = input[0].toLowerCase();
            String lessonsTitle = input[1];


            switch (commandInput) {
                case "add":
                    if (!courses.contains(lessonsTitle)) {
                        courses.add(lessonsTitle);
                    }
                    break;
                case "insert":
                    String insertIndex = input[2];
                    int index = Integer.parseInt(insertIndex);
                    if (index >= 0 && index < courses.size()) {
                        if (!courses.contains(lessonsTitle)) {
                            courses.add(index, lessonsTitle);
                        }
                    }
                    break;

                case "remove":
                    int removedExerciseIndex = courses.indexOf(lessonsTitle);

                    if (courses.get(removedExerciseIndex + 1).contains(lessonsTitle + "-Exercise")) {
                        courses.add(removedExerciseIndex + 1, lessonsTitle + "-Exercise");
                    }
                    courses.remove(lessonsTitle);

                    break;

                case "swap":
                    String lessonsTitle2 = input[2];
                    if (courses.contains(lessonsTitle) && courses.contains(lessonsTitle2)) {
                        int swapIndex = courses.indexOf(lessonsTitle);
                        int swapIndex2 = courses.indexOf(lessonsTitle2);
                        String swapTemp = courses.get(swapIndex);
                        courses.set(swapIndex, lessonsTitle2);
                        courses.set(swapIndex2, swapTemp);
                        if (swapIndex + 1 < courses.size() && swapIndex2 + 1 < courses.size()) {
                            if (courses.get(swapIndex2 + 1).contains(lessonsTitle2 + "-Exercise")) {
                                courses.remove(swapIndex2 + 1);
                                courses.add(swapIndex + 1, lessonsTitle2 + "-Exercise");
                            }
                            if (courses.get(swapIndex + 1).contains(lessonsTitle + "-Exercise")) {
                                courses.remove(swapIndex + 1);
                                courses.add(swapIndex2 + 1, lessonsTitle + "-Exercise");
                            }
                        } else {
                            if (swapIndex + 1 >= courses.size() && courses.contains(lessonsTitle2 + "-Exercise")) {
                                courses.remove(lessonsTitle2 + "-Exercise");
                                courses.add(lessonsTitle2 + "-Exercise");
                            }
                            if (swapIndex2 + 1 >= courses.size() && courses.contains(lessonsTitle + "-Exercise")) {
                                courses.remove(lessonsTitle + "-Exercise");
                                courses.add(lessonsTitle + "-Exercise");
                            }
                        }

                    }
                    break;
                case "exercise":
                    int addExerciseIndex = courses.indexOf(lessonsTitle);

                    if (courses.contains(lessonsTitle)) {

                        if (!courses.contains(lessonsTitle + "-Exercise")) {
                            courses.add(addExerciseIndex, lessonsTitle + "-Exercise");
                        }

                    } else {

                        courses.add(lessonsTitle);
                        courses.add(lessonsTitle + "-Exercise");
                    }

                    break;
            }


            input = sc.nextLine().split("\\:+");
            isStartTheCourse = input[0].toLowerCase();
        }

        for (int i = 0; i < courses.size(); i++) {
            System.out.println(String.format("%d." + courses.get(i), i + 1));
        }

    }
}
