package class1;

public class classStart2 {
    public static void main(String[] args) {
        String[] studentName = {"student1", "student2"};
        int[] age = {15, 16};
        int[] grade = {90, 80};

        for (int i = 0; i < studentName.length; i++) {
            System.out.println("StudentName, age , grade" + studentName[i]  + age[i] + grade[i]);
        }
    }
}
