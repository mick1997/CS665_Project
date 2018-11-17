package HR;

import java.util.ArrayList;
import java.util.List;

// Test case for using hard code
public class TestCaseClass {

    /**
     * @param: None
     * @return: a list of with Employee type
     */
    private static List<Employee> createList() {

        // store all employees' information in ArrayList
        List<Employee> list = new ArrayList<>();

        // Employee No 1
        Employee employee1 = new Employee.UserBuilder("Tom", "Franklin")
                .ssn("123456789")
                .age(50)
                .address("10 New Street, MA Boston 02221")
                .email("tom@gmail.com")
                .gender("Male")
                .phone("917233453")
                .ethnicity("White")
                .title("Chief Executive Officer")
                .empID("001")
                .description("The chairman of the company")
                .supervisor(null)
                .department("Executive Department")
                .build();

        // Employee No 2
        Employee employee2 = new Employee.UserBuilder("Sue", "Smith")
                .ssn("987654321")
                .age(30)
                .address("1 Old Post Street, MA Allston 02134")
                .email("sue@gmail.com")
                .gender("Female")
                .phone("7322347861")
                .ethnicity("White")
                .title("Director")
                .empID("010")
                .description("The head of Human Resource")
                .supervisor("Tom Franklin")
                .department("Human Resource Department")
                .build();

        // Employee No 3
        Employee employee3 = new Employee.UserBuilder("Peter", "Johnson")
                .ssn("789654321")
                .age(35)
                .address("20 Water Road, MA Allston 02134")
                .email("peter@gmail.com")
                .gender("Male")
                .phone("9172326754")
                .ethnicity("American Indian")
                .title("Director")
                .empID("011")
                .description("The head of Marketing Department")
                .supervisor("Tom Franklin")
                .department("Marketing Department")
                .build();

        // Employee No 4
        Employee employee4 = new Employee.UserBuilder("Tim", "Chen")
                .ssn("456122789")
                .age(26)
                .address("15 New Road, MA Allston 02134")
                .email("tim@gmail.com")
                .gender("Male")
                .phone("9173244867")
                .ethnicity("Asian")
                .title("Senior Officer")
                .empID("100")
                .description("The senior employee of Human Resource")
                .supervisor("Sue Smith")
                .department("Human Resource Department")
                .build();

        // Employee No 5
        Employee employee5 = new Employee.UserBuilder("Zheng", "Lee")
                .age(26)
                .address("15 Tiao Road, Allston MA 02134")
                .email("zheng@gmail.com")
                .gender("Male")
                .phone("7324567652")
                .ethnicity("Asian")
                .title("General Employee")
                .empID("200")
                .description("The General employee of Marketing Department")
                .supervisor("Peter Johnson")
                .department("Marketing Department")
                .build();

        // show employee salary
        GeneralHR.getSalary(employee1.getEmployTitle(), "1", "1"); // country: USA, employee level: Management Employee Level
        GeneralHR.getSalary(employee2.getEmployTitle(), "1", "1"); // country: USA, employee level: Management Employee Level
        GeneralHR.getSalary(employee3.getEmployTitle(), "2", "1"); // country: Canada, employee level: Management Employee Level
        GeneralHR.getSalary(employee4.getEmployTitle(), "1", "3"); // country: USA, employee level: Entry or regular Level Employee
        GeneralHR.getSalary(employee5.getEmployTitle(), "2", "3"); // country: Canada, employee level: Entry or regular Level Employee
        System.out.println();

        // show employee expense coverage
        GeneralHR.expenseCoverage(1);
        GeneralHR.expenseCoverage(2);
        GeneralHR.expenseCoverage(3);
        GeneralHR.expenseCoverage(4);
        GeneralHR.expenseCoverage(5);
        System.out.println();

        // add to the list
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
        return list;
    }

