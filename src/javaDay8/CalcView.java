package javaDay8;

import java.util.Scanner;

public class CalcView {
    Scanner scan = new Scanner(System.in);

    public String inputNumber(NumberDTO dto) {
        System.out.print("두 수와 연산자를 입력하세요.(ex: 6 7 +):");
        String[] str = scan.nextLine().split(" ");
        try{
        dto.setNum1(Integer.parseInt(str[0]));
        dto.setNum2(Integer.parseInt(str[1]));
        return str[2];
        } catch (Exception e){
            System.out.println("다시 입력해 주세요");
            return inputNumber(dto);
        }
    }

    public void printResult(NumberDTO number, String op) {
        System.out.printf("두 수 %d와 %d의 ", number.getNum1(), number.getNum2());
        switch (op) {
            case "+" -> System.out.printf("합은 %f 입니다", number.getResult());
            case "-" -> System.out.printf("차는 %f 입니다", number.getResult());
            case "*" -> System.out.printf("곱은 %f 입니다", number.getResult());
            case "/" -> System.out.printf("몫 %f 입니다", number.getResult());
        }
        System.out.println();
    }

    public void endCalc() {
        System.out.println("계산기 종료");
    }

    public void divZero() {
        System.out.println("0으로 나눌 수 없습니다 \n처음으로 돌아갑니다");
    }
}
