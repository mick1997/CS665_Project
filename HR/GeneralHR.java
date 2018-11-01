package HR;

public class GeneralHR extends Department implements HandleTask {

    // instance variable news, status
    private String news;
    private String status;

    /**
     * @param: departName: String, departType: String, description: String, location: Location, timeDurationWork: int,
     *         news: String, getStatus: String
     * public GeneralHR constructor
     * */
    public GeneralHR(String departName, String departType, String description, Location location, int timeDurationWork,
                     String news, String status) {
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

    public static void getSalary(String title, String country, String empLevel) {

        int fullTimeSalaryAvePerYr = 150000;
        int dividend = 1000;
        int baseSalaryPerHr = 15;
        
        if (empLevel.equals("1")) {
            if (country.equals("1")) {
                switch (title) {
                    case "Chief Executive Officer":
                        System.out.println("The Chief Executive Officer got paid $" + (fullTimeSalaryAvePerYr * dividend) / 12 + " per month.");
                        break;
                    case "President":
                        System.out.println("The President got paid $" + (fullTimeSalaryAvePerYr * dividend) / 12 + " per month.");
                        break;
                    case "Vice President":
                        System.out.println("The Vice President got paid $" + (fullTimeSalaryAvePerYr * dividend) / 12 + " per month.");
                        break;
                    case "Director":
                        System.out.println("The Director got paid $" + (fullTimeSalaryAvePerYr * dividend) / 12 + " per month.");
                        break;
                    case "Administrator":
                        System.out.println("The Administrator got paid $" + (fullTimeSalaryAvePerYr * dividend) / 12 + " per month.");
                        break;
                    case "General Manager":
                        System.out.println("The General Manager got paid $" + (fullTimeSalaryAvePerYr * dividend) / 12 + " per month.");
                        break;
                    case "Manager":
                        System.out.println("The Manager got paid $" + (fullTimeSalaryAvePerYr * dividend) / 12 + " per month.");
                        break;
                    default:
                        System.out.println("There is no such Title exists!!!");
                }
            }
            else if (country.equals("2")) {
                switch (title) {
                    case "Chief Executive Officer":
                        System.out.println("The Chief Executive Officer got paid $" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "President":
                        System.out.println("The President got paid $" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "Vice President":
                        System.out.println("The Vice President got paid $" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "Director":
                        System.out.println("The Director got paid $" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "Administrator":
                        System.out.println("The Administrator got paid $" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "General Manager":
                        System.out.println("The General Manager got paid $" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "Manager":
                        System.out.println("The Manager got paid $" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 1.31 + " per month.");
                        break;
                    default:
                        System.out.println("There is no such Title exists!!!");
                }
            }
            else if (country.equals("3")) {
                switch (title) {
                    case "Chief Executive Officer":
                        System.out.println("The Chief Executive Officer got paid ¥" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "President":
                        System.out.println("The President got paid ¥" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "Vice President":
                        System.out.println("The Vice President got paid ¥" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "Director":
                        System.out.println("The Director got paid ¥" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "Administrator":
                        System.out.println("The Administrator got paid ¥" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "General Manager":
                        System.out.println("The General Manager got paid ¥" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "Manager":
                        System.out.println("The Manager got paid ¥" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 113.25 + " per month.");
                        break;
                    default:
                        System.out.println("There is no such Title exists!!!");
                }
            }
        }
        else if (empLevel.equals("2")) {
            if (country.equals("1")) {
                switch (title) {
                    case "Chief Financial Officer":
                        System.out.println("The Chief Financial Officer got paid $" + (fullTimeSalaryAvePerYr * dividend) / 12 + " per month.");
                        break;
                    case "Chief Technical Officer":
                        System.out.println("The Chief Technical Officer got paid $" + (fullTimeSalaryAvePerYr * dividend) / 12 + " per month.");
                        break;
                    case "Chief Sales Officer":
                        System.out.println("The Chief Sales Officer got paid $" + (fullTimeSalaryAvePerYr * dividend) / 12 + " per month.");
                        break;
                    case "Chief Marketing Officer":
                        System.out.println("The Chief Marketing Officer got paid $" + (fullTimeSalaryAvePerYr * dividend) / 12 + " per month.");
                        break;
                    case "Chief HR Officer":
                        System.out.println("The Chief HR Officer got paid $" + (fullTimeSalaryAvePerYr * dividend) / 12 + " per month.");
                        break;
                    case "Chief Business Officer":
                        System.out.println("The Chief Business Officer got paid $" + (fullTimeSalaryAvePerYr * dividend) / 12 + " per month.");
                        break;
                    case "Chief Quality Officer":
                        System.out.println("The Chief Quality Officer got paid $" + (fullTimeSalaryAvePerYr * dividend) / 12 + " per month.");
                        break;
                    default:
                        System.out.println("There is no such Title exists!!!");
                }
            }
            else if (country.equals("2")) {
                switch (title) {
                    case "Chief Financial Officer":
                        System.out.println("The Chief Financial Officer got paid $" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "Chief Technical Officer":
                        System.out.println("The Chief Technical Officer got paid $" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "Chief Sales Officer":
                        System.out.println("The Chief Sales Officer got paid $" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "Chief Marketing Officer":
                        System.out.println("The Chief Marketing Officer got paid $" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "Chief HR Officer":
                        System.out.println("The Chief HR Officer got paid $" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "Chief Business Officer":
                        System.out.println("The Chief Business Officer got paid $" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "Chief Quality Officer":
                        System.out.println("The Chief Quality Officer got paid $" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 1.31 + " per month.");
                        break;
                    default:
                        System.out.println("There is no such Title exists!!!");
                }
            }
            else if (country.equals("3")) {
                switch (title) {
                    case "Chief Financial Officer":
                        System.out.println("The Chief Financial Officer got paid ¥" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "Chief Technical Officer":
                        System.out.println("The Chief Technical Officer got paid ¥" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "Chief Sales Officer":
                        System.out.println("The Chief Sales Officer got paid ¥" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "Chief Marketing Officer":
                        System.out.println("The Chief Marketing Officer got paid ¥" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "Chief HR Officer":
                        System.out.println("The Chief HR Officer got paid ¥" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "Chief Business Officer":
                        System.out.println("The Chief Business Officer got paid ¥" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "Chief Quality Officer":
                        System.out.println("The Chief Quality Officer got paid ¥" + ((fullTimeSalaryAvePerYr * dividend) / 12) * 113.25 + " per month.");
                        break;
                    default:
                        System.out.println("There is no such Title exists!!!");
                }
            }
        }
        else if (empLevel.equals("3")) {
            if (country.equals("1")) {
                switch (title) {
                    case "Senior Officer":
                        System.out.println("The Senior Officer got paid $" + (fullTimeSalaryAvePerYr / 12) / 2 + " bi-weekly.");
                        break;
                    case "Junior Officer":
                        System.out.println("The Junior Officer got paid $" + (fullTimeSalaryAvePerYr / 12) / 2 + " bi-weekly.");
                        break;
                    case "General Employee":
                        System.out.println("The General Employee got paid $" + (fullTimeSalaryAvePerYr / 12) / 2 + " bi-weekly.");
                        break;
                    case "Internship":
                        System.out.println("The Internship got paid $" + baseSalaryPerHr + " per hour");
                        break;
                    case "Contract":
                        System.out.println("The Contract got paid $" + baseSalaryPerHr + " per hour");
                        break;
                    default:
                        System.out.println("There is no such Title exists!!!");
                }
            }
            else if (country.equals("2")) {
                switch (title) {
                    case "Senior Officer":
                        System.out.println("The Senior Officer got paid $" + ((fullTimeSalaryAvePerYr / 12) / 2) * 1.31 + " bi-weekly.");
                        break;
                    case "Junior Officer":
                        System.out.println("The Junior Officer got paid $" + ((fullTimeSalaryAvePerYr / 12) / 2) * 1.31 + " bi-weekly.");
                        break;
                    case "General Employee":
                        System.out.println("The General Employee got paid $" + ((fullTimeSalaryAvePerYr / 12) / 2) * 1.31 + " bi-weekly.");
                        break;
                    case "Internship":
                        System.out.println("The Internship got paid $" + Math.round(baseSalaryPerHr * 1.31) + " per hour");
                        break;
                    case "Contract":
                        System.out.println("The Contract got paid $" + Math.round(baseSalaryPerHr * 1.31) + " per hour");
                        break;
                    default:
                        System.out.println("There is no such Title exists!!!");
                }
            }
            else if (country.equals("3")) {
                switch (title) {
                    case "Senior Officer":
                        System.out.println("The Senior Officer got paid ¥" + ((fullTimeSalaryAvePerYr / 12) / 2) * 113.25 + " bi-weekly.");
                        break;
                    case "Junior Officer":
                        System.out.println("The Junior Officer got paid ¥" + ((fullTimeSalaryAvePerYr / 12) / 2) * 113.25 + " bi-weekly.");
                        break;
                    case "General Employee":
                        System.out.println("The General Employee got paid ¥" + ((fullTimeSalaryAvePerYr / 12) / 2) * 113.25 + " bi-weekly.");
                        break;
                    case "Internship":
                        System.out.println("The Internship got paid ¥" + Math.round(baseSalaryPerHr * 113.25) + " per hour");
                        break;
                    case "Contract":
                        System.out.println("The Contract got paid ¥" + Math.round(baseSalaryPerHr * 113.25) + " per hour");
                        break;
                    default:
                        System.out.println("There is no such Title exists!!!");
                }
            }
        }
    }

    protected static void expenseCoverage(int num) {

        int expenseCover = 100;
        switch (num) {
            case 1:
                System.out.println("The expense for business lunch or dinner covers " + expenseCover / 2 + "%.");
                break;
            case 2:
                System.out.println("The expense for office materials " + expenseCover / 2 + "%.");
                break;
            case 3:
                System.out.println("The expense for Travel covers " + expenseCover / 1.25 + "%.");
                break;
            case 4:
                System.out.println("The expense for International Travel covers " + expenseCover + "%.");
                break;
            default:
                System.out.println("There is no expense needs to cover");
        }
    }

    protected void getStatus(String status) {

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