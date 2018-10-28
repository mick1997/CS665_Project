package HR;

public class HRSiteJapan extends Department implements HandleTask {

    // instance variable news, getStatus
    private String news;
    private String status;

    /**
     * @param: departName: String, departType: String, description: String, location: Location, timeDurationWork: int,
     *         news: String, getStatus: String
     * public HRSiteJapan constructor
     * */
    public HRSiteJapan(String departName, String departType, String description, Location location,
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
        HRHeadQuarter.getStatus(status);
    }

    /**
     * @param: None
     * @return: String format
     * print the Europe site of Human Resource information
     * */
    @Override
    public String toString() {
        return String.format("The new Announcement for today is: %s\n", newsAnnounce()) + super.toString();
    }
}
