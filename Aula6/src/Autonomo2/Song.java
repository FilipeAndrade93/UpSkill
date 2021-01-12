package Autonomo2;

public class Song {

    private String title;
    private String artist;
    private int duration;

    public Song(String title, String artist, int duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    public int secsToMinutes(){
        int minutes = getDuration() / 60;
        return minutes;
    }

    public int remainSecs(){
        int seconds = getDuration() % 60;
        return seconds;
    }

    @Override
    public String toString() {
        return  "Song: " + title + " by " + artist + " - " + secsToMinutes() + ":" + remainSecs();
    }
}
