Задание 2
public class Task2 {

    Random r = new Random();

    public static void main(String[] args) {

        int[] intArray = intArr();
            try {
               int d = 0;  
                double catchedRes1 = (double) intArray[3] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } catch (ArithmeticException e) {
                System.err.println("Catching exception: " + e);
            }catch (ArrayIndexOutOfBoundsException e){
                System.err.println("Выход за предел массива: " + e);
            }
    }

    public static int[] intArr() {
        Random r = new Random();
        int[] intArray = new int[r.nextInt(1,15)];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = r.nextInt(1, 100);   
        }
        return intArray;
    }
}
Задание 3

public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } 
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }

public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}
