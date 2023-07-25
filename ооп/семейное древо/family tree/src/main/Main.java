package family_tree;

import java.time.LocalDate;
import java.util.List;
import ui.ConsoleUI;
import ui.DesktopUI;
import ui.View;
import weather_api.Connection;

public class Main {
    public static void main(String[] args) {
        View view = new DesktopUI();
        view.start();
    }
}


public class Main implements Serializable {
    public static void main(String[] args){
        FamilyTree =  new FamilyTree();
        
        tree.add(new human(name: "Евгений", Gender.Male, Localdate.of(year:1963, month 12, dayOfMonth:10)));
        tree.add(new human(name: "Александра", Gender.Female, Localdate.of(year:1971, month 1, dayOfMonth:8)));
        tree.add(new human(name: "Антон", Gender.Male, Localdate.of(year:1997, month 5, dayOfMonth:14),
            tree.getByName("Евгений"), tree.getByName("Александра")));
        tree.add(new human(name: "Оля", Gender.Female, Localdate.of(year:1999, month 8, dayOfMonth:12),
        tree.getByName("Евгений"), tree.getByName("Александра")));
    System.out.println(tree.getInfo());

        
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("human.out"));
        objectOutputStream.writeObject(Евгений);
        objectOutputStream.writeObject(Александра);
        objectOutputStream.writeObject(Антон);
        objectOutputStream.writeObject(Оля);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("human.out"));
        Person ЕвгенийRestored = (Person) objectInputStream.readObject();
        Person АлександраRestored = (Person) objectInputStream.readObject();
        Person АнтонRestoredFromByte = (Human) objectInputStream.readObject();
        Person ОляRestoredFromByte = (Human) objectInputStream.readObject();
        objectInputStream.close();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream2.writeObject(Евгений);
        objectOutputStream2.writeObject(Александра);
        objectOutputStream2.writeObject(Антон);
        objectOutputStream2.writeObject(Оля);
        objectOutputStream2.flush();

    
        ObjectInputStream objectInputStream2 = new ObjectInputStream(
                new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        Person ЕвгенийRestoredFromByte = (Human) objectInputStream2.readObject();
        Person АлександраRestoredFromByte = (Human) objectInputStream2.readObject();
        Person АнтонRestoredFromByte = (Human) objectInputStream2.readObject();
        Person ОляRestoredFromByte = (Human) objectInputStream2.readObject();
        objectInputStream2.close();

        System.out.println("Before Serialize: " + "\n" + Евгений  + "\n" + Александра + "\n" + Антон + "\n" + Оля );
        System.out.println("After Restored From Byte: " + "\n" + ЕвгенийRestoredFromByte + "\n" + АлександраRestoredFromByte + 
        "\n" + АнтонRestoredFromByte + "\n" + ОляRestoredFromByte);
        System.out.println("After Restored: " + "\n" + ЕвгенийRestored + "\n" + АлександраRestored + "\n" + АнтонRestored + 
        "\n" + ОляRestored );
    }
}