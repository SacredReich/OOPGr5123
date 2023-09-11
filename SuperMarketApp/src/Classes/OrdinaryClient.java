package Classes;

import Interfaces.iReturnOrder;

public class OrdinaryClient extends Actor implements iReturnOrder {

    // private boolean isTakenOrder;
    // private boolean isMakeOrder;

    public OrdinaryClient(String name) {
        super(name);
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public void setTakeOrder(boolean takenOrder) {
        super.isTakeOrder = takenOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    public Actor getActor() {
        return this;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public void returnOrder() {
        if (isReturned() == true)
            System.out.println("Заказ возвращен!");
    }

    @Override
    public boolean isReturned() {
        return true;
    }
}