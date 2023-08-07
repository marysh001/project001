public class Task1 {
    public static void main(String[] args) throws Exception {
     String input = inputUser();
     boolean flag = inputCheck(input);
     while (!flag){
         input = inputUser();
         flag = inputCheck(input);
     }
     System.out.println(Float.parseFloat(input));
        System.out.println("Ура :) ");
    }

    public static String inputUser(){

        Scanner sc = new Scanner(System.in);
        System.out.println("строка не должна быть пустой\n =>");
        String input = sc.next();
        return input;
    }

    public static boolean inputCheck(String input) throws Exception {
        try {
            Float inputF = Float.parseFloat(input);
            return true;
        } catch (IOExeption e) {
            System.err.println("Неверный ввод");
            return false;
        }

    }
}