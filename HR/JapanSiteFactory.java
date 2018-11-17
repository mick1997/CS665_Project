package HR;

public class JapanSiteFactory {

    /**
     * @param: depName: String
     * @return Department
     * return the specific department information for Japan site
     * */
    static Department pickDepartment(String depName) {

        Department dep = null;
        switch (depName) {
            case "HR":
                dep = new GeneralHR("Human Resource", "Take care of employees",
                        "The department is in charge of all employee in company", Location.Japan,
                        8, "Some new hired", "Terminated");
                break;
            case "Marketing":
                dep = new GeneralMarketing("Marketing", "Manage advertising and price",
                        "The department is in charge of Marketing in Japan", Location.Japan, "better days every day");
                break;
            default:
                System.out.println("No such department exists!!!");
                break;
        }
        return dep;
    }
}
