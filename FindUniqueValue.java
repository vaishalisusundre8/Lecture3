package org.example.Lecture3;

import java.util.Scanner;

public class FindUniqueValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" Element : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        System.out.println(findUnique(a));
    }
    static int findUnique(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    a[i]=-1;
                    a[j]=-1;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                return a[i];
            }
        }
        return -1;
    }
}
