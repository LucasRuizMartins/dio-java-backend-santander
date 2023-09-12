package services;

import entities.Album;
import entities.Music;

public class MusicPlayer {
    private Integer volume;
    private Boolean musicOn = false;
    private Music musicPlayingNow;

    public void playMusic(Music music){
        musicOn = true;
        musicPlayingNow = music;
        checkMusicIsPlaying();
    }
    public void stopMusic(){
        musicOn = false;
        checkMusicIsPlaying();
    };
    public void selectMusic(Music music, Album album) {
        if(musicOn) {
            playMusic(music);
        }
        getMusic(album,music);
    };
    private void getMusic(Album album, Music music){
         playMusic(album.getMusic(music));
    }

    private void checkMusicIsPlaying(){
        if(!musicOn){
            musicPlayingNow = null;
            System.out.println("Sem música tocando ...");
        }
        else {
            System.out.println("A música " + musicPlayingNow.getName() + " está tocando");
        }
    }
}
