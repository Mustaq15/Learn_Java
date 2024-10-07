package Assignment8;

public class Book implements Readable {
    private String title;
    private String author;
    private double price;
    private int publicationYear;

    // Constructor
    public Book(String title, String author, double price, int publicationYear) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title\t\t\t\t: " + title);
        System.out.println("Author\t\t\t\t: " + author);
        System.out.println("Price\t\t\t\t: \u20B9" + price);
        System.out.println("Publication Year\t: " + publicationYear);
    }

    // Method to calculate discounted price
    public double discountedPrice(double discountPercentage) {
        return price - (price * discountPercentage / 100);
    }

    @Override
    public void read() {
        System.out.println("Reading the book: " + title);
    }

    @Override
    public String getSummary() {
        return "Summary of the book: " + title;
    }
}

