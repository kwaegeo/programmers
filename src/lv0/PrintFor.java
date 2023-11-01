package lv0;

import java.util.Scanner;

public class PrintFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        String strFor ="";
        for(int i=0; i<n; i++){
            strFor += str;
        }
        System.out.println(strFor);
        sc.close();
    }

}
