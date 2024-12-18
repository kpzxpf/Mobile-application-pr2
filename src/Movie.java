class Movie {
    private String title;
    private int year;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Movie: " + title + " (" + year + ")");
    }
}
