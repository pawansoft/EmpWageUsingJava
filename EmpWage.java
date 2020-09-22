package com.EmpWage;

import java.util.Random;

public class EmpWage {
    public static void main(String[] args) {
        Random att=new Random();
        int max=2;
        int present=1;
        int check=att.nextInt(max);
        if(check == present)
        {
            System.out.println("Employee is present");
        }
        else
        {
            System.out.println("Employee is absent");
        }
    }

}
