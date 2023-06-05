def user_input():
    ask = int(input("Выбери ниже\n 1 - записать пользователя в тлф книгу\n" "2 - поиск по имени \n" 
                    "3 - отсортировать справочник по имени\n"
                     "4 - удалить имя\n " "5- изменить имя\n"))
    return ask

def input_man():

    return str

def man(): 
                data = list()
                name = input("Введите имя: ")
                family = input("Введите фамилию: ")
                father = input ("Введите отчество: ")
                date = input("введите дату рождения ")
                phone = input("введите номер телефона")
                data.append(name, family, father, date, phone)
                return data
d = man()
print(d)

def search_man_name():
        str_search = input("Введите имя для поиска:")
        return str_search
def delete_datab_name():
        str_delete = input("удалите ненужные данные: ")
        return str_delete
def change_datab_name():
        str_change = input("введите новые данные: ")
        return str_change