package class1.ex;

public class MovieReview {
    private final String name;
    private final String review;

    MovieReview(String name, String review) {
        this.name = name;
        this.review = review;
    }

    public String getName() {
        return name;
    }

    public String getReview() {
        return review;
    }

    public void getInfoMovie() {
        System.out.println("name, review = " + name + ", " + review);
    }
}