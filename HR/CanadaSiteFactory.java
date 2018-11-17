package HR;

public class CanadaSiteFactory {

    /**
     * @param: depName: String
     * @return Department
     * return the specific department information for Canada site
     * */
    static Department pickDepartment(String depName) {

        Department dep = null;

        switch (depName) {
            case "HR":
                dep = new GeneralHR("Human Resource", "Take care of employees",
                    "The department is in charge of all employee in company", Location.Canada,
                    8, "Some new hired", "Good");
                break;
            case "Marketing":
                dep = new GeneralMarketing("Marketing", "Manage advertising and price",
                        "The department is in charge of Marketing in Canada", Location.Canada, "ways to goes on");
                break;
            default:
                System.out.println("No such department exists!!!");
                break;
        }
        return dep;
    }
}
