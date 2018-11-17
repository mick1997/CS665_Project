package HR;

public class DepartmentFactory {

    // private constructor
    private DepartmentFactory() {}

    /**
     * @param: depName: String
     * @return: Department
     * pick department name for USA site
     * */
    public static Department pickDepartmentUSA(String depName) {

        Department dep = null;

        switch (depName) {
            case "HR":
                dep = USASiteFactory.pickDepartment(depName);
                break;
            case "Marketing":
                dep = USASiteFactory.pickDepartment(depName);
                break;
            default:
                break;
        }
        return dep;
    }

    /**
     * @param: depName: String
     * @return: Department
     * pick department name for Canada site
     * */
    public static Department pickDepartmentCan(String depName) {

        Department dep = null;

        switch (depName) {
            case "HR":
                dep = CanadaSiteFactory.pickDepartment(depName);
                break;
            case "Marketing":
                dep = CanadaSiteFactory.pickDepartment(depName);
                break;
            default:
                break;
        }
        return dep;
    }

    /**
     * @param: depName: String
     * @return: Department
     * pick department name for Japan site
     * */
    public static Department pickDepartmentJan(String depName) {

        Department dep = null;

        switch (depName) {
            case "HR":
                dep = JapanSiteFactory.pickDepartment(depName);
                break;
            case "Marketing":
                dep = JapanSiteFactory.pickDepartment(depName);
                break;
            default:
                break;
        }
        return dep;
    }
}
