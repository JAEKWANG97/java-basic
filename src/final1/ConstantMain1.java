package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("max user count in program " + 1000);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);

    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 : " + currentUserCount);
        if (currentUserCount > 1000) {
            System.out.println("resist in waiting list");
            return;
        }
        System.out.println("join the game");
    }
}
