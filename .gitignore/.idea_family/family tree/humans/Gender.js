public class Gender extends Human
public class Gender{
    private int id;
    private String gender;

    public Human(String gender)
    {
        this.gender = gender;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return: "id: " + id,  "пол" + gender;
    }
}