package javaDay8;

public class CalcController {
    // TODO
    //  * 뷰 클래스(CalcView)를 이용하여 데이터를 입력 받는다.
    //  * 계산된 결과는 뷰 클래스(CalcView)의 printResult 메서드를 이용하여 출력한다.
    //  * 계산기 프로그램은 계속 동작 하되 연산자에 E라는 문자가 들어오면 프로그램을 종료할 것
    ICalcService service;

    public CalcController(ICalcService service) {
        this.service = service;
    }

    public void applicationStart() {
        CalcView view = new CalcView();
        // while에 로직을 구현하시오.(연산자에 따라서 switch~ case로 분기 하면 된다.)
        while (true) {
        }//
    }

}
