#Задача 34
def select(f,col):
    return [f(x) for x in col]
def where (f, col):
    return [x for x in col if f(x) else print("Пам парам")]

data = [а, у, о, ы, и, э, я, ю, ё, е] 
res = select(int, data)
print (res)
res = where (lambda x: x == ai(data), res)
print("Парам пам-пам")

#Задача 36
def print_operation_table(operation,num_rows,num_columns):   
    for i in range(1,num_rows+1):
        print()
        for j in range(1,num_columns+1):
            print(operation(i,j), end="   ")

print_operation_table(lambda x, y: x * y,6,6)