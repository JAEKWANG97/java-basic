package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student("student1", 15, 90);
        Student student2 = new Student("student2", 16, 80);
        Student student3 = new Student("student3", 17, 70);

        Student[] students = new Student[3];

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (Student s : students){
            System.out.println(s.name);
        }

    }
}