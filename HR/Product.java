package HR;

public class Product {

    // instance variable: productName, productID, price, description
    private String productName;
    private String productID;
    private int price;
    private String description;

    /**
     * @param: productName: String, productID: String, price: int, description: String
     * Product constructor
     * */
    public Product(String productName, String productID, int price, String description) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.description = description;
    }

    /**
     * @param: None
     * @return: String
     * get product name
     * */
    public String getProductName() {
        return productName;
    }

    /**
     * @param: productName: String
     * @return: None
     * set product name
     * */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @param: None
     * @return: String
     * get product id
     * */
    public String getProductID() {
        return productID;
    }

    /**
     * @param: productID: String
     * @return: None
     * set product id
     * */
    public void setProductID(String productID) {
        this.productID = productID;
    }

    /**
     * @param: None
     * @return: int
     * get price
     * */
    public int getPrice() {
        return price;
    }

    /**
     * @param: price: int
     * @return: None
     * set price
     * */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @param: None
     * @return: String
     * get description
     * */
    public String getDescription() {
        return description;
    }

    /**
     * @param: description: String
     * @return: None
     * set description
     * */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param: None
     * @return: None
     * print product information
     * */
    @Override
    public String toString() {
        return String.format("Product name: %s\nID: %s\nPrice: %s\nDescription: %s",
                getProductName(), getProductID(), getPrice(), getDescription());
    }
}
