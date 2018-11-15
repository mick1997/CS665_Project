package HR;

public class Service {

    private String name;
    private String id;
    private int price;
    private String description;

    public Service(String name, String id, int price, String description) {
        this.name = name;
        this.id  = id;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return String.format("Service name: %s\nID: %s\nPrice: %s\ndescription: %s",
                getName(), getId(), getPrice(), getDescription());
    }
}
