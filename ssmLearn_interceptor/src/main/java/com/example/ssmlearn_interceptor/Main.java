package com.example.ssmlearn_interceptor;
import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            int x=1,y=5;
            System.out.println("input:");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            for(int i = 0; i<=a; i++){
                int num = (a*i + x);
                System.out.println(num);
                if(num == y){
                    break;
                }
            }
        }
    }
