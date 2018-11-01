package HR;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateEmployee {

    // instance variable countryNumber
    private int countryNumber;
    private String country;

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
                               "5. Display employee's salary by title for each country\n" +
                               "6. Display employee expenses\n" +
                               "7. Exit Human Resource System!\n" +
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
            if (selection < 1 || selection > 7) {
                System.out.println("\nPlease enter the correct option number within [1 ~ 7]:");
            }


            // option 1: create employee status
            if (selection == 1) {
                System.out.println("Please enter the employee id:");
                String id = input.next();
                if (isIDFound(employees, id)) {
                    continue;
                }
                System.out.println("Please enter the first name:");
                String firstName = input.next();
                System.out.println("Please enter the last name:");
                String lastName = input.next();
                System.out.println("Please enter the title:");
                String title = input.next();
                System.out.println("Please enter the social security number:");
                String ssn = input.next();
                System.out.println("Please enter the age");
                int age = input.nextInt();
                System.out.println("Please enter the address:");
                Scanner input1 = new Scanner(System.in);
                String address = input1.nextLine();
                System.out.println("Please enter the email:");
                String email = input1.nextLine();
                System.out.println("Please enter the gender:");
                String gender = input1.nextLine();
                System.out.println("Please enter the phone number:");
                String phone = input1.nextLine();
                System.out.println("Please enter the ethnicity");
                String ethnicity = input1.nextLine();
                System.out.println("Please enter the supervisor:");
                String sup = input1.nextLine();
                System.out.println("Please enter the description:");
                String des = input1.nextLine();
                System.out.println("Please enter the department:");
                String dep = input1.nextLine();

                Employee employee = new Employee.UserBuilder(firstName, lastName)
                        .empID(id)
                        .title(title)
                        .ssn(ssn)
                        .age(age)
                        .address(address)
                        .email(email)
                        .gender(gender)
                        .phone(phone)
                        .ethnicity(ethnicity)
                        .supervisor(sup)
                        .description(des)
                        .department(dep)
                        .build();
                employees.add(employee);
                System.out.println("The employee with ID number " + employee.getEmployID() + " has been created, and add on the list already!");
            }
            // option 2: print new Hired employees
            else if (selection == 2) {
                WorkHandle.getHired();
            }
            // option 3: print select employee by designate first name
            else if (selection == 3) {
                System.out.println("Please enter the ID number to search employee information");
                String id = input.next();
                printEmployeeInfor(employees, id);
            }
            // option 4: print employee status of Human Resource by each country
            else if (selection == 4) {
                printStatus();
            }
            else if (selection == 5) {
                System.out.println("Please enter number of the country to search:\n1. USA\n2. Canada\n3. Japan");
                String country = input.next();
                System.out.println("Please enter number of the employee level to search:\n1. Management Employee Level\n2. Executive Employee Level\n3. Entry or regular Level Employee");
                Scanner input1 = new Scanner(System.in);
                String level = input1.nextLine();
                System.out.println("Please enter the following title below to search:" +
                                   "\nManagement Employee Level: [Chief Executive Officer, President, Vice President, Director, Administrator, General Manager,  Manager]" +
                                   "\nExecutive Employee Level: [Chief Financial Officer, Chief Technical Officer, Chief Sales Officer, Chief Marketing Officer, Chief HR Officer, Chief Business Officer, Chief Quality Officer]" +
                                   "\nEntry or regular Level Employee: [Senior Officer, Junior Officer, General Employee, Internship, Contract]");
                String title = input1.nextLine();
                GeneralHR.getSalary(title, country, level);
            }
            else if (selection == 6) {
                System.out.println("Please select the number of expenses coverage percentage:\n1. Business lunch or dinner" +
                                   "\n2. Office materials\n3. Travel\n4. International Travel");
                int num = input.nextInt();
                GeneralHR.expenseCoverage(num);
            }
            // option 5: exit the system
            else if (selection == 7) {
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
    private static boolean isIDFound(ArrayList<Employee> employees, String empID) {

        for (Employee employee : employees) {
            if (employee.getEmployID().equals(empID)) {
                System.out.println("The employee with id number " + empID + " is on the list already.");
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
    private static void printEmployeeInfor(ArrayList<Employee> employees, String empID) {

        boolean isFNFound = false;
        for (Employee employee : employees) {
            if (employee.getEmployID().equals(empID)) {
                employee.printEmployee();
                isFNFound = true;
                break;
            }
        }

        if (!isFNFound) {
            System.out.println("The employee with ID number " + empID + " is not exist on the list.");
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
            GeneralHR hq = new GeneralHR("Human Recourse", "Take care of employees",
                    "The department is in charge of all employees in company", Location.USA, 8,
                    "The company is in good shape and hired more people.", "Good");
            hq.employStatus();
            System.out.println(hq);
        }
        else if (employee.getCountryNumber() == 2) {
            // create Canada site object that prints employee situation in Canada site
            System.out.println("\nThe employee status for Canada:\n");
            GeneralHR canada = new GeneralHR("Human Recourse", "Take care of employees",
                    "The department is in charge of all employee in company", Location.Canada, 8,
                    "Some new hired", "Good");
            canada.employStatus();
            System.out.println(canada);
        }
        else if (employee.getCountryNumber() == 3) {
            // create Europe site object that prints employee situation in Europe site
            System.out.println("\nThe employee status for Japan:\n");
            GeneralHR japan = new GeneralHR("Human Recourse", "Take care of employees",
                    "The department is in charge of all employee in company", Location.Japan, 8,
                    "Some new hired", "Terminated");
            japan.employStatus();
            System.out.println(japan);
        }
    }
}
