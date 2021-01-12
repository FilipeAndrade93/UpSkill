package Autonomo2;

public class Playlist {

    private String name;
    Song[] list;

    public Playlist(String name){
        this.name = name;
        this.list = new Song[2];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSong(Song song){
        for (int i = 0; i < list.length; i++){
            if (list[i] == null){
                list[i]  = song;
                break;
            }
        }
    }

    public void removeSong(Song title){
        for (int i = 0; i < list.length; i++){
            if (list[i] != null){
                if (list[i].equals(title)) {
                    list[i] = null;
                }
            }
        }
    }

    public void printPlaylist(){
        for (int i = 0; i < list.length;i++){
            Song song = list[i];
            System.out.println(song);
        }
    }

    public int sumDuration(){
        int sum = 0;
        for (int i = 0; i < list.length; i++){
            Song song = list[i];
            sum = sum + song.getDuration();
        }
        return sum;
    }

    public int sumDurationMinutes(){
        int minutes = sumDuration() / 60;
        return minutes;
    }

    public int sumDurationRemainSecs(){
        int seconds = sumDuration() % 60;
        return seconds;
    }

    @Override
    public String toString() {
        return "The playlist " + name + " has a total duration of " + sumDurationMinutes() + ":" + sumDurationRemainSecs();
    }
}
