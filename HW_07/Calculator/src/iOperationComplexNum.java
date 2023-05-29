/**
 * Интерфейс для выполнения операций над комплексными числами.
 */
public interface iOperationComplexNum {
    
    /**
     * Выполнение операции над двумя комплексными числами.
     * @param a Первое комплексное число.
     * @param b Второе комплексное число.
     * @return Результат операции в виде комплексного числа.
     */
    ComplexNumber addition(ComplexNumber a, ComplexNumber b);
    ComplexNumber multipl(ComplexNumber a, ComplexNumber b);
    ComplexNumber divis(ComplexNumber a, ComplexNumber b);

}