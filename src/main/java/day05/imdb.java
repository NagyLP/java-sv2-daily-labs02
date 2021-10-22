package day05;

public class imdb {

    public static void main(String[] args) {
        Movie movie = new Movie("Star Wars", 1979);


        System.out.println(movie.rateMovie(4));
        System.out.println(movie.rateMovie(5));
        System.out.println(movie.rateMovie(4));

        Viewer viewer = new Viewer();
                viewer.watchMovie(movie, 5);

        System.out.println(movie.getAtlagosErtekeles());

    }
}
