package lv0;

public class PlusAndMultiply {

    public static int solution(int a, int b) {
        int answer = 0;

        String aa = String.valueOf(a);
        String bb = String.valueOf(b);

        if(Integer.parseInt((aa+bb)) > 2*a*b){
            answer = Integer.parseInt((aa+bb));
        }
        else{
            answer = 2*a*b;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 91));
        System.out.println(solution(91, 2));


        System.out.println(Math.max(Integer.parseInt(String.valueOf(2)+String.valueOf(91)),2*2*91));

    }

}
