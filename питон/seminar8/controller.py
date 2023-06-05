import view
import database

def main():
    while True:
        ask =view.user_input()
        if ask == 1:
            data = view.man()
            database.add_dat(data)
elif ask == 2:
name = view.search()
database.search_name(name)
elif ask == 3:
name = view.search()
database.search_name(name)
elif ask == 3:
database.sort_datab_name()
elif ask == 4:
database.delete_datab_name()
elif ask == 5:
database.change_datab_name()
break

            