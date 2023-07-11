package family_tree;
import java.util.Comparator;

public class AgeIterator implements Iterator<Human>{
    @Override
    public int iterate(Human o1,Human o2 ){
        return Integer.iterate(o1.age, o2.age);
    }
}