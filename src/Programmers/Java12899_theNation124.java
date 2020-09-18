package Programmers;

import java.util.Arrays;

public class Java12899_theNation124 {

    public static void main(String[] args){
        System.out.println("Java42576_RetiredPlayer");
        /*
            프로그래머스
            문제: 124 나라의 숫자

            https://programmers.co.kr/learn/courses/30/lessons/12899
         */

        int n = 11;

        System.out.println(solution(n));


    }

    // 나머지에 따라 숫자가 정해짐
    // ex) 3 -> 3으로 나눴을때 0이므로, numbers[0]인 4가 출력됨
    static String[] numbers = {"4", "1", "2"};
    static String answer ="";

    public static String solution(int n) {

        while(n>0){
            // 자릿수 k
            int k = n%3;
            // 나눈수는 while문 조건에 부합할때까지 계속 나눔
            n /= 3;

            // k가 0으로 나눠질때, roof문이 더 안돌게 n==0으로 구성
            if(k==0) n--;

            // 자릿수를 뒤에서부터 붙혀야 함으로 '+ answer' 로 누적
            answer = numbers[k] + answer;
        }


        return answer;
    }
}
