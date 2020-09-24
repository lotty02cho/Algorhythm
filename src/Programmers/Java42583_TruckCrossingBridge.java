package Programmers;

import java.util.*;

public class Java42583_TruckCrossingBridge {

     /*
        프로그래머스
        문제: 다리를 지나는 트럭

        https://programmers.co.kr/learn/courses/30/lessons/42583
     */

    static int bridge_length = 2;
    static int weight = 10;
    static int[] truck_weights = {7,4,5,6};

    public static void main(String args[]){

        System.out.println(solution(bridge_length, weight, truck_weights));

        return;
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights){
        int time =0;
        // 큐라는 다리 선언
        Queue<Integer> q = new LinkedList<>();

        //누적 무게값 변수
        int accumulatedWeight = 0;
        for(int currentTw : truck_weights){

            while(true){
                // 1. 다리가 비어있는 경우
                if(q.isEmpty()){
                    // 다리에 올라감
                    q.offer(currentTw);
                    // 누적 무게값 추가
                    accumulatedWeight += currentTw;
                    // 시간 추가
                    time++;
                    break;
                }
                // 3. [Break Point] 다리에 올라온 값이 다리 크기와 같을 때,
                else if( q.size() == bridge_length ){
                    // 무게 체크값을 먼저 들어간 값만큼 빼줌(poll)
                    accumulatedWeight -= q.poll();
                } else {
                    // 현재 차량 무게 + 누적 차량 무게 > 다리 무게
                    if(accumulatedWeight + currentTw > weight){
                        // 아무것도 올리지 않고, 시간만 추가
                        q.offer(0);
                        time++;
                    }
                    // 현재 차량 무게 + 누적 차량 무게 <= 다리 무게
                    else {
                        q.offer(currentTw);
                        accumulatedWeight += currentTw;
                        time++;
                        break;
                    }
                }
            }
        }
        return time+bridge_length;
    }

}
