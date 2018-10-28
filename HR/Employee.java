package HR;

public class Employee {

    // instance variable: firstName, lastName, ssn, age, gender, phone, address, email, ethnicity
    private String firstName;
    private String lastName;
    private String ssn;
    private int age;
    private String gender;
    private String  phone;
    private String address;
    private String email;
    private String ethnicity;

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

    public static class UserBuilder {

        // instance variable declare again for UserBuilder static inner class
        private final String firstName;
        private final String lastName;
        private String ssn;
        private int age;
        private String gender;
        private String phone;
        private String address;
        private String email;
        private String ethnicity;

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
        return String.format("\nEmployee:\nFirst name: %s\nLast name: %s\nSocial Security Number: %s\n" +
                             "Age: %s\ngender: %s\nPhone Number: %s\nAddress: %s\nEmail: %s\nethnicity: %s\n",
                             getFirstName(), getLastName(), getSsn(), getAge(), getGender(), getPhone(),
                             getAddress(), getEmail(), getEthnicity());
    }

    /**
     * @param: None
     * @return: print the String format of employees' information (for Human Resource System use)
     * */
    public void printEmployee() {
        System.out.println(String.format("\nEmployee:\nFirst name: %s\nLast name: %s\nSocial Security Number: %s\n" +
                        "Age: %s\ngender: %s\nPhone Number: %s\nAddress: %s\nEmail: %s\nethnicity: %s\n",
                getFirstName(), getLastName(), getSsn(), getAge(), getGender(), getPhone(),
                getAddress(), getEmail(), getEthnicity()));
    }
}
