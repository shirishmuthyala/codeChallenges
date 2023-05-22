import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Which Meal would you like to have: %n " +
                    "1. RegularMeal %n 2. CustomMeal %n 3. Side&Drink Meal %n 4. DeluxeMeal %n 5. Quit");
            String Type = s.nextLine();
            if("Qq".contains(type)){
                System.out.println("Thank you for Coming");
                break;
            }
            if("RegularMeal".contains(type)){
                 Meal.RegularMeal();
            } else if ("CustomMeal".contains(type)) {
                Meal.CustomMeal();
            } else if ("Side&Drink Meal".contains(type)) {
                Meal.DrinkAndSideItemMeal();
            } else if ("DeluxeMeal".contains(type)) {
                Meal.DeluxeMeal();
            }
            Meal meal = Meal.RegularMeal(type);

        }


    public static void SelectBurger(Burger burger){
        Burger.getBurger();
    }
}
