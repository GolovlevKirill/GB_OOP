public class CalculableFactory implements iCalculableFactory {
    public iCalculable create(int primaryArg, boolean logFlag) {
        if (logFlag) {
            iCalculable calculator =  new Calculator(primaryArg);
            return new LoggableCalculator(calculator);
        }
        return new Calculator(primaryArg);
    }
}