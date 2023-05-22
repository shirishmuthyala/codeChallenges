import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

record GroceryItem(String name, String type, int count) {

public GroceryItem(String name) {
        this(name, "DAIRY", 1);
        }

@Override
public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
        }
        }

public class Main {

    public static void main(String[] args) {

        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));
        groceryList.set(0,
                new GroceryItem("apples", "PRODUCE", 6));
        groceryList.remove(1);
        System.out.println(groceryList);
        System.out.println("-----------------------------------------------");

        String[] a = {"asd","ds", "sds", "sda"};
        List<String> list = Arrays.asList(a);
        System.out.println(list);
        ArrayList<String> grocery = new ArrayList<>(list);
        System.out.println(grocery);
        grocery.add("asdasd");
        System.out.println(grocery);
        grocery.removeAll(List.of("asd", "sds", "asdasd"));
        System.out.println(grocery);
        grocery.add("sda");
        grocery.retainAll(List.of("sda"));
        System.out.println(grocery);
        grocery.clear();
        grocery.addAll(List.of("sad","fa","gfd", "ssdad","fgfga","gfdhy"));
        grocery.addAll(Arrays.asList("sad1", "fa2", "gfd3", "ssdad4", "fgfga5", "gfdhy6"));
        System.out.println(grocery);
        var groceryarray = grocery.toArray(new String[grocery.size()]);
        System.out.println(Arrays.toString(groceryarray));
        System.out.println(groceryarray[0]);

//        var listone = List.of("sunday", "monday", "Tuesday");
//        System.out.println(listone);
        String[] days = new String[]{"sunday","monday","tuesday"};
        List <String> listone = List.of(days);
        System.out.println(listone);
    }
}