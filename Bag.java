import java.util.*;

public class Bag {
    private List<Item> items = new ArrayList<Item>();
    private int capacity;
    
    public Bag(int capacity) {
        this.capacity = capacity;
    }
    
    public int getStrategy1(List<Item> items) {
        int finalWeight = 0;
        int finalPrice = 0;
        Collections.sort(items, Collections.reverseOrder());
        for (Item item : items) {
            if (item.getWeight() + finalWeight <= capacity) {
                finalWeight += item.getWeight();
                finalPrice += item.getPrice();
                System.out.println(item.getWeight());
            }
        }
        return finalPrice;
    }
    
    public int getStrategy2(List<Item> items) {
        int finalWeight = 0;
        int finalPrice = 0;
        Collections.sort(items);
        for (Item item : items) {
            if (item.getWeight() + finalWeight <= capacity) {
                finalWeight += item.getWeight();
                finalPrice += item.getPrice();
                System.out.println(item.getWeight());
            }
        }
        return finalPrice;
    }
}

















