package HR;

public class Customer implements HandleFinancialTask {

    // instance variable: name, customerID, product, payment
    private String name;
    private int customerID;
    private String product;
    private double payment;

    // create final static instance point to Customer object
    private static final Customer instance = new Customer();

    // private Customer constructor
    private Customer() {}

    /**
     * @param: None
     * @return: Customer
     * create Customer object if not exist, otherwise return instance
     * */
    public static Customer getInstance() {
        if (instance == null) {
            return new Customer();
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
    public int getCustomerID() {
        return customerID;
    }

    /**
     * @param: customerID: int
     * @return: None
     * */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
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
    @Override
    public double getPayment() {
        return payment;
    }

    /**
     * @param: None
     * @return: None
     * track customer information
     * */
    public void printCustomerInfor() {
        System.out.println(String.format("The customer name: %s\nCustomer id: %s\nProduct purchased: %s\nPayment: %s\n",
                getInstance().getName(), getInstance().getCustomerID(), getInstance().getProduct(), getInstance().getPayment()));
    }
}
