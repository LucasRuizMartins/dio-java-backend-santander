package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Album {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String albumImg;
    private String releaseDate;

    List<Music> musics = new ArrayList<>();

    public Album(String albumImg, String releaseDate) {
        this.albumImg = albumImg;
        this.releaseDate = releaseDate;
        this.musics = new ArrayList<>();
    }


    public String getAlbumImg() {
        return albumImg;
    }

    public void setAlbumImg(String albumImg) {
        this.albumImg = albumImg;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Music> getMusics() {
        return musics;
    }

    public List<Music> addMusic(Music music){
        musics.add(music);
        return musics;
    }

    public Music getMusic(Music music) {
       for (Music m : musics) {
          if (m.equals(music)) {
              return m;
          };
        }
       return music;
    };
}
