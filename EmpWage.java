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
        int totalWage=0;
        int total_day=0;
        int total_hour=0;
        int total_working_day=20;

        while ((total_day < 20 && total_hour < 100))
        {
            int check=att.nextInt(max);
            switch (check)
            {
                case 1:
                    totalWage=totalWage+wage_per_hour*hour_in_day;
                    total_day=total_day+1;
                    break;
                case 2:
                    totalWage=totalWage+wage_per_hour*half_time;
                    total_hour=total_hour+4;
                    break;
                default:

                    break;
            }

        }
        System.out.println("Total Wage for month : "+totalWage);
        System.out.println("total Days : " +total_day);
        System.out.println("total hour : "+total_hour);

    }

}
