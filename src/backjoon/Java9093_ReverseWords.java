package backjoon;

import java.io.*;
import java.util.Arrays;

public class Java9093_ReverseWords {
    /*
        백준
        문제: 단어 뒤집기

        https://www.acmicpc.net/problem/1592
    */
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());

        for(int i = 0; i < k ; i++){
            String[] input = br.readLine().split(" ");
//            System.out.println(Arrays.toString(input));
            for(int j=0;j<input.length;j++)
            {
                for(int m=input[j].length()-1; m>=0; m--)
                {
                    bw.write(input[j].charAt(m));
                }
                bw.write(" ");
            }
            bw.write("\n");
        }

        bw.close();
        return;
    }


}
