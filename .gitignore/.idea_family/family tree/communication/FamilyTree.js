public class FamilyTree {
    private int id;
    private int humanId;
    private List<Human> humantList;

    public FamilyTree(int id) {
        this.id = id;
        familyList = new ArrayList<>();
    }

    public void addHuman(Human human){
        human.setId(humanId++);
        humanList.add(human);
    }

    public String getHumanInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список членов семьи:\n");
        for (Human human: List){
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}