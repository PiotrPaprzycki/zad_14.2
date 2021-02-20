public class Vehicle {
    private String type;
    private String brand;
    private String model;
    private int age;
    private int mileage;
    private String vin;

    public Vehicle(String type, String brand, String model, int age, int mileage, String vin) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.age = age;
        this.mileage = mileage;
        this.vin = vin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", age=" + age +
                ", mileage=" + mileage +
                ", vin='" + vin + '\'' +
                '}';
    }
}
