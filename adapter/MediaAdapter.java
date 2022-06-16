/**
 * @author Aaron L. Keys
 */
package adapter;

import java.util.ArrayList;
import java.util.Date;
import java.time.format.DateTimeFormatter;

public class MediaAdapter implements Media {
    /**
     * Declaring class variable.
     */
    private LittleMedia littleMedia;
    /**
     * Constuctor method to pass the media upon use.
     * @param littleMedia passes a type of media that
     * will be used to convert to the newer system.
     */
    public MediaAdapter(LittleMedia littleMedia) {
        this.littleMedia = littleMedia;
    }
    /**
     * Returning the title of the media (book)
     * @return a String representing the title of the book.
     */
    public String getTitle() {
        return littleMedia.getTitle();
    }
    /**
     * Getting the author of the book.
     * @return an Author class variable, which is
     * the author of the book.
     */
    public Author getAuthor() {
        String authorName = littleMedia.getAuthor();
        String[] fullName = authorName.split(" ", 2);
        String aFirstName = fullName[0];
        String aLastName = fullName[1];
        Author author = new Author(aFirstName, aLastName);

        return author;
    }
    /**
     * Getting the description of the book.
     * @return a String of the description of the book.
     */
    public String getDescription() {
        return littleMedia.getDescription();   
    }
    /**
     * Adding a review to the LittleMedia class, which will then
     * be used to add to the new system.
     * @param firstName , which is the first name of the author of the review.
     * @param lastName , which is the last name of the author of the review.
     * @param date , which is the date that the comment was written.
     * @param rating , is the rating of the book from the user.
     * @param comment , a comment that someone made on the book.
     */
    public void addReview(String firstName, String lastName, Date date, double rating, String comment) {
        Review review = new Review(firstName, lastName, date, rating, comment);
        littleMedia.addReview((firstName + " " + lastName), date, (int)Math.ceil(rating), comment);
    }
    /**
     * Getting the reviews of the book
     * @return an ArrayList of Reviews
     */
    public ArrayList<Review> getReviews() {
        ArrayList<String> reviewList = littleMedia.getReviews();
        ArrayList<Review> r = new ArrayList<Review>();
        
        for(String review : reviewList) {            
            //reviews.add(rating + " stars - " + comment + " by " + userName + " - " + formattedDate); 
            String[] reviewMessage = review.split(" by "); //splitting review in half
            String by = reviewMessage[0]; //first half of review
            String untilFormDate = reviewMessage[1]; //last half of review
            String[] ratingMessage = by.split(" stars - "); //splitting first half of message in half again.
            String rating = ratingMessage[0]; //review up to " stars - " //part 1
            String comment = ratingMessage[1]; // review from " stars - " to " by " //part 2
            String[] username = untilFormDate.split(" - "); //splitting between username and formatted date
            String fullname = username[0];
            String formatDate = username[1]; //part 5
            String[] userFullName = fullname.split(" ");
            String firstName = userFullName[0]; //part 3
            String lastName = userFullName[1]; // part 4
            Date formattedDate = new Date(formatDate);

            Review re = new Review(firstName, lastName, formattedDate, Double.parseDouble(rating), comment);
            r.add(re);
        }
        return r;
    }
}
