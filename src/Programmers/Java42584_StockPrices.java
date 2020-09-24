package Programmers;

import java.util.*;

public class Java42584_StockPrices {
    public static void main(String[] args){

        int[] prices = {1,2,3,2,3};

        System.out.println(Arrays.toString(solution(prices)));
    }
    public static int[] solution(int[] prices) {
        // prices =[1,2,3,2,3]
        
        int k=0;
        
        int[] answer = new int[prices.length];
        
        for(int i = 0; i< prices.length; i++){
            int sec = 0;
            
            for(int j = 1+k; j<prices.length; j++){
                if(prices[i]<=prices[j]){
                    sec++;
                } else {
                    sec++;
                    break;
                }
            }
            answer[i] = sec;
            k++;
        }
        return answer;
    }
}