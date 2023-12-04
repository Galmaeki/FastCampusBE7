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
                    /*
영화1: '기생충', 주연: '김기택', 러닝타임: 132, 평점: 8.6, 장르: 1
영화2: '올드보이', 주인공: '오대수', 러닝타임: 120, 평점: 8.4, 장르: 2
영화3: '괴물', 주인공: '박강두', 러닝타임: 119, 평점: 7.1, 장르: 3
                     한줄씩 그대로 입력
                    * */
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