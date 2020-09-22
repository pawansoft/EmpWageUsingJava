package com.EmpWage;

import java.util.Random;

public class EmpWage {
    public static void main(String[] args) {
        Random att=new Random();
        int max=3;
        int half_time=4;
        int wage_per_hour=20;
        int hour_in_day=8;
        int present=1;
        int check=att.nextInt(max);
        int totalWage;
        switch (check)
        {
            case 1:
                totalWage=wage_per_hour*hour_in_day;
                System.out.println("total Wage for Day : " + totalWage);
                break;
            case 2:
                totalWage=wage_per_hour*half_time;
                System.out.println("PartTime Wage : " + totalWage);
                break;
            default:
                System.out.println("Employee is absent");
                break;
        }

    }

}
