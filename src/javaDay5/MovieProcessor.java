package javaDay5;

import java.util.Scanner;

public class MovieProcessor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MovieOperation mo = new MovieOperation();
        String str;
        while (true) {
            System.out.println("======== 장르별 영화 검색 프로그램(그룹 이름) ==========");
            System.out.println("1.영화입력(I) 2.영화출력(P) 3.영화검색(S) 4.종료(E)");
            System.out.println("=============================================");
            str = scan.nextLine();
            if(str.equals("I")){
                while(true){
                    System.out.println("영화를 입력해 주세요");
                    String a = scan.nextLine();
                    if(a.equals("-1")) break;
                    mo.input(a);
                }
            } else if(str.equals("P")){
                mo.output();
            } else if(str.equals("S")){
                System.out.println("장르를 입력하세요");
                mo.search(scan.nextInt());
            } else if(str.equals("E")){
                break;
            }else{
                System.out.println("I,S,P,E 중 한가지를 입력해 주세요");
            }
        }
    }
}