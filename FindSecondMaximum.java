package org.example.Lecture3;

import java.util.Scanner;

public class FindSecondMaximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size : ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Element : ");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        System.out.println(findsecmax(a));

    }
    static int findsecmax(int a[]){
        int max=a[0];
        int smax=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<max){
                a[i]=max;
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=max && a[i]<smax){
                smax=a[i];
            }
        }
        return smax;
    }
}
