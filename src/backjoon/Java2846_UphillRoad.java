package backjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Java2846_UphillRoad {

    public static int N;
    public static int[] hill;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        hill = new int[N];

        for(int i = 0; i < N ; i++){
            hill[i] = sc.nextInt();
        }

        int standard = 0;
        int height = 0;
        Queue<Integer> q = new LinkedList<Integer>();

        for(int i = 0; i < hill.length; i++){
            if(i==0) {
                standard = hill[i];
                continue;
            }
//            System.out.println(hill[i]);
//            System.out.println(standard);
//            System.out.println("------------");
            if(hill[i] < standard || hill[i] == hill[i-1]){
//                System.out.println("기준보다 낮음");
                standard = hill[i];
                q.add(height);
                height = 0;
//                System.out.println(height);
//                System.out.println("------------");
            } else if(hill[i] >= standard){
                height += (hill[i]-standard);
                standard = hill[i];
//                System.out.println("기준보다 높음");
//                System.out.println(height);
//                System.out.println("------------");
                if(i== hill.length-1){
                    q.add(height);
                }
            }
        }

//        System.out.println(q.toString());

        int max = 0;
//        for(int i = 0 ; i <= q.size()+1; i++){
//            int temp = q.poll();
//            System.out.println(temp);
//            if(temp>max){
//                max = temp;
//            }
//        }

        while(!q.isEmpty())
        {
            int temp = q.poll();
            if(max<temp)
            {
                max = temp;
            }
        }



        System.out.println(max);



    }
}
