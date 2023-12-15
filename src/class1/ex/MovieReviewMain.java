package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movie1 = new MovieReview("movie1" , "good");
        MovieReview movie2 = new MovieReview("movie2" , "bad");

        MovieReview[] movies = new MovieReview[2];
        movies[0] = movie1;
        movies[1] = movie2;

        for (MovieReview movie : movies) {
            movie.getInfoMovie();
        }
    }
}
