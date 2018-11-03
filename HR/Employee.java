package HR;

public class Employee implements EmployeeRole {

    // instance variable: firstName, lastName, ssn, age, gender, phone, address, email,
    // ethnicity, empID, title, supervisor, description, department
    private String firstName;
    private String lastName;
    private String ssn;
    private int age;
    private String gender;
    private String  phone;
    private String address;
    private String email;
    private String ethnicity;
    private String empID;
    private String title;
    private String supervisor;
    private String description;
    private String department;

    /**
     * @param: builder: UserBuilder
     * private Employee constructor
     * */
    private Employee(UserBuilder builder) {

        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.ssn = builder.ssn;
        this.age = builder.age;
        this.gender = builder.gender;
        this.phone = builder.phone;
        this.address = builder.address;
        this.email = builder.email;
        this.ethnicity = builder.ethnicity;
        this.empID = builder.empID;
        this.title = builder.title;
        this.supervisor = builder.supervisor;
        this.description = builder.description;
        this.department = builder.department;
    }

    /**
     * @param: None
     * @return: firstName: String
     * */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param: None
     * @return: lastName: String
     * */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param: None
     * @return: ssn: String
     * */
    public String getSsn() {
        return ssn;
    }

    /**
     * @param: None
     * @return: age: int
     * */
    public int getAge() {
        return age;
    }

    /**
     * @param: None
     * @return: gender: String
     * */
    public String getGender() {
        return gender;
    }

    /**
     * @param: None
     * @return: phone: String
     * */
    public String getPhone() {
        return phone;
    }

    /**
     * @param: None
     * @return: address: String
     * */
    public String getAddress() {
        return address;
    }

    /**
     * @param: None
     * @return: email: String
     * */
    public String getEmail() {
        return email;
    }

    /**
     * @param: None
     * @return: ethnicity: String
     * */
    public String getEthnicity() {
        return ethnicity;
    }

    /**
     * @param: None
     * @return: empID: int
     * */
    @Override
    public String getEmployID() {
        return empID;
    }

    /**
     * @param: None
     * @return: title: String
     * */
    @Override
    public String getEmployTitle() {
        return title;
    }

    /**
     * @param: None
     * @return: description: String
     * */
    @Override
    public String description() {
        return description;
    }

    /**
     * @param: None
     * @return: department: String
     * */
    @Override
    public String getDepartment() {
        return department;
    }

    /**
     * @param: None
     * @return: supervisor: String
     * */
    @Override
    public String getSupervisor() {
        return supervisor;
    }

    public static class UserBuilder {

        // instance variable declare again for UserBuilder nest class
        private final String firstName;
        private final String lastName;
        private String ssn;
        private int age;
        private String gender;
        private String phone;
        private String address;
        private String email;
        private String ethnicity;
        private String empID;
        private String title;
        private String supervisor;
        private String description;
        private String department;

        /**
         * @param: firstName: String, lastName: String
         * public UserBuilder constructor
         * */
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        /**
         * @param: ssn: String
         * @return: this as UserBuilder.ssn
         * */
        public UserBuilder ssn(String ssn) {
            this.ssn = ssn;
            return this;
        }

        /**
         * @param: age: int
         * @return: this as UserBuilder.age
         * */
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        /**
         * @param: gender: String
         * @return: this as UserBuilder.gender
         * */
        public UserBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        /**
         * @param: phone: String
         * @return: this as UserBuilder.phone
         * */
        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * @param: address: String
         * @return: this as UserBuilder.address
         * */
        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * @param: email: String
         * @return: this as UserBuilder.email
         * */
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * @param: ethnicity: String
         * @return: this as UserBuilder.ethnicity
         * */
        public UserBuilder ethnicity(String ethnicity) {
            this.ethnicity = ethnicity;
            return this;
        }

        /**
         * @param: empID: int
         * @return: this as UserBuilder.empID
         * */
        public UserBuilder empID(String empID) {
            this.empID = empID;
            return this;
        }

        /**
         * @param: title: String
         * @return: this as UserBuilder.title
         * */
        public UserBuilder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * @param: supervisor: String
         * @return: this as UserBuilder.supervisor
         * */
        public UserBuilder supervisor(String supervisor) {
            this.supervisor = supervisor;
            return this;
        }

        /**
         * @param: description: String
         * @return: this as UserBuilder.description
         * */
        public UserBuilder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * @param: department: String
         * @return: this as UserBuilder.department
         * */
        public UserBuilder department(String department) {
            this.department = department;
            return this;
        }

        /**
         * @param: None
         * @return: build an new Employee object
         * */
        public Employee build() {
            return new Employee(this);
        }
    }

    /**
     * @param: None
     * @return: print the String format of employees' information (for hard code use)
     * */
    @Override
    public String toString() {
        return String.format("\nEmployee:\nID: %s\ntitle: %s\nFirst name: %s\nLast name: %s\nSocial Security Number: %s\n" +
                             "Age: %s\ngender: %s\nPhone Number: %s\nAddress: %s\nEmail: %s\nethnicity: %s" + "" +
                             "\nSupervisor: %s\nDescription: %s\nDepartment: %s\n",
                             getEmployID(), getEmployTitle(), getFirstName(), getLastName(), getSsn(), getAge(),
                             getGender(), getPhone(), getAddress(), getEmail(), getEthnicity(), getSupervisor(),
                             description(), getDepartment());
    }

    /**
     * @param: None
     * @return: print the String format of employees' information (for Human Resource System use)
     * */
    public void printEmployee() {
        System.out.println(String.format("\nEmployee:\nID: %s\ntitle: %s\nFirst name: %s\nLast name: %s\nSocial Security Number: %s\n" +
                                         "Age: %s\ngender: %s\nPhone Number: %s\nAddress: %s\nEmail: %s\nethnicity: %s" +
                                         "\nSupervisor: %s\nDescription: %s\nDepartment: %s",
                                         getEmployID(), getEmployTitle(), getFirstName(), getLastName(), getSsn(), getAge(),
                                         getGender(), getPhone(), getAddress(), getEmail(), getEthnicity(), getSupervisor(),
                                         description(), getDepartment()));
    }
}
