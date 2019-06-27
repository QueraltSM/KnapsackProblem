public class Item implements Comparable <Item> {
    private int weight;
    private int price;

    public Item() {}
    public Item (int weight, int price) {
        this.weight = weight;
        this.price = price;
    }
    public int getWeight() {
        return weight;
    }
    public int getPrice() {
        return price;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public int compareTo(Item i) {
        if (weight < i.getWeight()) return -1;
        if (weight > i.getWeight()) return 1; 
        return 0;
    }
}