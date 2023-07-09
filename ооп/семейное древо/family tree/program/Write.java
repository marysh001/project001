import java.util.Scanner;
  
public class Write {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Bведите имя: ");
        String name = in.nextLine();
        System.out.print("Введите пол: ");
        String gender = in.nextLine();
        System.out.print("введите год рождения: ");
        int year = in.nextInt();
        System.out.print("введите месяц рождения: ");
        int year = in.nextInt();
        System.out.print("введите день рождения: ");
        int year = in.nextInt();
        System.out.printf("Имя: %s Пол: %s  год: %d  месяц: %d день: %d \n", name, age, height);
        in.close();
    }
}

 //еще вариант, толко тут непонятно как сделать ввод от пользователя
import java.io.*;
 
public class Program {
  
    public static void main(String[] args) {
          
        String text = "Евгений 37 1976"; // строка для записи дальше создадим файл куда все это положим
        try(FileOutputStream fos=new FileOutputStream("Data.java"))
        {
            // перевод строки в байты
            byte[] buffer = text.getBytes();
              
            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        }
        catch(IOException ex){
              
            System.out.println(ex.getMessage());
        }
    }
}
