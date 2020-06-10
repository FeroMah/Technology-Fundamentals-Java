import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AssociativeArrays_Lab_task_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double[] nums = Arrays.stream(sc.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        TreeMap<Double,Integer> counts = new TreeMap<>();

        for (Double digit : nums) {
            if (!counts.containsKey(digit)){
                counts.put(digit, 0);
            }
            counts.put(digit, counts.get(digit)+1);
        }

        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            DecimalFormat decform= new DecimalFormat("#.#######");
            System.out.println(String.format("%s -> %d",decform.format(entry.getKey()), entry.getValue()));
        }
    }
}
