package ProgrammingFundamentalsRetakeExam_27August2018PartII;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();
        String[] input = inputLine.split("\\|");


        String regexLetters = "([\\#\\$\\%\\*\\&])(?<UpperChars>([A-Z]+))\\1";
        Pattern patternLetters = Pattern.compile(regexLetters);
        Matcher matcherLetters = patternLetters.matcher(input[0]);
        String capitalLetters = "";

        while (matcherLetters.find()) {
            capitalLetters += matcherLetters.group(2);
        }
        String regexNumbers = "([0-9]{2}):(([0]|[1])[0-9])";
        Pattern patternNumbers = Pattern.compile(regexNumbers);
        Matcher matcherNumbers = patternNumbers.matcher(input[1]);
        List<Integer> wordsLength = new ArrayList<>();
        List<Integer> charsLetter = new ArrayList<>();
        while (matcherNumbers.find()) {
            charsLetter.add(Integer.parseInt(matcherNumbers.group(1)));
            wordsLength.add(Integer.parseInt(matcherNumbers.group(2))+1);
        }
        String regexWord = "\\b[A-Z][^\\s]+\\b";
        Pattern patternWord = Pattern.compile(regexWord);
        Matcher matcherWord = patternWord.matcher(input[2]);
        List<String> listOfWords = new ArrayList<>();
        while (matcherWord.find()) {
            listOfWords.add(matcherWord.group());
        }

        System.out.println();
    }
}
