package HR;

import java.util.ArrayList;
import java.util.List;

public class GeneralHR extends Department implements HandleTask {

    // instance variable: news, status
    private String news;
    private String status;

    /**
     * @param: departName: String, departType: String, description: String, location: Location, timeDurationWork: int,
     *         news: String, getStatus: String
     * public GeneralHR constructor
     * */
    public GeneralHR(String departName, String departType, String description, Location location, int timeDurationWork,
                     String news, String status) {
        super(departName, departType, description, location);
        this.news = news;
        this.status = status;

        // if employee work enough 8 hours, print appropriate message, else print warning message
        if (timeDurationWork >= 8) {
            System.out.println("All employees have worked " + timeDurationWork + " hours already!");
        }
        else {
            System.out.println("some employees have not worked enough time yet.");
        }
    }

    /**
     * @param: None
     * @return: news: String
     * */
    @Override
    public List<String> showNewsAndMessages() {
        List<String> newsList = new ArrayList<>();
        newsList.add(news);
        return newsList;
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

    /**
     * @param: title: String, country: String, empLevel: String
     * @return: None
     * print salary for each employee by title of each country
     * */
    public static void getSalary(String title, String country, String empLevel) {

        int fullTimeSalaryAvePerYr = 150000;
        int fullTimeSalaryGenAvePerYr = 100000;
        int dividend = 1000;
        int baseSalaryPerHr = 15;
        
        if (empLevel.equals("1")) {
            if (country.equals("1")) {
                switch (title) {
                    case "Chief Executive Officer":
                        System.out.println("The Chief Executive Officer got paid $" + (fullTimeSalaryAvePerYr + dividend) / 12 + " per month.");
                        break;
                    case "President":
                        System.out.println("The President got paid $" + (fullTimeSalaryAvePerYr + dividend) / 12 + " per month.");
                        break;
                    case "Vice President":
                        System.out.println("The Vice President got paid $" + (fullTimeSalaryAvePerYr + dividend) / 12 + " per month.");
                        break;
                    case "Director":
                        System.out.println("The Director got paid $" + (fullTimeSalaryAvePerYr + dividend) / 12 + " per month.");
                        break;
                    case "Administrator":
                        System.out.println("The Administrator got paid $" + (fullTimeSalaryAvePerYr + dividend) / 12 + " per month.");
                        break;
                    case "General Manager":
                        System.out.println("The General Manager got paid $" + (fullTimeSalaryAvePerYr + dividend) / 12 + " per month.");
                        break;
                    case "Manager":
                        System.out.println("The Manager got paid $" + (fullTimeSalaryAvePerYr + dividend) / 12 + " per month.");
                        break;
                    default:
                        System.out.println("There is no such Title exists!!!");
                }
            }
            else if (country.equals("2")) {
                switch (title) {
                    case "Chief Executive Officer":
                        System.out.println("The Chief Executive Officer got paid $" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "President":
                        System.out.println("The President got paid $" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "Vice President":
                        System.out.println("The Vice President got paid $" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "Director":
                        System.out.println("The Director got paid $" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "Administrator":
                        System.out.println("The Administrator got paid $" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "General Manager":
                        System.out.println("The General Manager got paid $" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "Manager":
                        System.out.println("The Manager got paid $" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 1.31 + " per month.");
                        break;
                    default:
                        System.out.println("There is no such Title exists!!!");
                }
            }
            else if (country.equals("3")) {
                switch (title) {
                    case "Chief Executive Officer":
                        System.out.println("The Chief Executive Officer got paid ¥" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "President":
                        System.out.println("The President got paid ¥" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "Vice President":
                        System.out.println("The Vice President got paid ¥" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "Director":
                        System.out.println("The Director got paid ¥" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "Administrator":
                        System.out.println("The Administrator got paid ¥" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "General Manager":
                        System.out.println("The General Manager got paid ¥" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "Manager":
                        System.out.println("The Manager got paid ¥" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 113.25 + " per month.");
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
                        System.out.println("The Chief Financial Officer got paid $" + (fullTimeSalaryAvePerYr + dividend) / 12 + " per month.");
                        break;
                    case "Chief Technical Officer":
                        System.out.println("The Chief Technical Officer got paid $" + (fullTimeSalaryAvePerYr + dividend) / 12 + " per month.");
                        break;
                    case "Chief Sales Officer":
                        System.out.println("The Chief Sales Officer got paid $" + (fullTimeSalaryAvePerYr + dividend) / 12 + " per month.");
                        break;
                    case "Chief Marketing Officer":
                        System.out.println("The Chief Marketing Officer got paid $" + (fullTimeSalaryAvePerYr + dividend) / 12 + " per month.");
                        break;
                    case "Chief HR Officer":
                        System.out.println("The Chief HR Officer got paid $" + (fullTimeSalaryAvePerYr + dividend) / 12 + " per month.");
                        break;
                    case "Chief Business Officer":
                        System.out.println("The Chief Business Officer got paid $" + (fullTimeSalaryAvePerYr + dividend) / 12 + " per month.");
                        break;
                    case "Chief Quality Officer":
                        System.out.println("The Chief Quality Officer got paid $" + (fullTimeSalaryAvePerYr + dividend) / 12 + " per month.");
                        break;
                    default:
                        System.out.println("There is no such Title exists!!!");
                }
            }
            else if (country.equals("2")) {
                switch (title) {
                    case "Chief Financial Officer":
                        System.out.println("The Chief Financial Officer got paid $" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "Chief Technical Officer":
                        System.out.println("The Chief Technical Officer got paid $" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "Chief Sales Officer":
                        System.out.println("The Chief Sales Officer got paid $" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "Chief Marketing Officer":
                        System.out.println("The Chief Marketing Officer got paid $" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "Chief HR Officer":
                        System.out.println("The Chief HR Officer got paid $" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "Chief Business Officer":
                        System.out.println("The Chief Business Officer got paid $" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 1.31 + " per month.");
                        break;
                    case "Chief Quality Officer":
                        System.out.println("The Chief Quality Officer got paid $" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 1.31 + " per month.");
                        break;
                    default:
                        System.out.println("There is no such Title exists!!!");
                }
            }
            else if (country.equals("3")) {
                switch (title) {
                    case "Chief Financial Officer":
                        System.out.println("The Chief Financial Officer got paid ¥" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "Chief Technical Officer":
                        System.out.println("The Chief Technical Officer got paid ¥" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "Chief Sales Officer":
                        System.out.println("The Chief Sales Officer got paid ¥" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "Chief Marketing Officer":
                        System.out.println("The Chief Marketing Officer got paid ¥" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "Chief HR Officer":
                        System.out.println("The Chief HR Officer got paid ¥" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "Chief Business Officer":
                        System.out.println("The Chief Business Officer got paid ¥" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 113.25 + " per month.");
                        break;
                    case "Chief Quality Officer":
                        System.out.println("The Chief Quality Officer got paid ¥" + ((fullTimeSalaryAvePerYr + dividend) / 12) * 113.25 + " per month.");
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
                        System.out.println("The Senior Officer got paid $" + (fullTimeSalaryGenAvePerYr / 12) / 2 + " bi-weekly.");
                        break;
                    case "Junior Officer":
                        System.out.println("The Junior Officer got paid $" + (fullTimeSalaryGenAvePerYr / 12) / 2 + " bi-weekly.");
                        break;
                    case "General Employee":
                        System.out.println("The General Employee got paid $" + (fullTimeSalaryGenAvePerYr / 12) / 2 + " bi-weekly.");
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
                        System.out.println("The Senior Officer got paid $" + ((fullTimeSalaryGenAvePerYr / 12) / 2) * 1.31 + " bi-weekly.");
                        break;
                    case "Junior Officer":
                        System.out.println("The Junior Officer got paid $" + ((fullTimeSalaryGenAvePerYr / 12) / 2) * 1.31 + " bi-weekly.");
                        break;
                    case "General Employee":
                        System.out.println("The General Employee got paid $" + ((fullTimeSalaryGenAvePerYr / 12) / 2) * 1.31 + " bi-weekly.");
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
                        System.out.println("The Senior Officer got paid ¥" + ((fullTimeSalaryGenAvePerYr / 12) / 2) * 113.25 + " bi-weekly.");
                        break;
                    case "Junior Officer":
                        System.out.println("The Junior Officer got paid ¥" + ((fullTimeSalaryGenAvePerYr / 12) / 2) * 113.25 + " bi-weekly.");
                        break;
                    case "General Employee":
                        System.out.println("The General Employee got paid ¥" + ((fullTimeSalaryGenAvePerYr / 12) / 2) * 113.25 + " bi-weekly.");
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

    /**
     * @param: num: int
     * @return: None
     * print the employee expense coverage standard
     * */
    protected static void expenseCoverage(int num) {

        int expenseCover = 100;
        switch (num) {
            case 1:
                System.out.println("The expense for business lunch or dinner covers " + expenseCover / 2 + "%.");
                break;
            case 2:
                System.out.println("The expense for office materials covers " + expenseCover / 2 + "%.");
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

    /**
     * @param: status: String
     * @return: None
     * get employee status
     * */
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
        return "The news Announcement for today is: " + showNewsAndMessages() + super.toString();
    }
}
