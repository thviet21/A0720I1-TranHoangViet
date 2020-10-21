package _b9_dsa_arraylist_linkedlist.homework.myarraylist;

public class TestMyArrayList {
    static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
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
    }

    public static void main(String[] args) {
        Student student1 = new Student(1,"Ken");
        Student student2 = new Student(2,"HHH");
        Student student3 = new Student(3,"AAA");
        Student student4 = new Student(4,"FAA");
        Student student5 = new Student(5,"SSA");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(student4);
        studentMyArrayList.add(student5,3);
//        studentMyArrayList.clear();
        System.out.println(studentMyArrayList.size());
        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student = (Student) studentMyArrayList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());

        }
    }
}
