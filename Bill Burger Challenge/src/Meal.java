public class Meal {

    private Burger burger;
    private Drink drink;
    private SideItem sideItem;
    private double Total;
    private double tax = 1.23;
    private String type;
    public Meal() {


    }

    public Meal(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public double BasePrice(){

    }

    public static void RegularMeal(){
       // double RM = Burger.Chicken() + Drink.smallDrink() + SideItem.fries() + this.tax;
        // PrintReceipt.print();
    }

    public static void CustomMeal(){

    }
    public static void DeluxeMeal(){

    }
    public static void DrinkAndSideItemMeal(){

    }
}

