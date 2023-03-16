


int a,m,n;
Console.Write($"Введите количество строк: ");
int.TryParse(Console.ReadLine()!, out m)
Console.Write($"Введите количество столбцов: ");
int.TryParse(Console.ReadLine()!, out n)
Console.Write($"Введите числа: ");
int.TryParse(Console.ReadLine()!, out i)

int [,] array = new int[m, n];

for (int i = 0;i < array.GetLength(0); i++)
{
    for (int j = 0; j< array.GetLength(3); j++)
    {
        array [i, j] = new ().Next(3);
        Console.Write($"{array [i,j]}");
    }
Console.WriteLine();
}