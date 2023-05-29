import java.util.Scanner;

public class ViewComplex {
    private Scanner scanner;

    public ViewComplex() {
        scanner = new Scanner(System.in);
    }

    public void showComplInput() {
        System.out.println("_____________________________");
        System.out.println("Введите два комплексных числа:");
        // System.out.println("1. Сложение");
        // System.out.println("2. Деление");
        // System.out.println("3. Умножение");
        // System.out.println("4. Выход");
    }

    public int getMenuChoice() {
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