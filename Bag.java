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
    
    private List<Item> calculateDollarPerKG(List<Item> items){
        List<Float> auxiliar = new ArrayList<>();
        List<Item> finalList = new ArrayList<>();
        for (Item item : items) {
            auxiliar.add((float)item.getPrice()/(float)item.getWeight());
        }
        Collections.sort(auxiliar, Collections.reverseOrder());
        for (int i = 0; i<auxiliar.size(); i++) {
            for (int j = 0; j<items.size(); j++) {
                if (auxiliar.get(i) == ((float)items.get(j).getPrice()/(float)items.get(j).getWeight())) finalList.add(items.get(j));
            }
        }
        return finalList;
    }
    
    public int getStrategy3(List<Item> items) {
        int finalWeight = 0;
        int finalPrice = 0;
        for (Item item : calculateDollarPerKG(items)) {
            if (item.getWeight() + finalWeight <= capacity) {
                finalWeight += item.getWeight();
                finalPrice += item.getPrice();
                System.out.println(item.getWeight());
            }
        }
        return finalPrice;
    }
}
