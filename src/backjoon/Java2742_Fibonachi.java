package backjoon;

import java.util.*;

class Java2742_Fibonachi {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(fibo(num));

    }

    public static int fibo(int n){
        if(n==0){
            return n;
        }
        else if(n==1){
            return n;
        }
        else {
            return fibo(n-1)+fibo(n-2);
        }
    }
}
