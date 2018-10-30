package HR;

public class HRHeadQuarter extends Department implements HandleTask {

    // instance variable news, getStatus
    private String news;
    private String status;
    private String empLevel;
    private int salary;

    /**
     * @param: departName: String, departType: String, description: String, location: Location, timeDurationWork: int,
     *         news: String, getStatus: String
     * public HRHeadQuarter constructor
     * */
    public HRHeadQuarter(String departName, String departType, String description, Location location,
                         int timeDurationWork, String news, String status, String empLevel) {
        super(departName, departType, description, location, timeDurationWork);
        this.news = news;
        this.status = status;
        this.empLevel = empLevel;
    }

    /**
     * @param: None
     * @return: news: String
     * */
    @Override
    public String newsAnnounce() {
        return news;
    }

    /**
     * @param: None
     * @return: None
     * get employee getStatus and print appropriate message
     * */
    @Override
    public void employStatus() {
        getStatus(status);
    }

    @Override
    public void getPay() {
        if (empLevel.equalsIgnoreCase("Manager")) {
            salray = 100;
        }
        else if (empLevel.equalsIgnoreCase("Recruiter")) {
            salray = 1000;
        }
        else if (empLevel.equalsIgnoreCase("Regular Employee")) {
            salray = 1000;
        }
    }

    @Override
    public void getEmpExpense() {

    }

    private boolean isHoliday() {

    }

    protected static void getStatus(String status) {

        switch (status) {
            case "Good":
                System.out.println("all of the employees status are good!");
                break;
            case "Terminated":
                System.out.println("some of the employees status are bad, need to be terminated immediately!!!");
                break;
            case "Retired":
                System.out.println("The employee status is retired already!");
                break;
        }
    }

    /**
     * @param: None
     * @return: String format
     * print the Head Quarter of Human Resource information
     * */
    @Override
    public String toString() {
        return String.format("The new Announcement for today is: %s\n", newsAnnounce()) + super.toString();
    }
}
