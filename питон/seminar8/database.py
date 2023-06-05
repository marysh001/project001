import view
import database

def add_dat():
with open("datab.txt", "a") as file:
    file.write(data)
    print("телефонная книга обновлена")

    def search_name(name):
        with open("datab.txt", "r") as file:
       data = file.readlines()
    flag = False
    for i in data:
        if name in i:
            print (i)
            flag = True
            if flag == false ("Aбонент не найден\n")
            
            def sort_datab_data():
                with open("datab.txt","r") as file:
                    data = file.readlines()
                    data.sort(key= lambda x: x[4])
                    with open("datab.txt", "w") as file:
                        file.writelines(data)

                        def delete_datab_name():
                                  with open("datab.txt","r") as file:
                    data = file.readlines()
                    data.delete()
                    data.copy(key= lambda x: x[1])
                    with open("datab.txt", "w") as file:
                        file.writelines(data)
                        file.save(data)
                        print(file.read)

                         def change_datab_name():
                                  with open("datab.txt","r") as file:
                    data = file.writelines()
                    data.change()
                    data.copy(key= lambda x: x[1])
                    with open("datab.txt", "w") as file:
                        file.writelines(data)
                        file.save(data)
                        print(file.read)