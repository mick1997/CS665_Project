package HR;

public class GeneralMarketing extends Department implements HandleAllTask {

    private String message;
    private String Campaige;

    /**
     * @param: departName: String, departType: String, description: String, location: Location, timeDurationWork: int,
     * public Department constructor
     */
    public GeneralMarketing(String departName, String departType, String description, Location location,
                            int timeDurationWork, String message) {
        super(departName, departType, description, location, timeDurationWork);
        this.message = message;
    }

    @Override
    public String newsAnnounce() {
        String socialMedia1 = "FaceBook";
        String socialMedia2 = "Twitter";
        String socialMedia3 = "SnapChat";
        String socialMedia4 = "Instagram";
        return message; 
    }

    @Override
    public void employStatus() {}

    @Override
    public double getPayment() {
        return 0;
    }

//    public int adsCampaign() {
//
//
//    }
}
