public class Book {
    private String title;
    private int pages;
    private double rating;

    public Book(String bookTitle, int totalPages, double bookRating){
        title = bookTitle;
        pages = totalPages;
        rating = bookRating;
    }

    public void Info(){
        System.out.println("The Book Title is: " + title);
        System.out.println("There are " + pages + " pages in this book");
    }
    public void Rating() {
        System.out.println("This Book has a rating of " + rating);

    }
}
