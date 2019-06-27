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
        for (int i = 0; i<items.size(); i++) {
            int actualWeight = (items.get(i)).getWeight();
            Item res = items.get(i);
            for (int j = i+1; j<items.size(); j++) {
                int nextWeight = (items.get(j)).getWeight();
                if (actualWeight < nextWeight) {
                    res.setWeight(nextWeight);
                    res.setPrice((items.get(j)).getPrice());
                }
            }
            if (finalWeight + res.getWeight() <= capacity) {
                finalWeight += res.getWeight();
                finalPrice += res.getPrice();
                System.out.println(res.getWeight());
            }
        }
        return finalPrice;
    }
}

















