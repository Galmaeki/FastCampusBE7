package javaDay8;

public class CalcController {
    ICalcService service;

    public CalcController(ICalcService service) {
        this.service = service;
    }

    public void applicationStart() {
        CalcView view = new CalcView();
        // while에 로직을 구현하시오.(연산자에 따라서 switch~ case로 분기 하면 된다.)
        while (true) {
            NumberDTO dto = new NumberDTO();
            String op = view.inputNumber(dto);
            if (op.equals("E")) {
                view.endCalc();
                break;
            } else {
                try {
                    switch (op) {
                        case "+" -> service.add(dto);
                        case "-" -> service.sub(dto);
                        case "*" -> service.mul(dto);
                        case "/" -> service.div(dto);
                    }
                    view.printResult(dto, op);
                }catch (ArithmeticException e){
                    view.divZero();
                }
            }
        }
    }

}
