package org.example.Lecture3;

import java.util.Scanner;

public class FirstRepetingValues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size : ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Element : ");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        System.out.println(firstRepeting(a));
    }
    static int firstRepeting(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
               if(a[i]==a[j]){
                   return a[i];
               }
            }
        }
        return -1;
    }
}
