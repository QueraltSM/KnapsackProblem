public class Item{
    
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
}