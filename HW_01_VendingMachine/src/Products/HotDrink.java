package Products;

public class HotDrink extends Product {

    private int temperature;
    private double volume;

    public HotDrink(String name, double price, double volume)
    {
        super(name, price);
        this.volume = volume;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
/**
     * переопределение вывода продукта
     */
    @Override
    public String toString()
    {
        return  "Product{" +
        "name='" + super.getName() + '\'' +
        ", cost=" + super.getPrice() +
        ", volume=" + this.volume +
        ", temperature=" + this.temperature +
        '}';
    }
    
}
