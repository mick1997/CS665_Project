
class Card{

}

// The shape between the Plugs of appliances and the power outlets.
interface IMoneyReceiver{
    void receiveMoney(int amount);
}

interface ICardProvider{
    Card[] getAllCards();
}

class Player implements IMoneyReceiver, ICardProvider{
    public void method1(){}
    public void method2(){}
    public void method3_changed(){}
    public void receiveMoney(int amount) {

    }
    public Card[] getAllCards() {
        return null;
    }
}

class Dealer{
    public void method1(){}
    public void method2(){}
    public void method3_changed(){}
    public void receiveMoneyToCasino(int amount) {

    }
    public Card[] getAllCards() {
        return null;
    }
}

interface SomeOtherCardProvider{
    Card[] myCards();
}

class DealerAdaptor implements IMoneyReceiver, ICardProvider{
    private Dealer dealer;
    private SomeOtherCardProvider provider;


    @Override
    public void receiveMoney(int amount) {
        dealer.receiveMoneyToCasino(amount);
    }

    @Override
    public Card[] getAllCards() {
        return provider.myCards();
    }
}

class MoneyRecieverDummy implements IMoneyReceiver {

    @Override
    public void receiveMoney(int amount) {
        System.out.println("I got $");
    }
}


//todo: Google TDD test-driven development

// Analogy: power outlets on the wall, which needs a thirds object to connect plugs to outlets.
// In this simple project, the third object or connector should be the main method.
// This is the GameController
public class TestClass {
    private IMoneyReceiver moneyReciever;
    private ICardProvider cardProvider;

    private void round(){
        moneyReciever.receiveMoney(30);
        Card[] cards = cardProvider.getAllCards();
    }
}


