package HR;

public abstract class Department {

    // instance variable: departName: String, departType: String, description: String, location: Location
    private String departName;
    private String departType;
    private String description;
    private Location location;

    /**
     * @param: departName: String, departType: String, description: String, location: Location
     * public Department constructor
     * */
    public Department(String departName, String departType, String description, Location location) {

        this.departName = departName;
        this.departType = departType;
        this.description = description;
        this.location = location;
    }

    /**
     * @param: None
     * @return: departName: String
     * */
    public String getDepartName() {
        return departName;
    }

    /**
     * @param: department: String
     * @return: None
     * */
    public void setDepartName(String departName) {
        this.departName = departName;
    }

    /**
     * @param: None
     * @return: departType: String
     * */
    public String getDepartType() {
        return departType;
    }

    /**
     * @param: departType: String
     * @return: None
     * */
    public void setDepartType(String departType) {
        this.departType = departType;
    }

    /**
     * @param: None
     * @return: description: String
     * */
    public String getDescription() {
        return description;
    }

    /**
     * @param: description: String
     * @return: None
     * */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param: None
     * @return: location: Location
     * */
    public Location getLocation() {
        return location;
    }

    /**
     * @param: None
     * @return: String format
     * print general Human Resource information
     * */
    @Override
    public String toString() {
        return String.format("\nDepartment name: %s\nDepartment type: %s\n" + "Description: %s\nLocation: %s",
                getDepartName(), getDepartType(), getDescription(), getLocation());
    }
}
