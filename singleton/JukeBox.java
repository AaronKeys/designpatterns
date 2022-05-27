/**
 * @author Aaron L. Keys
 */
package singleton;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;


public class JukeBox {
    private static JukeBox jukeBox;
    private static ArrayList<Song> songs = DataLoader.getSongs();;
    private static Queue<String> songQueue = new LinkedList<String>();
    
    /**
     * creating a private constructor, so I can use a static instance
     */
    private JukeBox() {}

    /**
     * This method alerts the user of creating a new jukebox instance.
     * @return a static instance of the class, so I can call the jukebox
     * as an instance.
     */
    public static JukeBox getInstance() {
        if(jukeBox == null) {
            System.out.println("Creating a new jukebox");
            jukeBox = new JukeBox();
        }
        return jukeBox;
    }
    /**
     * This method looks at the next song and returns null if empty,
     * else it will return the next song in the queue.
     * @return the next song in the queue.
     */
    public String playNextSong() {
        if(songQueue.peek() == null) {
            return "You need to add songs to the list";
        } else {
            return "Let's jam to " + songQueue.remove();
        }
    }

    /**
     * This method returns a string, letting the user know
     * the title of the song and the group who plays it. If
     * the song isn't present in the list, the user is made
     * aware of its absence.
     * @param title is the name of the song
     * @return the title of the song and the group who plays it.
     */
    public String requestSong(String title) {
        int count = songQueue.size();
        for(Song song : songs) {
            if (song.toString().contains(title)) {
                songQueue.add(song.toString());
                return title + " is now " + ++count + " on our list";
            }
        }
        return "Sorry we do not have the song " + title;
    }
    /**
     * This method allows the program to go through the queue until
     * there is no longer a song in the queue.
     * @return a boolean value that shows whether there is a song
     * or not still in the queue.
     */
    public boolean hasMoreSongs() {
        if(songQueue.peek() == null) {
            return false;
        } else {
            return true;
        }
    }
}
