package com.careerit.cj1.basics;
import java.util.Scanner;
public class CabAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count");
        int count = sc.nextInt();
        System.out.println("enter the capacity");
        int capacity = sc.nextInt();
        int required_cabs = 0;
        if(count % capacity == 0) {
            required_cabs = count / capacity;
            System.out.println("required cabs are:" + required_cabs);
        }
            else{
            required_cabs = count / capacity + 1;
            System.out.println("required cabs are:" + required_cabs);

        }

        }
    }

