package lv0;

import java.util.Scanner;

public class ArrayToString {

    public static String solution(String[] arr) {
        String answer = "";

        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }


        return answer;
    }
    public static void main(String[] args) {
        String [] request = {"a", "b", "c"};

        System.out.println(solution(request));

    }

}
