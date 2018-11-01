package HR;

import java.util.ArrayList;
import java.util.List;

public class WorkHandle {

    /**
     * @param: None
     * @return: None
     * print new hired employees as a list
     * */
    public static void getHired() {

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


}
