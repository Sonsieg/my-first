public class Student
{

        private int id;
        private String name;
        private String group;
        private String email;
        public Student() {
        }

        public Student(int id, String name, String group,String email) {
            this.id = id;
            this.name = name;
            this.group=group;
            this.email=email;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String setGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group=group;
        }
    }
