public class Books {
    private String title;
    private int pages;
    private int year;

    // start of overloaded constructors:
    public Books () {
        this.title = "";
        this.pages = 0;
        this.year = 0;
    }
    
    public Books (String title) {
        this.title = title;
        this.pages = 0;
        this.year = 0;
    }

    public Books (int year) {
        this.title = "";
        this.pages = 0;
        this.year = year;
    }

    public Books (int year, String title) {
        this.title = title;
        this.pages = 0;
        this.year = year;
    }

    public Books (String title, int pages) {
        this.title = title;
        this.pages = pages;
        this.year = 0;
    }

    // end of overloaded constructors!

    public Books (String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return getTitle() + ", " + getPages() + " pages, " + getYear();
    }
}