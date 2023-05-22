import java.util.Date;

public class zadanie3 {
    public static void main(String[] args) {
    }
    
    // 3) Переписать код в соответствии с Interface Segregation Principle:
    public interface Shape3d {
        double area();   
        double volume();
    }
    
    public interface Shape2d {
        double area();        
    }
   
//Класс для Circle
    public class Circle implements Shape2d {
        private double radius;

        public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
        public double area() {
        return 2 * 3.14 * radius;
    }
    
}
    
//Класс для Cube
    public class Cube implements Shape3d{
        private int edge;
        
        public Cube(int edge) {
            this.edge = edge;
        }
        
        @Override
        public double area() {
            return 6 * edge * edge;
        }
        
        @Override
        public double volume() {
            return edge * edge * edge;
        }
    }

}
    
    
    
    
    
    
    
    


 
