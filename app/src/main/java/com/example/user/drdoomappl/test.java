package com.example.user.drdoomappl;
import java.util.Scanner;

public class test{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        if(a%(3600*24)/3600 < 10) {
            System.out.print("0"+a%(3600*24)/3600);
        }
        else
        {
            System.out.print(+a%(3600*24)/3600);
        }
        if(a%(3600)/60 < 10) {
            System.out.print(":"+"0"+a%(3600)/60);
        }
        else
        {
            System.out.print(":"+a%(3600)/60);
        }
        if(a%60 < 10) {
            System.out.print(":"+"0" + a % 60);
        }
        else
        {
                System.out.print(":"+a%60);
        }
    }
}