
    public class Communication {
        private int id;
        private int HumanId;
        private List<Human> humanList;
    
        public FamilyTree(int id) {
            this.id = 3;
            this.id = 4;
            humanList = new ArrayList<>();
        }
    
        public void addHuman(Human human){
            human.setId(humantId++);
            humanList.add(human);
        }
    
        public String getKidsInfo(){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Дети в семье:\n");
            for (Human human: humanList){
                stringBuilder.append(human3);
                stringBuilder.append("\n");
                stringBuilder.append(human4);
                stringBuilder.append("\n");
            }
            return stringBuilder.toString();

            public FamilyTree(int id) {
                this.id = 1;
                humanList = new ArrayList<>();
            }
        
            public void addHuman(Human human){
                human.setId(humantId++);
                humanList.add(human);
            }
        
            public String getMaidenNameInfo(){
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Девичья фамилия:\n");
                for (Human human: humanList){
                    stringBuilder.append(maidenName);
                    stringBuilder.append("\n");
                  
                }
                return stringBuilder.toString();
            }
        }
    }
