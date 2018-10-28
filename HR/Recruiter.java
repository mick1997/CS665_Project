package HR;

import java.util.ArrayList;
import java.util.List;

public class Recruiter implements EmployeeRole {

    // instance variable empID, title, supervisor, description, department
    private String empID;
    private String title;
    private String supervisor;
    private String description;
    private String department;

    /**
     * @param: empID: String, title: String, supervisor: String
     * public Recruiter constructor
     * description with default message as String
     * department with default message as String
     * */
    protected Recruiter(String empID, String title, String supervisor) {

        this.empID = empID;
        this.title = title;
        this.description = "The recruiter takes care of new hired.";
        this.department = "Human Resource";
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
     * @return: None
     * print new hired employees as a list
     * */
    public static void getHired() {

        List<Employee> list = new ArrayList<>();

        System.out.println("New Hired Employee!!!");
        Employee newEmployee1 = new Employee.UserBuilder("Jerry", "Tong")
                                            .ssn("9876123645")
                                            .age(23)
                                            .gender("Male")
                                            .address("12 Pound Rd, MA Allston 02134")
                                            .email("jerry@gmail.com")
                                            .phone("7322273787")
                                            .ethnicity("Asian")
                                            .build();

        Employee newEmployee2 = new Employee.UserBuilder("Seam", "Fame")
                                            .ssn("213546987")
                                            .age(24)
                                            .gender("Male")
                                            .address("20 Pound Rd, MA Allston 02134")
                                            .email("seam@gmail.com")
                                            .phone("9173432876")
                                            .ethnicity("American Indian")
                                            .build();
        list.add(newEmployee1);
        list.add(newEmployee2);
        System.out.println(list);
    }

    /**
     * @param: None
     * @return: String format
     * print Recruiters' information
     * */
    @Override
    public String toString() {
        return String.format("\nRecruiter:\nEmployee ID is: %s\nTitle: %s\nSupervisor: %s\nDescription: %s\nDepartment name: %s\n",
                getEmployID(), getEmployTitle(), getSupervisor(), description(), getDepartment());
    }
}
