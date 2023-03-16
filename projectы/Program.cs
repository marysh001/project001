

namespace ConsoleApplication1
{
    class Program
    {
        // Рекурсивный метод
        
        static int sum(int i, int n)
        {
            int result;

            if (i == 1)
                return 1;
            if (n == 1)
                return 1;
                
            result =(iu,n)
            return (iu, n);
        }

        static void Main(string[] args)
        {
            label1
            Console.WriteLine("Введите число n: ");
            try
            {
                int i = int.Parse(Console.ReadLine());
                Console.WriteLine("{0}! = {1}");
            }
            catch (FormatException)
            {
                Console.WriteLine("Некорректное число");
                goto label1;
            }

            Console.ReadLine();
        }
    }
}

/*Задача 66: Задайте значения M и N. Напишите программу, 
которая найдёт сумму натуральных элементов в промежутке от M до N.
*/

namespace ConsoleApplication1
{
    class Program
    {
        // Рекурсивный метод
        
        static int sum(int m, int n)
        {
            
            int result;

            if (m == 1)
                return 1;
                if (n == 1)
                return 1;

            sum += (im,in);
            return sum;
        }

        static void Main(string[] args)
        { label1
            Console.WriteLine("Введите число n: ");
            try
            {
                int i = int.Parse(Console.ReadLine());
                Console.WriteLine("{0}! = {1}",i,sum(i, n));
            }
            catch (FormatException)
            {
                Console.WriteLine("Некорректное число");
                goto label1;
            }

            Console.ReadLine();
        }
    }
}
