package lv0;

import java.util.Arrays;

public class OverwriteStringReplace {
    public static String solution(String my_string, String overwrite_string, int s) {

        // 입력 문자열을 문자 배열로 변환
        char[] myChars = my_string.toCharArray();
        char[] overwriteChars = overwrite_string.toCharArray();

        // s가 my_string의 길이를 초과하지 않도록 보정
        if (s > myChars.length) {
            s = myChars.length;
        }

        for (int i = 0; i < overwriteChars.length; i++) {
            if (s + i < myChars.length) {
                myChars[s + i] = overwriteChars[i];
            } else {
                // my_string의 끝까지 도달하면 overwrite_string을 추가로 붙임
                myChars = Arrays.copyOf(myChars, myChars.length + 1);
                myChars[s + i] = overwriteChars[i];
            }
        }

        // 수정된 문자 배열을 문자열로 변환하여 반환
        return new String(myChars);
    }

    public static void main(String[] args) {
        String result = solution("c2c", "aaaaaaa", 2);
        System.out.println(result); // 출력: "aabbb"
    }
}
