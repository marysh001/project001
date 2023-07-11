package family_tree;
import java.util.Comparator;

public class GenderComparator implements Comparator<Human>{
    @Override
    public String compare(Human o1,Human o2 ){
        return String.compare(o1.gender, o2.gender);
    }
}