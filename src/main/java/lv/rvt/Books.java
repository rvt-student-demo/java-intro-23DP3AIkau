package lv.rvt;

public class Books {
    private String title;
    private int pages;
    private int year;

    public Books(String initialTitle, int initialPages, int initialYear) {
        this.title = initialTitle;
        this.pages = initialPages;
        this.year = initialYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
}
