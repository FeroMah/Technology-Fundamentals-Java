package Task_07_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] consoleInput = sc.nextLine().split("\\s+");
        String isItEnd = consoleInput[0];
        List<Vehicle> vehiclesData = new ArrayList<>();

        while (!isItEnd.equalsIgnoreCase("End")) {
            String type = consoleInput[0];
            String model = consoleInput[1];
            String color = consoleInput[2];
            int horsePower = Integer.parseInt(consoleInput[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsePower);
            vehiclesData.add(vehicle);

            consoleInput = sc.nextLine().split("\\s");
            isItEnd = consoleInput[0];
        }
        String inputModel = sc.nextLine();
        double countTruck = 0;
        double countCar = 0;
        int sumHorsePowerTruck = 0;
        int sumHorsePowerCar = 0;

        for (Vehicle vehicle : vehiclesData) {
            if (vehicle.getType().equals("truck")) {
                sumHorsePowerTruck += vehicle.getHorsePower();
                countTruck++;

            } else {
                sumHorsePowerCar += vehicle.getHorsePower();
                countCar++;
            }
        }


        while (!inputModel.equalsIgnoreCase("Close the Catalogue")) {
            for (Vehicle vehicle : vehiclesData) {

                if (vehicle.getModel().equals(inputModel)) {
                    System.out.println(vehicle.toString());
                }
            }
            inputModel = sc.nextLine();
        }
        double averageHPCars = 0;
        if (countCar > 0 && sumHorsePowerCar > 0) {
            averageHPCars = sumHorsePowerCar / countCar;
        }
        System.out.println(String.format("Cars have average horsepower of: %.2f.", averageHPCars));

        double averageHPTrucks = 0;
        if (countTruck > 0 && sumHorsePowerTruck > 0) {
            averageHPTrucks = sumHorsePowerTruck / countTruck;
        }
        System.out.println(String.format("Trucks have average horsepower of: %.2f.", averageHPTrucks));
    }
}
