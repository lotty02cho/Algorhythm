package Programmers;

import java.util.*;

public class Java42576_RetiredPlayer {

    static String[] participant = {"leo", "kiki", "eden"};
    static String[] completion = {"eden", "kiki"};

    public static void main(String[] args){
        System.out.println("Java42576_RetiredPlayer");
        /*
            프로그래머스
            문제: 완주하지 못한 선수
            https://programmers.co.kr/learn/courses/30/lessons/42576?language=java
         */


        System.out.println(solution(participant, completion));


    }

    public static String solution(String[] participant, String[] completion) {

        String answer="";

        // 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;

        // for문 돌리며 중복되는 값이 하나도 나오지 않았다면, 그 값이 곧 정답
        for(i = 0; i < completion.length; i ++){
            if( !participant[i].equals(completion[i]) ){
                answer = participant[i];
                return answer;
            }
        }

        // 돌았는데, 나머지가 있다면 그 값이 곧 정답
        answer = participant[i];
        return answer;

    }
}
