public class Burger{
    private String type;
    private double price;
    private String size;


    public Burger(String type, double price) {
        this.type = type.toUpperCase();
        this.price = price;
    }

    public String getType() {
        if((type.equals("CHICKENBURGER") || (type.equals("BEEFBURGER")) || (type.equals("VEGGIEBURGER")))){
            return this.type + " = " + setBasePrice();
        }
        return "Wrong Input";
    }

    public double setBasePrice() {
        return price;
    }

    public double setAdjustedPrice(){
        return switch(type){
            case 1: "CHICKENBURGER" -> setBasePrice();
            case 2: "BEEFBURGER" ->
        }
    }
}

class ChickenBurger extends Burger{
    public ChickenBurger(String type, double price) {
        super(type, price);
    }

    public void getChickenBurger(){
        System.out.println("got a %s Burger"getClass().getSimpleName());
    }

}

class BeefBurger extends Burger{

}

class VeggieBurger extends Burger{

}















