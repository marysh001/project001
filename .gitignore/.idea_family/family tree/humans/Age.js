public class Age extends Human {
    private double volume;

    public Bottle(String name, double age) {
        super(name, age);
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    @Override
    public String toString() {
        return super.toString() + ", возраст " + age;
    }
}