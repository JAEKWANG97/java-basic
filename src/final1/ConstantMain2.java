package final1;

public class ConstantMain2 {
     public static void main(String[] args) {
        System.out.println("max user count in program " + Constant1.MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 : " + currentUserCount);
        if (currentUserCount > Constant1.MAX_USERS) {
            System.out.println("resist in waiting list");
            return;
        }
        System.out.println("join the game");
    }

}
