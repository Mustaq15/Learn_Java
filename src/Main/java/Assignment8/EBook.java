package Assignment8;


public class EBook extends Book {
    private double fileSize;

    // Constructor
    public EBook(String title, String author, double price, int publicationYear, double fileSize) {
        super(title, author, price, publicationYear);
        this.fileSize = fileSize;
    }

    // Getter and Setter for fileSize
    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("File Size\t\t\t: " + fileSize + " MB");
    }

    // Overriding discountedPrice method

    @Override
    public double discountedPrice(double discountPercentage) { double
            additionalDiscount = discountPercentage + 10; 			// 10% higher discount foreBooks
        return super.discountedPrice(additionalDiscount);
    }


    /*
     * public double discountedPrice(double discountPercentage) { double basePrice =
     * super.getPrice(); // Assuming there's a method to get the base price double
     * discountedPrice = basePrice * (1 - discountPercentage / 100); double
     * finalPrice = discountedPrice * 0.90; // Applying an additional 10% discount
     * return finalPrice;
     *   }

     */


    @Override
    public void read() {
        System.out.println("Reading the eBook: " + getTitle());
    }

    @Override
    public String getSummary() {
        return "Summary of the eBook: " + getTitle();
    }
}
