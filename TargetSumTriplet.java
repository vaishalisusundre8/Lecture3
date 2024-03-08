package org.example.Lecture3;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class TargetSumTriplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" Element : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter Target : ");
        int x=sc.nextInt();

        System.out.println(tripletSum(a,x));
    }
    static int tripletSum(int a[],int x){
        int cnt=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=j+1;k<a.length;k++){
                    if(a[i]+a[j]+a[k]==x){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
