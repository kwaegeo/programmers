package lv0;

import java.util.Scanner;

public class Converting_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<a.length(); i++){
            char c = a.charAt(i);
            if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }else{
                sb.append(Character.toLowerCase(c));
            }
        }
        System.out.println(sb);
        System.out.println("!@#$%^&*(\\'\"<>?:;");

    }
}
