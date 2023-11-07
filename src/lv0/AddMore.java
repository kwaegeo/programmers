package lv0;

public class AddMore {

    public static int solution(int a, int b) {
        int answer = 0;

       String aa = String.valueOf(a);
       String bb = String.valueOf(b);


       if(Integer.parseInt((aa+bb)) > Integer.parseInt((bb+aa))){
           answer = Integer.parseInt((aa+bb));
       }else{
           answer = Integer.parseInt((bb+aa));
       }

        return answer;
    }


    public static void main(String[] args) {

        System.out.println(solution(9,91));
        System.out.println(solution(89,8));

    }


}
