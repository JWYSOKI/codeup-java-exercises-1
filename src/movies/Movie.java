package movies;
public class Movie {

    private String title;
    private String category;
    private int rating;

    public Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static Movie[] movieFinder = MoviesArray.findAll();

//   public static Input userInput = new Input();





}

