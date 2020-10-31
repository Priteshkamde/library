package theBombayBookStore.model;

public class Review {
    private String userName;
    private int userRating;
    private boolean isApproved;

    protected Review() {
    }

    public Review(String userName, int userRating, boolean isApproved) {
        this.userName = userName;
        this.userRating = userRating;
        this.isApproved = isApproved;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserRating() {
        return userRating;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }
}
