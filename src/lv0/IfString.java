package lv0;

public class IfString {

    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        switch (ineq + eq){
            case ">=":
                if(n >= m){
                    answer = 1;
                    break;
                }
                else{
                    answer = 0;
                    break;
                }
            case "<=":
                if(n <= m){
                    answer = 1;
                    break;
                }
                else{
                    answer = 0;
                    break;
                }
            case ">!":
                if((n > m)){
                    answer = 1;
                    break;
                }
                else{
                    answer = 0;
                    break;
                }
            case "<!":
                if((n < m)){
                    answer = 1;
                    break;
                }
                else{
                    answer = 0;
                    break;
                }
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution("<","=", 20, 50));
        System.out.println(solution(">","!", 41, 78));

    }
}
