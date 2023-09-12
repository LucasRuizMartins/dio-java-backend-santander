package entities;

public class Music {

    private String name;
    private String artist;
    private Integer stars;
    private Double duration;

    public Music(String name, String artist, Integer stars, Double duration) {
        this.name = name;
        this.artist = artist;
        this.stars = stars;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }


}