    /**
     * @param: None
     * @return: None
     * print and store customer and vendor information
     */
    private static void testCase() {

        // create customer
        Customer customer = Customer.getInstance();
        customer.setName("Sue Mike");
        customer.setCustomerID(123456);
        customer.setProduct("tooth brush");
        customer.setPayment(49.5);
        customer.printCustomerInfor();

        // create vendor
        Vendor vendor = Vendor.getInstance();
        vendor.setName("Michael Rich");
        vendor.setVendorID(654321);
        vendor.setProduct("Brush material");
        vendor.setPayment(55);
        vendor.setRemainder(8);
        vendor.printVendorInfor();

        // create product add in list
        List<Product> products = new ArrayList<>();
        Product product = new Product("toot brush", "123", 99, "This tooth brush is quip most advance tooth brush");
        products.add(product);
        GeneralMarketing.goodsChangedPrice(products, "123", 50);
        System.out.println(products + "\n");

        // create service add in list
        List<Service> services = new ArrayList<>();
        Service service = new Service("After purchased service", "001", 0, "The service is free for customer who purchased tooth brush");
        services.add(service);
        GeneralMarketing.serviceChangedPrice(services, "001", 0);
        System.out.println(services + "\n");

        // generate ads by level and store in different list
        ArrayList<String> systemList1 = new ArrayList<>();
        ArrayList<String> systemList2 = new ArrayList<>();
        ArrayList<String> systemList3 = new ArrayList<>();
        GeneralMarketing.addAdsCampaign(systemList1, systemList2, systemList3, 1, "Tooth Brush");
        GeneralMarketing.addAdsCampaign(systemList1, systemList2, systemList3, 2, "Brush");
        GeneralMarketing.addAdsCampaign(systemList1, systemList2, systemList3, 3, "Packaging");
        GeneralMarketing.addAdsCampaign(systemList1, systemList2, systemList3, 4, "Toothpaste");
        System.out.println(systemList1);
        System.out.println(systemList2);
        System.out.println(systemList3);
        System.out.println();

        // generate promotion coupons
        GeneralMarketing.promPriceAndCoupon(1);
        GeneralMarketing.promPriceAndCoupon(2);
        GeneralMarketing.promPriceAndCoupon(3);
        GeneralMarketing.promPriceAndCoupon(4);
    }

    /**
     * @param: None
     * @return: None
     * print the whole records of employees' information and situation of each region of the Human Resource
     * for using of hard code employee
     */
    public static void printRecords() {

        // create TestCaseClass object and print employee information such as Manager or Recruiter
        System.out.println(createList());

        // Human Resource Department
        //create head quarter object that prints employee situation in head quarter
        System.out.println("\nThe employee status for USA (head Quarter):\n");
        System.out.println(DepartmentFactory.pickDepartmentUSA("HR"));
        GeneralHR.employStatus();
        // create Canada site object that prints employee situation in Canada site
        System.out.println("\nThe employee status for Canada:\n");
        System.out.println(DepartmentFactory.pickDepartmentCan("HR"));
        GeneralHR.employStatus();
        // create Europe site object that prints employee situation in Europe site
        System.out.println("\nThe employee status for Japan:\n");
        System.out.println(DepartmentFactory.pickDepartmentJan("HR"));
        GeneralHR.employStatus();

        // Marketing department
        //create head quarter object that prints Marketing Department in head quarter
        System.out.println("\nThe Marketing Department for USA (head Quarter):\n");
        System.out.println(DepartmentFactory.pickDepartmentUSA("Marketing"));
        // create Canada site object that prints Marketing Department in Canada site
        System.out.println("\nThe Marketing Department for Canada:\n");
        System.out.println(DepartmentFactory.pickDepartmentCan("Marketing"));
        // create Europe site object that prints Marketing Department in Europe site
        System.out.println("\nThe Marketing Department for Japan:\n");
        System.out.println(DepartmentFactory.pickDepartmentJan("Marketing"));

        System.out.println();
        testCase();
    }
}
