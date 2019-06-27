import java.util.*;
public class Main {
    static Bag bag = new Bag(10);
    static Item item1 = new Item(8,13);
    static Item item2 = new Item(3,7);
    static Item item3 = new Item(5,10);
    static Item item4 = new Item(2,1);
    static Item item5 = new Item(2,1);
    static Item item6 = new Item(2,1);
    static List<Item> items = new ArrayList<Item>();
    
    public static void main(String[] args){
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        System.out.println("Strategy 1 - First the highest value: ");
        System.out.println("Total price = " + bag.getStrategy1(items));
    }
}
