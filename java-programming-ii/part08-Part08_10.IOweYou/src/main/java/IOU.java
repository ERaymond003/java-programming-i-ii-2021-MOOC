import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> IOUHashMap;
    
    public IOU() {
        this.IOUHashMap = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        this.IOUHashMap.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.IOUHashMap.getOrDefault(toWhom, 0.0);
    }
    
}
