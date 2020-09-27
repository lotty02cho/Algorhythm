package backjoon;

import java.util.*;


public class Java1268_TemporaryClassCaptain {
    /*
        백준
        문제: 임시 반장 정하기

        https://www.acmicpc.net/problem/1268
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int[][] studentClass = new int[1010][10];
        int[][] cnt = new int[1010][1010];

        for(int i = 1; i <= students; i++){
            for(int j = 1; j <= 5 ; j++){
                studentClass[i][j] = sc.nextInt();
            }
        }

//        for(int i=1; i<5; i++) {
//            System.out.println(Arrays.toString(studentClass[i]));
//        }

        for(int k = 1; k<=5; k++){
            for(int i = 1 ; i<= students; i++){
                for(int j = 1 ; j<= students; j++){
                    if(i==j) continue;
                    if(studentClass[i][k]==studentClass[j][k]){
                        cnt[i][j] = 1;
                    }
                }
            }
        }

        int maxCnt = 0;
        int answer = 1;
        for(int i = 1; i <= students; i++) {
            int c = 0;
            for(int j = 1; j <= students; j++){
                c += cnt[i][j];
            }
            if(maxCnt<c){
                maxCnt = c;
                answer = i;
            }
        }
        System.out.println(answer);


    }
}
