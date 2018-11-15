package HR;

public class Service {

    // instance variable: name, id, price, description
    private String name;
    private String id;
    private int price;
    private String description;

    /**
     * @param: name: String, id: String, price: int, description: String
     * Service constructor
     * */
    public Service(String name, String id, int price, String description) {
        this.name = name;
        this.id  = id;
        this.price = price;
        this.description = description;
    }

    /**
     * @param: None
     * @return: String
     * get service name
     * */
    public String getName() {
        return name;
    }

    /**
     * @param: name: String
     * @return: None
     * set service name
     * */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param: None
     * @return: String
     * get service id
     * */
    public String getId() {
        return id;
    }

    /**
     * @param: id: String
     * @return: None
     * set service id
     * */
    public void setId(String id) {
        this.id = id;
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
     * print service information
     * */
    @Override
    public String toString() {
        return String.format("Service name: %s\nID: %s\nPrice: %s\ndescription: %s",
                getName(), getId(), getPrice(), getDescription());
    }
}
