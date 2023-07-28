public class interaction {
    public static void main(String[] args) {
        Human human = new Human();
        human.viewInfo();

    }
}

interface View {
    void print(String text);
}

class ConsoleView implements View {
    public void print(String text) {
        String result = String.format("ConsoleView %s", text);
        System.out.println(result);
    }
}

class WinFormView implements View {
    public void print(String text) {
        String result = String.format("WinFormView %s", text);
        System.out.println(result);
    }
}

class Human {
    View view;

    int indexPage;

    public Human() {
        this.view = new ConsoleView();
        indexHuman = 1;
    }

    public void viewParents() {
        view.print("Родители");
    }

    public void viewBirthDate() {
        view.print("Дата рождения");
    }

 
}