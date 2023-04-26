// Аукционный клиент

package Classes;

import Interfaces.iReturnOrder;

public class ActionClient extends Actor implements iReturnOrder{
    private int actionName; // название акции
    private int actionId; // идентификационный номер акции

    public ActionClient(String name, int actionId){
        super(name);
        this.actionId = actionId;
    }
    
    public int getActionName() { // метод получения названия акции
        return actionName;
    }

    public int getActionId() {  // метод получения идентификационного номера акции
        return actionId;
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