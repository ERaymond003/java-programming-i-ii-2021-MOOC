
import java.util.ArrayList;

public class Pipe<T> {

    private ArrayList<T> pipe;
    
    public Pipe() {
        this.pipe = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.pipe.add(value);
    }

    public T takeFromPipe() {
        if (this.pipe.isEmpty()) {
            return null;
        }
        T dumVar = this.pipe.get(0);
        this.pipe.remove(0);
        
        return dumVar;
    }

    public boolean isInPipe() {
        return !this.pipe.isEmpty();
    }
}
