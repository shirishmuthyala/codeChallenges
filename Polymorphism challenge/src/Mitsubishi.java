public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
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
