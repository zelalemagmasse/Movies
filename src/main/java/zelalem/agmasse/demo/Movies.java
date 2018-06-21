package zelalem.agmasse.demo;

public class Movies {
    private long id;
    private String title;
    private int yearOfRelease;
    private String director;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "title='" + title + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", director='" + director + '\'' +
                '}';
    }
}
