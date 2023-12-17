package access.ex;

public class MaxCounter {
    private int count;
    private final int max;

    public MaxCounter(int max) {
        this.max = max;
        this.count = 0;
    }

    public void increment() {
        if (isValidIncrease()) {
            count++;
            return;
        }
        System.out.println("Count is already max");
    }

    private boolean isValidIncrease() {
        return max > count;
    }

    public int getCount() {
        return count;
    }
}
