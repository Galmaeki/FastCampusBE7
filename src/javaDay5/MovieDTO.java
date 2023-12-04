package javaDay5;

public class MovieDTO {
    private String title;
    private String major;
    private Integer runningTime;

    public Float getRating() {
        return rating;
    }

    public Integer getGenre() {
        return genre;
    }

    private Float rating;
    private Integer genre;

    public MovieDTO(String title, String major, Integer runningTime, Float rating, Integer genre) {
        this.title = title;
        this.major = major;
        this.runningTime = runningTime;
        this.rating = rating;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "영화 " + title +
                ", 주연: '" + major +
                "', 러닝타임: " + runningTime +
                ", 평점: " + rating +
                ", 장르: " + genre;
    }
}
