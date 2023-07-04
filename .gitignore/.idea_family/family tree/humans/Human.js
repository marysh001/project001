
Public class Human

{private int id;
private String name;
private double price;

public Human(String gender, double age, String name) {
    this.gender = name;
    this.age = age;
    this.name = name;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public String getGender() {
    return gender
}

public double getAge()
{
    return age
}

public void setAge(double age) {
    this.age = age;
}

@Override
public String toString() {
    return "id: " + id + ", пол: " + gender + "возраст"+ age + ", имя: " + name + "р.";
}
}