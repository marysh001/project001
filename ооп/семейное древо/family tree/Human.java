package family_tree;

public class Human {
    private String name;
    private Gender gender;
    private LocalDate birthdate;
    private LocalDate deathdate;
    private List<Human> parents;
    private List<Human> children;
    private Human spouse;

    public Human (String name, Gender gender, LocalDate birthdate,
     LocalDate deathdate, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        parents = new ArrayList<>();
        if (father != null){
            parents.add(father);
        }
        if (mother != null){
            parents.add(mother);
        } 
children = new ArrayList<>();
     }
     public Human (String name, Gender gender, LocalDate birthdate) {     
       this( name, gender, birthDate, deathDate: null, father: null; ,mother: null);
    }
    public Human (String name, Gender gender, LocalDate birthDate, 
    Human father, Human mother) {
        this (name, gender, birthDate, deathDate:null, father, mother)
    }

    public boolean addChild(Human child){
        if (!children.contains(child)){
            children.add(child);
            return true;
        }
        return false;
    }
    public String getName(){ return name; }
    public boolean add Parent(Human parent){
        if(!parents.contains(parent)){
            children.add(parent);
            return true;
        }
        return false;
    }
    public LocalDate getBirthDate() { return birthDate; }
    public LocalDate getDeathDate() { return deathDate; }

    public Human getFather() {
        for (Human parent: parents){
            if (parent.getGender() == gender.Male){
                return parent;
            }
        }
        return null;
    }
    public Human getMother() {
        for (Human parent: parents){
            if (parent.getGender() == gender.Female){
                return parent;
            }
        }
        return null;
    }
public List<Human> getParents() { return parents; }
public List<Human> getChildren() {return children; }

public void setBirthDate(LocalDate birthDate){ this.birthDate = birthDate; }
public void setDeathDate(LocalDate deathDate){ this.deathDate = deathDate; }

public Gender getGender() { return gender;}

@Override
public String toString() { return getInfo(); }
public String getInfo(){
    StringBuilder sb = new StringBuilder();
    sb.append("имя: ");
    sb.append(name);
    sb.append(", пол");
    sb.append(getGender());
    sb.append(", возраст: ");
    sb.append(getAge());
    sb.append(",");
    sb.append(GetMotherInfo());
    sb.append(",");
    sb.append(GetFatherInfo());
    sb.append(",");
    sb.append(GetChildrenInfo());
    return sb.toString();
}

public String getMotherInfo (){
    String res = "мать ";
    Human mother = getMother();
    if (mother != null){
        res += mother.getName();
    } else {
        res += "неизвестна";
    }
    return res;
}

public String GetFatherInfo(){
    Human father = getFather();
    if (father != null){
        res += father.getName();
    } else {
        res += "неизвестен";
    }
    return res;
}

public String GetChildrenInfo(){
    StringBuilder res = new StringBuilder();
    res.append("дети: ");
    if (children.size() != 0){
        res.append(children.get(0).getName());
        for (int i = 1; i< children.size(); i++) {
            res.append(", ");
            res.append(children.get(i).getName());
        }
    } else {
        res.append("отсутствуют");
    }

    return res.toString();

}

public int getAge(){
    if (deathDate == null){
        return getPeriod(birthDate, LocalDate.now());
    } else {
        return getPeriod(birthDate, deathDate);
    }
}
private int getPeriod(LocalDate birthDate, Localdate deathDate){
    Period diff = Period.between(birthDate, deathDate);
    return diff.getYears();
}

@Override
public boolean equals (Object obj) {
    if (this == obj) {
        return true;
    }
    if (!(obj instanceof Human)){
        return false;
    }
    Human human = (Human) obj;
    return human.getname().equals(getname());
}
}

