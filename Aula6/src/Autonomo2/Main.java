package Autonomo2;

public class Main {

    public static void main(String[] args) {
        Song a = new Song("Echoes", "Pink Floyd",1415);
        Song b = new Song("Watcher of the Skies", "Genesis", 443);
        Playlist prog = new Playlist("Prog");

        prog.addSong(a);
        prog.addSong(b);

        System.out.println(prog.getName());

        prog.printPlaylist();

        System.out.println(prog);
    }
}
