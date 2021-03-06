package HR;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeneralSystem {

    // instance variable countryNumber
    private int countryNumber;

    /**
     * @param: None
     * @return: None
     * for using of create system
     * */
    public static void create() {

        // store employees' information in ArrayList
        ArrayList<Employee> employees = new ArrayList<>();
        // store customer' information in ArrayList
        ArrayList<Customer> customers = new ArrayList<>();
        // store vendor' information in ArrayList
        ArrayList<Vendor> vendors = new ArrayList<>();
        // store product' information in ArrayList
        ArrayList<Product> products = new ArrayList<>();
        // store service' information in ArrayList
        ArrayList<Service> services = new ArrayList<>();
        // store best ads in system1 in ArrayList
        ArrayList<String> systemList1 = new ArrayList<>();
        // store at least best ads in system2 in ArrayList
        ArrayList<String> systemList2 = new ArrayList<>();
        // store average ads in system3 in ArrayList
        ArrayList<String> systemList3 = new ArrayList<>();

        boolean done = false;

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        selectCountry();

        // option for choose to create or display employees, customers, vendors, product, product, service, information
        while (!done) {

            System.out.println("=====================================================\n" +
                               "Choose an option below:\n" +
                               "1. Add an new employee\n" +
                               "2. Display new Hired employees\n" +
                               "3. Display current Employee information\n" +
                               "4. Display information of Human Resource for each country\n" +
                               "5. Display employee's salary by title for each country\n" +
                               "6. Display employee expenses\n" +
                               "7. Add customer\n" +
                               "8. Track the customer's information\n" +
                               "9. Add vendor\n" +
                               "10. Track the Vendor's information\n" +
                               "11. Display information of Marketing for each country\n" +
                               "12. Add Products or Services for storing\n" +
                               "13. Add campaign advertising for storing\n" +
                               "14. Show advertising Campaign\n" +
                               "15. Change the price for product or service\n" +
                               "16. Show product and service\n" +
                               "17. Show Company promotion and coupons information\n" +
                               "18. Exit Human Resource System!\n" +
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
            if (selection < 1 || selection > 18) {
                System.out.println("\nPlease enter the correct option number within [1 ~ 18]:");
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
                getHired();
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
            // option 5: print salary for each employee by title of each country
            else if (selection == 5) {
                System.out.println("Please enter number of the country to search:\n1. USA\n2. Canada\n3. Japan");
                String country = input.next();
                System.out.println("Please enter number of the employee level to search:\n1. Management Employee Level\n2. Executive Employee Level\n3. Entry or regular Level Employee");
                String level = input.next();
                System.out.println("Please enter the following title below to search:" +
                                   "\nManagement Employee Level: [Chief Executive Officer, President, Vice President, Director, Administrator, General Manager,  Manager]" +
                                   "\nExecutive Employee Level: [Chief Financial Officer, Chief Technical Officer, Chief Sales Officer, Chief Marketing Officer, Chief HR Officer, Chief Business Officer, Chief Quality Officer]" +
                                   "\nEntry or regular Level Employee: [Senior Officer, Junior Officer, General Employee, Internship, Contract]");
                String title = input1.nextLine();
                GeneralHR.getSalary(title, country, level);
            }
            // option 6: print the employee expense coverage standard
            else if (selection == 6) {
                System.out.println("Please select the number of expenses coverage percentage:\n1. Business lunch or dinner" +
                                   "\n2. Office materials\n3. Travel\n4. International Travel");
                int num = input.nextInt();
                GeneralHR.expenseCoverage(num);
            }
            // option 7: add customer information
            else if (selection == 7) {
                addCustomer(customers);
            }
            // option 8: track customer information
            else if (selection == 8) {
                System.out.println("Please enter the customer id to search");
                int id = input.nextInt();
                trackCustomerInfor(customers, id);
            }
            // option 9: add vendor
            else if (selection == 9) {
                addVendor(vendors);
            }
            // option 10: track vendor information
            else if (selection == 10) {
                System.out.println("Please enter the vendor id to search");
                int id = input.nextInt();
                System.out.println("Please enter today data");
                int day = input.nextInt();
                trackVendorInfor(vendors, id, day);
            }
            // option 11: print marketing department information
            else if (selection == 11) {
                printMarketing();
            }
            // option 12: pick the option to add product or service
            else if (selection == 12) {
                System.out.println("Pick the option that wants to add\n1. Product\n2. Service");
                int num = input.nextInt();
                if (num == 1) {
                    addProduct(products);
                }
                else {
                    addService(services);
                }
            }
            // option 13: add the most good advertising in list
            else if (selection == 13) {
                System.out.println("Please enter the title of the advertising");
                String title = input1.nextLine();
                System.out.println("Please enter the advertising level(by number)\n1. Most good advertising\n2. Least good advertising\n3. Average advertising");
                int level = input.nextInt();
                GeneralMarketing.addAdsCampaign(systemList1, systemList2, systemList3, level, title);
            }
            // option 14: show the most good advertising
            else if (selection == 14) {
                System.out.println("The most best advertising");
                System.out.println(systemList1);
                System.out.println("The least good advertising");
                System.out.println(systemList2);
                System.out.println("The average good advertising");
                System.out.println(systemList3);
            }
            // option 15: change the price for product or service
            else if (selection == 15) {
                System.out.println("Please pick the option to change\n1. product\n2. service");
                int op = input.nextInt();
                if (op == 1) {
                    System.out.println("Please enter the id number to search");
                    String id = input1.nextLine();
                    System.out.println("Please enter the price that wants to change");
                    int price = input.nextInt();
                    GeneralMarketing.goodsChangedPrice(products, id, price);
                }
                else {
                    System.out.println("Please enter the id number to search");
                    String id = input1.nextLine();
                    System.out.println("Please enter the price that wants to change");
                    int price = input.nextInt();
                    GeneralMarketing.serviceChangedPrice(services, id, price);
                }
            }
            // option 16: show results after edit product and service
            else if (selection == 16) {
                System.out.println("Please pick the option to show\n1. products\n2. service");
                int op = input.nextInt();
                if (op == 1) {
                    System.out.println(products);
                }
                else {
                    System.out.println(services);
                }
            }
            // option 17: check promotion
            else if (selection == 17) {
                System.out.println("Please enter the option to check promotion\n1. Holiday\n2. Company promotion\n3. Company coupons\n4. Regular price");
                int op = input.nextInt();
                GeneralMarketing.promPriceAndCoupon(op);
            }
            // option 18: exit the system
            else if (selection == 18) {
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
     * @param: employees: ArrayList<Employee>, empID: String
     * @return: boolean
     * check if the employee id exist or not
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
     * @param: employees: ArrayList<Employee>, empID: String
     * @return: None
     * print employee information by designate employee id
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

        GeneralSystem employee = new GeneralSystem();
        employee.setCountryNumber(selectCountry());

        if (employee.getCountryNumber() == 1) {
            //create head quarter object that prints employee situation in head quarter
            System.out.println("\nThe employee status for USA (head Quarter):\n");
            System.out.println(DepartmentFactory.pickDepartmentUSA("HR"));
            GeneralHR.employStatus();
        }
        else if (employee.getCountryNumber() == 2) {
            // create Canada site object that prints employee situation in Canada site
            System.out.println("\nThe employee status for Canada:\n");
            System.out.println(DepartmentFactory.pickDepartmentCan("HR"));
            GeneralHR.employStatus();
        }
        else if (employee.getCountryNumber() == 3) {
            // create Europe site object that prints employee situation in Europe site
            System.out.println("\nThe employee status for Japan:\n");
            System.out.println(DepartmentFactory.pickDepartmentJan("HR"));
            GeneralHR.employStatus();
        }
    }

    /**
     * @param: customers: ArrayList<Customer>
     * @return: None
     * add customers information in ArrayList
     * */
    private static void addCustomer(ArrayList<Customer> customers) {

        Customer customer = Customer.getInstance();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the name of the customer to store");
        String name = input.nextLine();
        customer.setName(name);
        System.out.println("Please enter the product purchased by the customer to store");
        String product = input.nextLine();
        customer.setProduct(product);
        System.out.println("Please enter the id of the customer to store");
        int id = input.nextInt();
        customer.setCustomerID(id);
        System.out.println("Please enter the payment that paid by customer to store");
        double payment = input.nextDouble();
        customer.setPayment(payment);

        customers.add(customer);
    }

    /**
     * @param: customers: ArrayList<Customer>, id: int
     * @return: None
     * track customers' information by designate id number
     * */
    private static void trackCustomerInfor(ArrayList<Customer> customers, int id) {

        boolean isFound = false;
        for (Customer c : customers) {
            if (c.getCustomerID() == id) {
                c.printCustomerInfor();
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("The customer with ID number " + id + " is not exist on the list.");
        }
    }

    /**
     * @param: vendors: ArrayList<Customer>
     * @return: None
     * add vendors information in ArrayList
     * */
    private static void addVendor(ArrayList<Vendor> vendors) {

        Vendor vendor = Vendor.getInstance();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the name of the vendor to store");
        String name = input.nextLine();
        vendor.setName(name);
        System.out.println("Please enter the products purchased by the vendor to store");
        String product = input.nextLine();
        vendor.setProduct(product);
        System.out.println("Please enter the id of the vendor to store");
        int id = input.nextInt();
        vendor.setVendorID(id);
        System.out.println("Please enter the payment amount for vendor to store");
        double payment = input.nextDouble();
        vendor.setPayment(payment);

        vendors.add(vendor);
    }

    /**
     * @param: customers: ArrayList<Customer>, id: int, days: int
     * @return: None
     * track customers' information designate id number and days
     * */
    private static void trackVendorInfor(ArrayList<Vendor> vendors, int id, int days) {

        boolean isFound = false;
        for (Vendor v : vendors) {
            if (v.getVendorID() == id) {
                v.setRemainder(days);
                v.printVendorInfor();
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("The vendor with ID number " + id + " is not exist on the list.");
        }
    }

    /**
     * @param: None
     * @return: None
     * print new hired employees as a list
     * */
    private static void getHired() {

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
     * @param: products: ArrayList<Product>
     * @return: None
     * add product to the ArrayList for storing
     * */
    private static void addProduct(ArrayList<Product> products) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the product name:");
        String name = input.nextLine();
        System.out.println("Please enter the id");
        String id = input.nextLine();
        System.out.println("Please enter the product description");
        String des = input.nextLine();
        System.out.println("Please enter the price");
        int price = input.nextInt();

        Product product = new Product(name, id, price, des);
        products.add(product);
    }

    /**
     * @param: services: ArrayList<Service>
     * @return: None
     * add service to the ArrayList for storing
     * */
    private static void addService(ArrayList<Service> services) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the service name:");
        String name = input.nextLine();
        System.out.println("Please enter the id");
        String id = input.nextLine();
        System.out.println("Please enter the service description");
        String des = input.nextLine();
        System.out.println("Please enter the price");
        int price = input.nextInt();

        Service service = new Service(name, id, price, des);
        services.add(service);
    }

    /**
     * @param: None
     * @return: None
     * show Marketing information for each sites
     * */
    private static void printMarketing() {

        GeneralSystem employee = new GeneralSystem();
        employee.setCountryNumber(selectCountry());

        if (employee.getCountryNumber() == 1) {
            //create head quarter object that prints Marketing Department in head quarter
            System.out.println("\nThe Marketing Department for USA (head Quarter):\n");
            System.out.println(DepartmentFactory.pickDepartmentUSA("Marketing"));
        }
        else if (employee.getCountryNumber() == 2) {
            // create Canada site object that prints Marketing Department in Canada site
            System.out.println("\nThe Marketing Department for Canada:\n");
            System.out.println(DepartmentFactory.pickDepartmentCan("Marketing"));
        }
        else if (employee.getCountryNumber() == 3) {
            // create Europe site object that prints Marketing Department in Europe site
            System.out.println("\nThe Marketing Department for Japan:\n");
            System.out.println(DepartmentFactory.pickDepartmentJan("Marketing"));
        }
    }
}
