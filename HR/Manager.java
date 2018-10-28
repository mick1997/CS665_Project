package HR;

public class Manager implements EmployeeRole {

    // instance variable empID, title, supervisor, description, department
    private String empID;
    private String title;
    private String supervisor;
    private String description;
    private String department;

    /**
     * @param: empID: String, title: String, description: String, department: String, supervisor: String
     * public Manager constructor
     * */
    public Manager(String empID, String title, String description, String department, String supervisor) {

        this.empID = empID;
        this.title = title;
        this.description = description;
        this.department = department;
        this.supervisor = supervisor;
    }

    /**
     * @param: None
     * @return: empID: String
     * */
    @Override
    public String getEmployID() {
        return empID;
    }

    /**
     * @param: None
     * @return: title: String
     * */
    @Override
    public String getEmployTitle() {
        return title;
    }

    /**
     * @param: None
     * @return: description: String
     * */
    @Override
    public String description() {
        return description;
    }

    /**
     * @param: None
     * @return: department: String
     * */
    @Override
    public String getDepartment() {
        return department;
    }

    /**
     * @param: None
     * @return: supervisor: String
     * */
    @Override
    public String getSupervisor() {
        return supervisor;
    }

    /**
     * @param: None
     * @return: String format
     * print Managers' information
     * */
    @Override
    public String toString() {

        return String.format("\nManager:\nEmployee ID: %s\nTitle: %s\nSupervisor: %s\nDescription: %s\nDepartment name: %s\n",
                            getEmployID(), getEmployTitle(), getSupervisor(), description(), getDepartment());
    }
}
