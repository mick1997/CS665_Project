package HR;

public abstract class Department {

    // instance variable: departName: String, departType: String, description: String, location: Location, timeDurationWork: int
    private String departName;
    private String departType;
    private String description;
    private Location location;
    private int timeDurationWork;

    /**
     * @param: departName: String, departType: String, description: String, location: Location, timeDurationWork: int,
     * public Department constructor
     * */
    public Department(String departName, String departType, String description, Location location, int timeDurationWork) {

        this.departName = departName;
        this.departType = departType;
        this.description = description;
        this.location = location;

        // if employee work enough 8 hours, print appropriate message, else print warning message
        if (timeDurationWork >= 8) {
            this.timeDurationWork = timeDurationWork;
            System.out.println("All employees have worked " + this.timeDurationWork + " hours already!");
        }
        else {
            System.out.println("some employees have not worked enough time yet.");
        }
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
        return String.format("Department name: %s\nDepartment type: %s\n" + "Description: %s\nLocation: %s",
                getDepartName(), getDepartType(), getDescription(), getLocation());
    }
}
