package singleton;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class JukeBox {
    private static JukeBox jukeBox;
    private static ArrayList<Song> songs;
    private Queue<String> songQueue;
    
    private JukeBox() {
        /**
         * reading all songs from dataloader
         */
        jukeBox = new JukeBox();
        songs = DataLoader.getSongs();
        songQueue = new LinkedList<String>();
    }

    public static JukeBox getInstance() {
        return jukeBox;
    }

    public String playNextSong() {
        if(songs == null) {
            return "You need to add songs to the list";
        }
        return songQueue.remove();
    }

    public String requestSong(String title) {
        for(Song song : songs) {
            if (song.equals(title)) {
                return title;
            }
        }
        return "Sorry we do not have the song " + title;
    }

    public boolean hasMoreSongs() {
        return true;
    }
}
