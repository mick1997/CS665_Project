package HR;

import java.util.ArrayList;
import java.util.List;

// Test case for using hard code
public class TestCaseClass {

    /**
     * @param: None
     * @return: a list of with Employee type
     * */
    private static List<Employee> createList() {

        // store all employees' information in ArrayList
        List<Employee> list = new ArrayList<>();

        // Employee No 1
        Employee employee1 = new Employee.UserBuilder("Tom", "Franklin")
                .ssn("123456789")
                .age(25)
                .address("10 New Street, MA Boston 02221")
                .email("tom@gmail.com")
                .gender("Male")
                .phone("917233453")
                .ethnicity("White")
                .build();

        // Employee No 2
        Employee employee2 = new Employee.UserBuilder("Sue", "Smith")
                .ssn("987654321")
                .age(23)
                .address("1 Old Post Street, MA Allston 02134")
                .email("sue@gmail.com")
                .gender("Female")
                .phone("7322347861")
                .ethnicity("White")
                .build();

        // Employee No 3
        Employee employee3 = new Employee.UserBuilder("Peter", "Johnson")
                .ssn("789654321")
                .age(27)
                .address("20 Water Road, MA Allston 02134")
                .email("peter@gmail.com")
                .gender("Male")
                .phone("9172326754")
                .ethnicity("American Indian")
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
                .build();

        // Employee No 5
        Employee employee5 = new Employee.UserBuilder("Zheng", "Lee")
                .age(26)
                .address("15 Tiao Road, Allston MA 02134")
                .email("zheng@gmail.com")
                .gender("Male")
                .phone("7324567652")
                .ethnicity("Asian")
                .build();

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
     * print the whole records of employees' information and situation of each region of the Human Resource
     * for using of hard code employee
     * */
//    public static void printRecords() {
//
//        // create TestCaseClass object and print employee information such as Manager or Recruiter
//        System.out.println(TestCaseClass.createList());
//
//        // create USA(head quarter) object that prints employee situation in head quarter
//        System.out.println("\nThe employee getStatus for USA(head Quarter):\n");
//        GeneralHR hq = new GeneralHR("Human Recourse", "Take care of employees",
//                "The department is in charge of all employees in company", Location.USA, 8,
//                "The company is in good shape and hired more people.", "Good");
//        hq.employStatus();
//        System.out.println(hq);
//
//        // create Canada site object that prints employee situation in Canada site
//        System.out.println("\nThe employee getStatus for Canada:\n");
//        HRSiteCanada canada = new HRSiteCanada("Human Recourse", "Take care of employees",
//                "The department is in charge of all employee in company", Location.Canada, 8,
//                "Some new hired", "Good");
//        canada.employStatus();
//        System.out.println(canada);
//
//        // create Japan site object that prints employee situation in Europe site
//        System.out.println("\nThe employee getStatus for Japan:\n");
//        HRSiteJapan europe = new HRSiteJapan("Human Recourse", "Take care of employees",
//                "The department is in charge of all employee in company", Location.Japan, 8,
//                "Some new hired", "Terminated");
//        europe.employStatus();
//        System.out.println(europe);
//    }
}
