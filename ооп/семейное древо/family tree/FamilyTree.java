package family_tree;

import family_tree.human.Human;

import java.util.Iterator;
import java.util.List;

public class HumanIterator implements Iterator <Human>{
    private int index;
    private List<Human> humanList;

    public HumanIterator(List<Human> humanList){
        this.humanList = humanList;
    }

    @Override
    public boolean hasNext() { return index < humanList.size();}
    @Override 
    public Human next() {return humanList.get(index++);}
}

public class FamilyTree {
    private list<Human> humanList;

    public FamilyTree (List<Human> humanList)
    this.humanList = humanList;

StringBuilder sb = new StringBuilder();
sb.append("В дереве");
sb.append(humanList.size());
sb.append("объектов: \n");
for (Human human: humanList){
    sb.append(human);
    sb.append("\n");
}

return sb.toString();

@Override
public String toString() {return getInfo();}

@Override
public Iterator <Human> Iterator() {return new HumanIterator(HumanList);}

public void sortByName(){
    humanList.sort(new HumanComparatorByName());
}

public void sortByBirthDate() { humanList.sort (new HumanComporatorByBirthDate());}
}



