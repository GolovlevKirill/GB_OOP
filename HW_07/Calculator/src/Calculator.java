public final class Calculator implements iCalculable, iOperationComplexNum{

    private int primaryArg;

    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public iCalculable sum(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public iCalculable multi(int arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public int getResult() {
        return primaryArg;
    }



    /**
     * Реализация интерфейса для работы с комплексными числами
     */
    @Override
    public ComplexNumber addition(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }

    @Override
    public ComplexNumber multipl(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary(),
        a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal());
    }

    @Override
    public ComplexNumber divis(ComplexNumber a, ComplexNumber b) {
        // Вычисляем знаменатель
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        // Вычисляем действительную часть результата
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        // Вычисляем мнимую часть результата
        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        // Возвращаем новое комплексное число
        return new ComplexNumber(real, imaginary);
    }
    
}
