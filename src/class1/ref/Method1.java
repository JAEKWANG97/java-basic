package class1.ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "john", 3, 80);
        Student student2 = new Student();
        initStudent(student2, "Andy", 4, 90);


        printStudentInfo(student1);
        printStudentInfo(student2);


    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.age = age;
        student.name = name;
        student.grade = grade;
    }

    static void printStudentInfo(Student student){
        System.out.print("student.name = " + student.name);
        System.out.print(" student.age = " + student.age);
        System.out.println(" student.grade = " + student.grade);
    }
}
