import java.util.Date;

public class zadanie2 {
    public static void main(String[] args) {
    }
    // Базовый класс Vehicle
    public class Vehicle {
        private int maxSpeed;
        private String type;
        
        public Vehicle(int maxSpeed, String type) {
            this.maxSpeed = maxSpeed;
            this.type = type;
        }
        
        public int getMaxSpeed() {
            return this.maxSpeed;
        }
        public String getType() {
            return this.type;
        }
    }

    // Класс Car - Наследник Vehicle
    public class Car extends Vehicle{
        public double allowedSpeed = 0.8;//поле для разрешенной скорости Car
        
        public Car(int maxSpeed, String type) {
            super(maxSpeed, type);
        }
        
    }

    // Класс Bus - Наследник Vehicle
    public class Bus extends Vehicle{

        public double allowedSpeed = 0.6;// поле для разрешенной скорости Bus
        
        public Bus(int maxSpeed, String type) {
            super(maxSpeed, type);
        }
        
    }

    // Посдсчет разрешенной скорости
    public class SpeedCalculation {
        public double calculateAllowedSpeed(Car car){
            return car.getMaxSpeed() * car.allowedSpeed;
        }

        public double calculateAllowedSpeed(Bus bus){
            return bus.getMaxSpeed() * bus.allowedSpeed;
        }

    }

}
    
    
    
    
    
    
    
    


 
