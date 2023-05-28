public final class Calculator implements iCalculable, iCalcComplex {

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

    // методы для работы с комплексными числами
    @Override
    public iCalcComplex sumX(int arg) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sumX'");
    }

    @Override
    public iCalcComplex multiX(int arg) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multiX'");
    }

    @Override
    public iCalcComplex divX(int arg) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'divX'");
    }
}
