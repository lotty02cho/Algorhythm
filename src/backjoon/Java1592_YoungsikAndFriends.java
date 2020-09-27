package backjoon;

import java.util.*;
import java.io.*;

public class Java1592_YoungsikAndFriends {
    /*
        백준
        문제: 영식이와 친구들

        https://www.acmicpc.net/problem/1592
    */
    static int N;
    static int M;
    static int L;
    static int[] people;
    static boolean flag;
    static int answer;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        //5
        N = sc.nextInt();
        // int[5]
        people = new int[N];
        M = sc.nextInt();
        L = sc.nextInt();

        int j = 0;
        while(true){
            // 누적 던진횟수 체크
            for(int i = 0; i < N; i++){
                if(people[i]==M){
                    flag = true;
                    break;
                }
            }
            // 누적 횟수를 넘겼다면 break
            if(flag){
                break;
            }

            //짝수
            if(people[j]%2==0){
                people[j]+=1;
                answer++;
                // 0보다 작은수까지 넘어갔으면, N을 더해줘서 보정해줘야 함.
                // ex) j = 0; L = -3 N = 5; --> j = -3 --> j+N=2 즉, 2번째 친구한테로 넘어감
                j-=L;
                if(j<0){
                    j+=N;
                }
            }
            // 홀수
            else{
                people[j]+=1;
                answer++;
                // N보다 큰수까지 넘어갔으면, N을 더해줘서 보정해줘야 함.
                // ex) j = 3; L = 3 N = 5; --> j = 6 --> j-N=1 즉, 1번째 친구한테로 넘어감
                j+=L;
                if(j>=N){
                    j-=N;
                }
            }

        }
        System.out.println(answer-1);

    }


}
