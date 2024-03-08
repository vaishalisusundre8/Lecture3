package org.example.Lecture3;

import java.util.Scanner;

public class TargetSum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size  : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" Element : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter Target Value : ");
        int x=sc.nextInt();
        int ans=targetSum(a,x);
        System.out.println(ans);
    }
    static int targetSum(int a[],int x){
        int cnt=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==x){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
