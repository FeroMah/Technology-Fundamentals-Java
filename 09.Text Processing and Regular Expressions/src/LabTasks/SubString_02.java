package LabTasks;

import java.util.Scanner;

public class SubString_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String removeStrInput = sc.nextLine();
        String workInput = sc.nextLine();

//      int index = workInput.indexOf(removeStrInput);   --- if there is not removeStrInput(first index), it will return -1;
//      while (index!=1)  ;                              --- until there is not first index of removeStrInput;

        while (workInput.contains(removeStrInput)) {
            workInput = workInput.replace(removeStrInput, "");
        }
        System.out.println(workInput);
    }
}
