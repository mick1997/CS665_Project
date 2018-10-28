package HR;

public class HRHeadQuarter extends Department implements HandleTask {

    // instance variable news, getStatus
    private String news;
    private String status;

    /**
     * @param: departName: String, departType: String, description: String, location: Location, timeDurationWork: int,
     *         news: String, getStatus: String
     * public HRHeadQuarter constructor
     * */
    public HRHeadQuarter(String departName, String departType, String description, Location location,
                         int timeDurationWork, String news, String status) {
        super(departName, departType, description, location, timeDurationWork);
        this.news = news;
        this.status = status;
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
