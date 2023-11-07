package lv0;

public class Flag {
    public static int solution(int a, int b, boolean flag) {

        int answer = 0;

        answer = flag ? a+b : a-b;

        return answer;

    }

    public static void main(String[] args) {
        System.out.println(solution(-4, 7, true));
        System.out.println(solution(-4, 7, false));
    }

}
