public class Name extends Human
public class Name{
    private int id;
    private String name;

    public Human(String name)
    {
        this.name = name;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "id: " + id + "имя" + name;
    }
}