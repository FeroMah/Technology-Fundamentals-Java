package Task_07_VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public String getType() {
        return this.type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public Vehicle(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return this.model;
    }


    @Override
    public String toString() {
        return String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %d",
                this.type.toUpperCase().charAt(0) + this.type.substring(1)
                , this.model, this.color, this.horsePower);
    }
}
