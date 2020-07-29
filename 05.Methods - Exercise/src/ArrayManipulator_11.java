import java.util.*;

import static java.util.stream.Collectors.toList;

public class ArrayManipulator_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbersInput = Arrays.stream(sc.nextLine().toLowerCase().split("\\s+")).map(Integer::parseInt).collect(toList());

        String[] nextCommand = sc.nextLine().toLowerCase().split("\\s+");
        while (!nextCommand[0].equals("end")) {
            String s = nextCommand[0];
            switch (s) {
                case "exchange":
                    int index = Integer.parseInt(nextCommand[1]);

                    if (!isIndexValid(index, numbersInput)) {
                        System.out.println("Invalid index");
                        break;
                    }
                    numbersInput = doExchange(nextCommand[1], numbersInput);
//                    System.out.println(numbersInput); //for testing!
                    break;
                case "max":
                    if ("odd".equals(nextCommand[1])) {
                        int maxOddNumberIndex = -1;
                        int maxOddNumber = Integer.MIN_VALUE;
                        for (int i = 0; i < numbersInput.size(); i++) {
                            if (isOddNumber(numbersInput.get(i))) {
                                if (numbersInput.get(i) >= maxOddNumber) {
                                    maxOddNumber = numbersInput.get(i);
                                    maxOddNumberIndex = i;
                                }
                            }
                        }
                        if (!isIndexValid(maxOddNumberIndex, numbersInput)) {
                            System.out.println("No matches");
                            break;
                        }

                        System.out.println(maxOddNumberIndex);

                    } else if ("even".equals(nextCommand[1])) {
                        int maxEvenNumberIndex = -1;
                        int maxEvenNumber = Integer.MIN_VALUE;
                        for (int i = 0; i < numbersInput.size(); i++) {
                            if (isEvenNumber(numbersInput.get(i))) {
                                if (numbersInput.get(i) >= maxEvenNumber) {
                                    maxEvenNumber = numbersInput.get(i);
                                    maxEvenNumberIndex = i;
                                }
                            }
                        }
                        if (!isIndexValid(maxEvenNumberIndex, numbersInput)) {
                            System.out.println("No matches");
                            break;
                        }
                        System.out.println(maxEvenNumberIndex);
                    }
                    break;
                case "min":
                    if ("odd".equals(nextCommand[1])) {
                        int minOddNumberIndex = -1;
                        int minOddNumber = Integer.MAX_VALUE;
                        for (int i = 0; i < numbersInput.size(); i++) {
                            if (isOddNumber(numbersInput.get(i))) {
                                if (numbersInput.get(i) <= minOddNumber) {
                                    minOddNumber = numbersInput.get(i);
                                    minOddNumberIndex = i;
                                }
                            }
                        }

                        if (!isIndexValid(minOddNumberIndex, numbersInput)) {
                            System.out.println("No matches");
                            break;
                        }

                        System.out.println(minOddNumberIndex);

                    } else if ("even".equals(nextCommand[1])) {
                        int minEvenNumberIndex = -1;
                        int minEvenNumber = Integer.MAX_VALUE;
                        for (int i = 0; i < numbersInput.size(); i++) {
                            if (isEvenNumber(numbersInput.get(i))) {
                                if (numbersInput.get(i) <= minEvenNumber) {
                                    minEvenNumber = numbersInput.get(i);
                                    minEvenNumberIndex = i;
                                }
                            }
                        }

                        if (!isIndexValid(minEvenNumberIndex, numbersInput)) {
                            System.out.println("No matches");
                            break;
                        }

                        System.out.println(minEvenNumberIndex);
                    }
                    break;
                case "first":
                    int firstNumbsListSize = Integer.parseInt(nextCommand[1]);
                    if (firstNumbsListSize > numbersInput.size()) {
                        System.out.println("Invalid count");
                        break;
                    }

                    List<Integer> firstNumbersList = new ArrayList<>();

                    if (nextCommand[2].equals("even")) {

                        for (Integer integer : numbersInput) {

                            if (firstNumbersList.size() == firstNumbsListSize) {
                                break;
                            }

                            if (isEvenNumber(integer)) {
                                firstNumbersList.add(integer);
                            }
                        }

                    } else if (nextCommand[2].equals("odd")) {

                        for (Integer integer : numbersInput) {

                            if (firstNumbersList.size() == firstNumbsListSize) {
                                break;
                            }
                            if (isOddNumber(integer)) {
                                firstNumbersList.add(integer);
                            }
                        }
                    }
                    System.out.println(firstNumbersList.toString());
                    break;
                case "last":
                    int lastNumbsListSize = Integer.parseInt(nextCommand[1]);
                    if (lastNumbsListSize> numbersInput.size()) {
                        System.out.println("Invalid count");
                        break;
                    }

                    List<Integer> lastNumbersList = new ArrayList<>();
                    if (nextCommand[2].equals("even")) {
                        for (int i = numbersInput.size() - 1; i >= 0; i--) {
                            if (lastNumbersList.size() == lastNumbsListSize) {
                                break;
                            }
                            if (isEvenNumber(numbersInput.get(i))) {
                                lastNumbersList.add(numbersInput.get(i));
                            }
                        }
                        Collections.reverse(lastNumbersList);
                        System.out.println(lastNumbersList);

                    } else if (nextCommand[2].equals("odd")) {
                        for (int i = numbersInput.size() - 1; i >= 0; i--) {
                            if (lastNumbersList.size() == lastNumbsListSize) {
                                break;
                            }
                            if (isOddNumber(numbersInput.get(i))) {
                                lastNumbersList.add(numbersInput.get(i));
                            }
                        }
                        Collections.reverse(lastNumbersList);
                        System.out.println(lastNumbersList);
                    }
                    break;
            }

            nextCommand = sc.nextLine().toLowerCase().split("\\s+");
        }
        System.out.println(numbersInput);

    }

    private static boolean isEvenNumber(int number) {
        int remainder = number % 2;
        return remainder == 0;
    }

    private static boolean isOddNumber(int number) {
        int remainder = number % 2;
        return remainder > 0;
    }

    private static boolean isIndexValid(int index, List<Integer> list) {
        return index >= 0 && index < list.size();
    }

    private static List<Integer> doExchange(String position, List<Integer> numbers) {
        int index = Integer.parseInt(position);
        List<Integer> firstPart = numbers.subList(index + 1, numbers.size());
        List<Integer> secondPart = numbers.subList(0, index + 1);

        List<Integer> result = new ArrayList<>();
        result.addAll(firstPart);
        result.addAll(secondPart);
        return result;
    }
}