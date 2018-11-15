package HR;

public class Product {

    private String productName;
    private String productID;
    private int price;
    private String description;

    public Product(String productName, String productID, int price, String description) {

        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Product name: %s\nID: %s\nPrice: %s\nDescription: %s",
                getProductName(), getProductID(), getPrice(), getDescription());
    }
}
