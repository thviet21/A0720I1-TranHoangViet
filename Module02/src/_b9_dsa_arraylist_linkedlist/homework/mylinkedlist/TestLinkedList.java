package _b9_dsa_arraylist_linkedlist.homework.mylinkedlist;

public class TestLinkedList {
    public static void main(String[] args) {

        class Student {
            private int id;
            private String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public Student() {
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
        MyLinkedList<Student> studentMyLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "Huy");
        Student student2 = new Student(2, "Hieu");
        Student student3 = new Student(3, "Khuy");
        Student student4 = new Student(4, "Thuy");
        Student student5 = new Student(4, "Thuy");

        studentMyLinkedList.addFirst(student1);
        studentMyLinkedList.addFirst(student2);
        studentMyLinkedList.addLast(student3);
        studentMyLinkedList.add(2,student4);
//        studentMyLinkedList.remove(student2);

//        MyLinkedList<Student> cloneMyLinkedList = studentMyLinkedList.clone();

//        for (int i = 0; i < studentMyLinkedList.size(); i++) {
//            Student student = (Student) studentMyLinkedList.get(i);
//            System.out.println(student.getName());
//        }

//        for (int i = 0; i < cloneMyLinkedList.size(); i++) {
//            Student student = (Student) studentMyLinkedList.get(i);
//            System.out.println(student.getName());
//        }

//        System.out.println(studentMyLinkedList.indexOf(student3));
        System.out.println(studentMyLinkedList.getFirst().getName());
        System.out.println(studentMyLinkedList.getLast().getName());
        studentMyLinkedList.clear();
    }


}
