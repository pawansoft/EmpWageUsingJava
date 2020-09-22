package com.EmpWage;

import java.util.Random;

public class EmpWage {
    public static void main(String[] args) {
        Random att=new Random();
        int max=2;
        int wage_per_hour=20;
        int hour_in_day=8;
        int present=1;
        int check=att.nextInt(max);
        if(check == present)
        {
            int totalWage=wage_per_hour*hour_in_day;
            System.out.println("total Wage for Day : " + totalWage);
        }
        else
        {
            System.out.println("Employee is absent");
        }
    }

}
