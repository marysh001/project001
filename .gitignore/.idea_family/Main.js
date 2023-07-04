public static void main (String[] args)
{

    FamilyTree familyTree = new FamilyTree();

    Human human1 = new Dad("female", "27", "Helen");
    Human human2 = new Mother("male", "32", "John")
    Human human3 = new Daughter ("female", "14", "Mary")
    Human human4 = new Son ("male", "4", "Adam")

    familyTree.addHuman(human1);
    familyTree.addHuman(human2);
    familyTree.addHuman(human3);
    familyTree.addHuman(human4);
    System.out.println(familyTree.getHumansInfo());
    System.out.println(familyTree.getKidsInfo());
    System.out.println(familyTree.getMaidenNameInfo());
}
