
public class CalcLogger implements iLoggable{
    @Override
    public void saveLog(String str) {
        System.out.println("Log message: " + str);
    }
}