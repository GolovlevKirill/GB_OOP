package Classes;

import Interfaces.iReturnOrder;

public class OrdinaryClient extends Actor implements iReturnOrder{

    public OrdinaryClient(String name)
    {
        super(name);
    }

    @Override
    public String getName() {        
        return super.name;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;   
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public void conditionOforder() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void orderId() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void orderStatus() {
        // TODO Auto-generated method stub
        
    }

    
}