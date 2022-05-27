/**
 * @author Aaron L. Keys
 */
package singleton;

public class Song {
    private String title;
    private String artist;
    
    /**
     * This constructor method takes the values given and
     * gives those values to the appropriate variable name. 
     * @param title is the name of the song's title.
     * @param artist is the name of the song's artist.
     */
    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    /**
     * This method let's the user know the name of the title and artist
     * of the song that's being played.
     */
    public String toString() {
        return title + " by " + artist;
    }
}
