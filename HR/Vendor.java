package HR;

public class Vendor {

    // instance variable: name, vendorID, product, payment
    private String name;
    private int vendorID;
    private String product;
    private double payment;

    // create final static instance point to Vendor object
    private static Vendor instance = new Vendor();

    // private Vendor constructor
    private Vendor() {}

    /**
     * @param: None
     * @return: Vendor
     * create Vendor object if not exist, otherwise return instance
     * */
    public static Vendor getInstance() {
        if (instance == null) {
            return new Vendor();
        }
        return instance;
    }

    /**
     * @param: None
     * @return: String
     * */
    public String getName() {
        return name;
    }

    /**
     * @param: name: String
     * @return: None
     * */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param: None
     * @return: int
     * */
    public int getVendorID() {
        return vendorID;
    }

    /**
     * @param: vendorID: int
     * @return: None
     * */
    public void setVendorID(int vendorID) {
        this.vendorID = vendorID;
    }

    /**
     * @param: None
     * @return: String
     * */
    public String getProduct() {
        return product;
    }

    /**
     * @param: product: String
     * @return: None
     * */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @param: payment: double
     * @return: None
     * */
    public void setPayment(double payment) {
        this.payment = payment;
    }

    /**
     * @param: None
     * @return: double
     * */
    public double getPayment() {
        return payment;
    }

    /**
     * @param: days: int
     * @return: None
     * setRemainder for vendor if over 1 days payment, print warning message, else if before 5 days, send message, else,
     * nothing needs to worry
     * */
    public void setRemainder(int days) {

        int defaultPaymentDay = 6;
        double interest = 1.5;

        if (days > defaultPaymentDay) {
            System.out.println("The payment is Overdue by 1 days already, interest adds on!!!");
            payment = payment * interest;
        }
        else if (days == defaultPaymentDay - 5) {
            System.out.println("The payment is due in 5 days");
        }
        else {
            System.out.println("nothing needs to worry!!!");
        }
    }

    /**
     * @param: None
     * @return: None
     * track vendor information
     * */
    public void printVendorInfor() {
        System.out.println(String.format("The Vendor name: %s\nVendor ID: %s\nProduct purchased: %s\npayment: %s\n",
                getInstance().getName(), getInstance().getVendorID(), getInstance().getProduct(), getInstance().getPayment()));
    }
}
