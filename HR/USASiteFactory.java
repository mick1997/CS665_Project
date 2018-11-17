package HR;

public class USASiteFactory {

    /**
     * @param: depName: String
     * @return Department
     * return the specific department information for USA site
     * */
    static Department pickDepartment(String depName) {

        Department dep = null;
        switch (depName) {
            case "HR":
                dep = new GeneralHR("Human Resource", "Take care of employees",
                        "The department is in charge of all employees in company", Location.USA,
                        8, "The company is in good shape and hired more people.", "Good");
                break;
            case "Marketing":
                dep = new GeneralMarketing("Marketing", "Manage advertising and price",
                        "The department is in charge of all Marketing globally", Location.USA, "A good day of work");
                break;
            default:
                System.out.println("No such department exists!!!");
                break;
        }
        return dep;
    }
}
