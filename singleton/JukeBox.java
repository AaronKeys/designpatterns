package singleton;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class JukeBox {
    private static JukeBox jukeBox;
    private static ArrayList<Song> songs = DataLoader.getSongs();;
    private static Queue<String> songQueue = new LinkedList<String>();
    
    private JukeBox() {}

    public static JukeBox getInstance() {
        if(jukeBox == null) {
            System.out.println("Creating a new jukebox");
            jukeBox = new JukeBox();
            if(songs == null) {
                System.out.println("Song's arraylist in jukebox is null");
            }
            for(Song song : songs) {
                songQueue.add(song.toString());
            }
        }
        return jukeBox;
    }

    public String playNextSong() {
        if(songQueue.remove() == null) {
            return "You need to add songs to the list";
        } else {
            return "Let's jam to " + songQueue.remove();
        }
    }

    public String requestSong(String title) {
        for(Song song : songs) {
            if (song.toString().contains(title)) {
                return title;
            }
        }
        return "Sorry we do not have the song " + title;
    }

    public boolean hasMoreSongs() {
        if(songQueue.remove() == null) {
            return false;
        } else {
            return true;
        }
    }
}
