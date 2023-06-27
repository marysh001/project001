
public class Program {
    public static void main(String[] args)
    {

Map<Integer, String> dict1 = new HashMap<>();
Map<Integer> dict2 = new HashMap<>();
dict1.put(0, "Света");
dict1.put(1, ":Женя");
dict1.put(2, "Вера");
dict1.put(3, "Миша");

System.out.println(dict1);

dict2.put(0, "844627921");
dict2.put(1, "893927492", "83220028420");
dict2.put(2, "828469220");
dict2.put(3, "829201123");

System.out.println(dict2);


   for (int i : dict1.keySet()){
    if (dict2.containsKey(i)){
        System.out.println(dict1.get(i) + " " + dict2.get(i));
    }
    dict2.sort(new Comporator<Integer>(){
        @Override
        public int compare(String o1, String o2){
            return Integer.parceInt(o1.split(regex:" ") [3]) - Integer.parceInt(o2.split(regex: " ") [3]);
        }
   )};
 }}