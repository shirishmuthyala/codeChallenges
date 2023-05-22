public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine(){
        return getName() + "Starting the Engine";
    }

    public String accelerate(){
        return getName() + "Car is accelerating";
    }

    public String brake(){
        return getName() + "Car is Braking";
    }

}

