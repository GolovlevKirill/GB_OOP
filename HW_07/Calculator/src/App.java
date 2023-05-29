// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        iCalculableFactory calculableFactory = new CalculableFactory();
        ViewCalculator view = new ViewCalculator(calculableFactory);
        ViewComplex viewComplex = new ViewComplex();
        Calculator calculator = new Calculator(0);
        
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("Выберите операцию(1-комплексные числа, 2-базовые функции):");
        choice = scanner.nextInt();
        
        if(choice == 1){
            System.out.println("---------------------------------");
            System.out.println("Выберите операцию(1 - сложение, 2 - умножение, 3 -  деление):");
            choice = scanner.nextInt();            
            viewComplex.showComplInput();
            System.out.println("Введите первое комплексное число:");
            ComplexNumber num1 = viewComplex.getComplexNumber();
            
            System.out.println("Введите второе комплексное число:");
            ComplexNumber num2 = viewComplex.getComplexNumber();

           
        // Выбор операции в зависимости от выбора пользователя
        switch (choice) {
            case 1:
                ComplexNumber sum = calculator.addition(num1,num2);
                System.out.println(sum);
                break;
            case 2:
                ComplexNumber addiction = calculator.multipl(num1,num2);
                System.out.println(addiction);
                break;
            case 3:
                ComplexNumber division = calculator.divis(num1,num2);
                System.out.println(division);
                break;
            default:
                // Вывод сообщения об ошибке при некорректном выборе пользователя
                System.out.println("Некорректный выбор");
        }
    } else view.run();
    }
}