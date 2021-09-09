
import java.util.ArrayList;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> Items;

    public Suitcase(int maximumWeight) {
        this.Items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item Item) {

        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            return;
        }

        this.Items.add(Item);
    }

    public int totalWeight() {
        //1
        return this.Items.stream()
                .mapToInt(weight -> weight.getWeight())
                .sum();

    }

    public void printItems() {
        //2
        this.Items.stream()
                .forEach(item -> System.out.println(item));

    }

    public Item heaviestItem() {
        //3

        if (this.Items.isEmpty()) {
            return null;
        }

        return this.Items.stream()
                .max((i, j) -> i.getWeight() - j.getWeight())
                .get();
                        
    }

    @Override
    public String toString() {
        if (this.Items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.Items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }

        return this.Items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
