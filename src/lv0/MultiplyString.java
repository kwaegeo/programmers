package lv0;

public class MultiplyString {

    public static String solution(String my_string, int k) {
        String answer = "";

        for(int i=0; i<k; i++){
            answer += my_string;
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution("String", 3));


        System.out.println("String".repeat(5));

    }

}
