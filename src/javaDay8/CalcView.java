package javaDay8;

import java.util.Scanner;

public class CalcView {
    Scanner scan = new Scanner(System.in);

    public String inputNumber(NumberDTO number) {
        System.out.print("두 수와 연산자를 입력하세요.(ex: 6 7 +):");
        String op;
        // number에 두 수를 저장하고 연산자를 op 에 저장하여 리턴 하도록 구현.

        return null;
//        return op;
    }

    public void printResult(NumberDTO number, String op) {
        System.out.printf("두 수 %d와 %d의 ", number.getNum1(), number.getNum2());
        // switch ~ case 문을 이용하여 op에따라 add, sub, mul, div를 출력하고 최종 결과값을 출력하는 부분 구현

    }
}
