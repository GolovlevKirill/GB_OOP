// Интерфейс возврата товара

package Interfaces;

public interface iReturnOrder {

    void orderId(); // идентификация возврата
    void orderStatus(); //возвращен или не возвращен
    void conditionOforder(); // состояние возвращенного товара(вскрывался/не вскрывался)
}
