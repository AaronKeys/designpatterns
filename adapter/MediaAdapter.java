package adapter;

import java.util.ArrayList;
import java.util.Date;
import java.time.format.DateTimeFormatter;

public class MediaAdapter implements Media {
    
    private LittleMedia littleMedia;

    public MediaAdapter(LittleMedia littleMedia) {
        this.littleMedia = littleMedia;
    }

    public String getTitle() {
        return littleMedia.getTitle();
    }
    
    public Author getAuthor() {
        String authorName = littleMedia.getAuthor();
        String[] fullName = authorName.split(" ", 2);
        String aFirstName = fullName[0];
        String aLastName = fullName[1];
        Author author = new Author(aFirstName, aLastName);

        return author;
    }

    public String getDescription() {
        return littleMedia.getDescription();   
    }

    public void addReview(String firstName, String lastName, Date date, double rating, String comment) {

    }

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
            //String formattedDate = dateFormatter.format(formatDate);
            Review re = new Review(firstName, lastName, formattedDate, Double.parseDouble(rating), comment);
            r.add(re);
        }
        return r;
    }
}
