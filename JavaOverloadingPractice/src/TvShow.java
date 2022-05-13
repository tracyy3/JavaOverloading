public class TvShow {

    private String showName;
    private int episodes;
    private String genre;

    // Start of Overloaded Constructors:
    public TvShow () {
        this.showName = "";
        this.episodes = 0;
        this.genre = "";
    }

    public TvShow (String showName) {
        this.showName = showName;
        this.episodes = 0;
        this.genre = "";
    }

    public TvShow (String showName, int episodes) {
        this.showName = showName;
        this.episodes = episodes;
        this.genre = "";
    }

    public TvShow (int episodes, String genre) {
        this.showName = "";
        this.episodes = episodes;
        this.genre = genre;
    }

    public TvShow (String showName, String genre) {
        this.showName = showName;
        this.episodes = 0;
        this.genre = genre;
    }
    // End of Overloaded Constructors!

    public TvShow(String showName, int episodes, String genre) {
        this.showName = showName;
        this.episodes = episodes;
        this.genre = genre;
    }

    public String getShowName() {
        return showName;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The show's name is " + getShowName() + " with " + getEpisodes() + " episodes. The genre of the show is " + getGenre() + ".";
    }
}