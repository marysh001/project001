class Answer {
    public static void arrayOutOfBoundsException() {
    public static int [] array = new int[];
        System.out.println(getArrayLength(array, 3));
    }
    public static int getArrayLength(int[] array, int value){
        if(array.length < value){
            return -1;
        }
        return array.length;
    }
      
}

    public static void divisionByZero() {
    public static  int divide(int a, int b){
        if (b == 0 | a == 0) {System.err.println("На ноль делить нельзя");
                   return 0;
                   }
        return (a/b);
      } 
    }

    public static void numberFormatException() {
    int format{
      if (String() == int){System.err.println("В строке нельзя использовать число");

    }
}
    }
public class Printer {
    public static void main(String[] args){
        Answer ans = new Answer();
        try { .getArrayLength;
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try { divide (5,0);
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }

        try {
          ans.NumberFormatExeption();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}