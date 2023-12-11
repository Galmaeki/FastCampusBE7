package javaDay8;

public class CalcController {
    ICalcService service;

    public CalcController(ICalcService service) {
        this.service = service;
    }

    public void applicationStart() {
        CalcView view = new CalcView();
        while (true) {
            NumberDTO dto = new NumberDTO();
            String op = view.inputNumber(dto);
            if (op.equals("E")) {
                //연산자에 E가 들어오는 경우 프로그램을 종료
                view.endCalc();
                break;
            } else {
                try {
                    //0으로 나누는 경우를 컨트롤러 단에서 처리하기 위해 try를 사용
                    switch (op) {
                        //향상된 switch문으로 가독성 향상
                        case "+" -> service.add(dto);
                        case "-" -> service.sub(dto);
                        case "*" -> service.mul(dto);
                        case "/" -> service.div(dto);
                    }
                    view.printResult(dto, op);
                } catch (ArithmeticException e) {
                    //0으로 나누는 경우 발생할 예외 핸들링
                    view.divZero();
                }
            }
        }

    }
}