import java.util.Scanner;

public class ViewCalculator {

    private iCalculableFactory calculableFactory;

    public ViewCalculator(iCalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            int primaryArg = promptInt("Введите первый аргумент: ");
            iCalculable calculator = calculableFactory.create(primaryArg, true);
            while (true) {
                String cmd = prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }



    private Scanner scanner;

    // public void ViewComplex() {
    //     scanner = new Scanner(System.in);
    // }

    public void showMenuCompl() {
        System.out.println("_____________________________");
        System.out.println("Калькулятор комплексных чисел");
        System.out.println("1. Сложение");
        System.out.println("2. Деление");
        System.out.println("3. Умножение");
        System.out.println("4. Выход");
    }

    public int getMenuChoiceCompl() {
        System.out.print("Выберите операцию: ");
        return scanner.nextInt();
    }

    public ComplexNumber getComplexNumber() {
        System.out.print("Введите действительную часть: ");
        double realPart = scanner.nextDouble();
        System.out.print("Введите мнимую часть: ");
        double imaginaryPart = scanner.nextDouble();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public void showResult(ComplexNumber result) {
        System.out.println("Результат: " + result.toString());
    }
   
}