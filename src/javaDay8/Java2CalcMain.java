package javaDay8;

public class Java2CalcMain {
    public static void main(String[] args) {
        ICalcService service = new CalcServiceBiz(); // upcasting
        CalcController controller = new CalcController(service);
        controller.applicationStart();
    }
}
