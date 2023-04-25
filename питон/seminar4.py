#Задача 22:# что хотела сделать(исправьте пожалуйста ошибки если есть синтаксические)
#сравнить элементы в списках 
#(в самом списке если равные элем найдутся - удаляем и между списками если равные эл найдутся- тоже удалим) 
#остальное выведем и отсортируем от меньшего к большему

for i in range (list1, list2)
if list1[i] = list2[i]
del(i)
for i in range (list1, list2)
if list1[i] = list1[i + 1] or list2[i] = list2[i + 1]
del(i)
list1.sort()
list2.sort()

list1 =[1,27,7,7,45,14,10,8]
list2 = [78,3,2,44,1,2,9,11]

#Задача 23
n = int(input())
array = list()
for i in range (n):
    x = int(input())
    arr.append(x)

for i in range (len(array - 1)):
    array_count.append(array [i - 1] + array[i] + array [i + 1])
    array_count.append(array [i + 2] + array[-1] + array[0])
    print (max(array_count))