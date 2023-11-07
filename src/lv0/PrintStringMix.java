package lv0;

public class PrintStringMix {
    public static String solution(String str1, String str2) {
        String answer = "";

        int minLen = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLen; i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        String result = solution("aaaaa", "bbbbb");
        System.out.println(result);
    }

}
