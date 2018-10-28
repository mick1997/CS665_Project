package HR;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateEmployee {

    // instance variable countryNumber
    private int countryNumber;

    /**
     * @param: None
     * @return: None
     * for using of Human Resource System
     * */
    public static void createEmployee() {

        // store employees' information in ArrayList
        ArrayList<Employee> employees = new ArrayList<>();
        boolean done = false;

        Scanner input = new Scanner(System.in);
        selectCountry();

        // option for choose to create or display employee information
        while (!done) {

            System.out.println("=====================================================\n" +
                               "Choose an option below:\n" +
                               "1. Add an new employee\n" +
                               "2. Display new Hired employees\n" +
                               "3. Display current Employee information\n" +
                               "4. Display information of Human Resource for each country\n" +
                               "5. Exit Human Resource System!\n" +
                               "======================================================");

            int selection;

            if (input.hasNextInt()) {
                selection = input.nextInt();
            }
            else {
                System.out.println("\nYou have entered the invalid option.");
                input.next();
                continue;
            }

            // if out of the range of option, return wrong choose
            if (selection < 1 || selection > 5) {
                System.out.println("\nPlease enter the correct option number within [1 ~ 5]:");
            }

            // option 1: create employee status
            if (selection == 1) {
                System.out.println("Please enter first name:");
                String firstName = input.next();
                if (isFirstNameFound(employees, firstName)) {
                    continue;
                }
                System.out.println("Please enter last name:");
                String lastName = input.next();
                System.out.println("Please enter the social security number:");
                String ssn = input.next();
                System.out.println("Please enter age");
                int age = input.nextInt();
                System.out.println("Please enter the address:");
                Scanner input1 = new Scanner(System.in);
                String address = input1.nextLine();
                System.out.println("Please enter the email:");
                String email = input1.nextLine();
                System.out.println("Please enter the gender:");
                String gender = input1.nextLine();
                System.out.println("Please enter phone number:");
                String phone = input1.nextLine();
                System.out.println("Please enter ethnicity");
                String ethnicity = input1.nextLine();

                Employee employee = new Employee.UserBuilder(firstName, lastName)
                        .ssn(ssn)
                        .age(age)
                        .address(address)
                        .email(email)
                        .gender(gender)
                        .phone(phone)
                        .ethnicity(ethnicity)
                        .build();
                employees.add(employee);
                System.out.println("The employee " + employee.getFirstName() + " has been created, and add on the list already!");
            }
            // option 2: print new Hired employees
            else if (selection == 2) {
                Recruiter.getHired();
            }
            // option 3: print select employee by designate first name
            else if (selection == 3) {
                System.out.println("Please enter first Name");
                String firstName = input.next();
                printEmployeeInfor(employees, firstName);
            }
            // option 4: print employee status of Human Resource by each country
            else if (selection == 4) {
                printStatus();
            }
            // option 5: exit the system
            else if (selection == 5) {
                System.out.println("Exit the Human Resource System");
                done = true;
            }
        }
    }

    /**
     * @param: None
     * @return: int
     * */
    private int getCountryNumber() {
        return countryNumber;
    }

    /**
     * @param: countryNumber: int
     * @return: None
     * */
    private void setCountryNumber(int countryNumber) {
        this.countryNumber = countryNumber;
    }

    /**
     * @param: None
     * @return: int
     * let user pick the country that wants to search
     * */
    private static int selectCountry() {

        System.out.println("=======================================================\n" +
                           "Please enter the Country that you want to search below:\n" +
                           "1. USA\n2. Canada\n3. Japan\n" +
                           "=======================================================");

        Scanner country = new Scanner(System.in);
        int number = country.nextInt();

        LEAVE:
        while (true) {
            switch (number) {
                case 1:
                    System.out.println("You have selected USA");
                    break LEAVE;
                case 2:
                    System.out.println("You have selected Canada");
                     break LEAVE;
                case 3:
                    System.out.println("You have selected Japan");
                    break LEAVE;
                default:
                    System.out.println("Please try to enter number with [1-3] again!");
                    number = country.nextInt();
                    break;
            }
        }
        return number;
    }

    /**
     * @param: employees: ArrayList<Employee>, firstName: String
     * @return: boolean
     * check if the employee firstName exist or not
     * */
    private static boolean isFirstNameFound(ArrayList<Employee> employees, String firstName) {

        for (Employee employee : employees) {
            if (employee.getFirstName().equals(firstName)) {
                System.out.println("The employee with first name " + firstName + " is on the list already.");
                return true;
            }
        }
        return false;
    }

    /**
     * @param: employees: ArrayList<Employee>, firstName: String
     * @return: None
     * print employee information by designate first name
     * */
    private static void printEmployeeInfor(ArrayList<Employee> employees, String firstName) {

        boolean isFNFound = false;
        for (Employee employee : employees) {
            if (employee.getFirstName().equals(firstName)) {
                employee.printEmployee();
                isFNFound = true;
                break;
            }
        }

        if (!isFNFound) {
            System.out.println("The employee with first name " + firstName + " is not exist on the list.");
        }
    }

    /**
     * @param: None
     * @return: None
     * print the employee status for each country of Human Resource
     * */
    private static void printStatus() {

        CreateEmployee employee = new CreateEmployee();
        employee.setCountryNumber(selectCountry());

        if (employee.getCountryNumber() == 1) {
            //create head quarter object that prints employee situation in head quarter
            System.out.println("\nThe employee status for USA (head Quarter):\n");
            HRHeadQuarter hq = new HRHeadQuarter("Human Recourse", "Take care of employees",
                    "The department is in charge of all employees in company", Location.USA, 8,
                    "The company is in good shape and hired more people.", "Good");
            hq.employStatus();
            System.out.println(hq);
        }
        else if (employee.getCountryNumber() == 2) {
            // create Canada site object that prints employee situation in Canada site
            System.out.println("\nThe employee status for Canada:\n");
            HRSiteCanada canada = new HRSiteCanada("Human Recourse", "Take care of employees",
                    "The department is in charge of all employee in company", Location.Canada, 8,
                    "Some new hired", "Good");
            canada.employStatus();
            System.out.println(canada);
        }
        else if (employee.getCountryNumber() == 3) {
            // create Europe site object that prints employee situation in Europe site
            System.out.println("\nThe employee status for Japan:\n");
            HRSiteJapan japan = new HRSiteJapan("Human Recourse", "Take care of employees",
                    "The department is in charge of all employee in company", Location.Japan, 8,
                    "Some new hired", "Terminated");
            japan.employStatus();
            System.out.println(japan);
        }
    }
}
