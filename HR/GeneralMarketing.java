package HR;

import java.util.ArrayList;
import java.util.List;

public class GeneralMarketing extends Department implements HandleTask {

    // instance variable: message
    private String message;

    /**
     * @param: departName: String, departType: String, description: String, location: Location, message: String,
     * public GeneralMarketing constructor
     */
    public GeneralMarketing(String departName, String departType, String description, Location location, String message) {
        super(departName, departType, description, location);
        this.message = message;
    }

    /**
     * @param: None
     * @return: List<String>
     * return the list of social media message
     * */
    @Override
    public List<String> showNewsAndMessages() {
        return generateMessage(message);
    }

    /**
     * @param: message: String
     * @return: List<String>
     * generate and store social media message in list
     * */
    private List<String> generateMessage(String message) {

        List<String> messageList = new ArrayList<>();
        messageList.add(message);
        return messageList;
    }

    /**
     * @param: products: List<Product>, id: String, price: int
     * @return: None
     * reset price for products
     * */
    public static void goodsChangedPrice(List<Product> products, String id, int price) {

        for (Product product : products) {
            if (product.getProductID().equals(id)) {
                product.setPrice(price);
            }
        }
    }

    /**
     * @param: services: List<Service>, id: String, price: int
     * @return: None
     * reset price for services
     * */
    public static void serviceChangedPrice(List<Service> services, String id, int price) {

        for (Service service : services) {
            if (service.getId().equals(id)) {
                service.setPrice(price);
            }
        }
    }

    /**
     * @param: systemList1: List<String>, systemList2: List<String>, systemList3: List<String>, adsCampaignLevel: int, adsTitle: String
     * @return: None
     * add ads campaign by level
     * */
    public static void addAdsCampaign(List<String> systemList1, List<String> systemList2, List<String> systemList3, int adsCampaignLevel, String adsTitle) {

        if (adsCampaignLevel == 1) {
            systemList1.add(adsTitle);
        }
        else if (adsCampaignLevel == 2) {
            systemList2.add(adsTitle);
        }
        else if (adsCampaignLevel == 3) {
            systemList3.add(adsTitle);
        }
        else {
            System.out.println("The advertising is not good enough to be campaign!");
        }
    }

    /**
     * @param: promOption: int
     * @return: None
     * display promotion information by number choose
     * */
    public static void promPriceAndCoupon(int promOption) {

        switch (promOption) {
            case 1:
                System.out.println("Holiday, 50% off entire purchased");
                break;
            case 2:
                System.out.println("Company promotion, 60% off entire purchased");
                break;
            case 3:
                System.out.println("Company promotion coupons send out");
                break;
            default:
                System.out.println("Regular price, no promotion come out yet!");
        }
    }

    /**
     * @param: None
     * @return: None
     * print Marketing department information and social media message
     * */
    @Override
    public String toString() {
        return "The social media message is: \n" + showNewsAndMessages() + "\n" + super.toString();
    }
}
