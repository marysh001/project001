

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.reflect.Array;

public class Program {
    public static void main(String[] args)
    { ArrayList <String> people = new ArrayList<>();
        for (int i = 0; i < people.size(); i+=2) {
        String temp = people.get(i) + " " + people.get(i + 1);
        String [] array = temp.split(regex: " ");
        System.out.println(array [0] + " " + array[1].toUpperCase().chArt(index:0)
         + "." + array[2].toUpperCase.chArt(index:0 + ". " + people.get(i + 1))

    Scanner iScanner = new Scanner (System.in);
    System.out.printf(format: " name, family, surname: ");
    String name = iScanner.nextLine();
    System.out.printf(format: "age, sex: ");
    String age = iScanner.nextLine();
    System.out.printf(format: "Hi, %s\n", name);
        }
    people.add(name);
    people.add(age);
    System.out.println(people);
    
    iScanner.close();
    }

    people.sort(new Comporator<String>(){
        @Override
        public int compare(String o1, String o2){
            return Integer.parceInt(o1.split(regex:" ") [3]) - Integer.parceInt(o2.split(regex: " ") [3]);
        }
    });

}