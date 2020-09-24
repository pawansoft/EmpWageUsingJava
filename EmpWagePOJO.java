package com.EmpWage.POJO;

import com.EmpWage.POJI.EmpWagePOJI;

import java.util.HashMap;
import java.util.Random;

public class EmpWagePojo implements EmpWagePOJI {
    public final int max=3;
    HashMap dailyWage=new HashMap();
    int absentee=0;
    int fullDay=0;
    Random att=new Random();
    @Override
    public int calculate_Total_Wage(int workingHourPerMonth, int workingDayInMonth, int half_time, int wage_per_hour, int hour_in_day, int totalWage, int total_day, int total_hour, int total_working_day) {

        while ((total_day <= workingDayInMonth && total_hour <= workingHourPerMonth))
        {
            int check=att.nextInt(max);

            switch (check)
            {
                case 1:
                    totalWage=totalWage+wage_per_hour*hour_in_day;
                    total_day=total_day+1;
                    fullDay=fullDay+1;
                    break;

                case 2:
                    totalWage=totalWage+wage_per_hour*half_time;
                    total_hour=total_hour+4;
                    total_day=total_day+1;
                    break;

                default:
                    absentee=absentee+1;
                    break;
            }


        }
        System.out.println("Total Part Time Hour" + total_hour);
        System.out.println("Total Full Time Working Day" + fullDay );
        System.out.println("Total Absent in this month :" +absentee);
        return totalWage;
    }

    @Override
    public HashMap WagePerDay(int workingHourPerMonth, int workingDayInMonth, int half_time, int wage_per_hour, int hour_in_day, int totalWage, int total_day, int total_hour, int total_working_day) {
        while ((total_day <= workingDayInMonth && total_hour <= workingHourPerMonth))
        {
            int check=att.nextInt(max);

            switch (check)
            {
                case 1:
                    totalWage=totalWage+wage_per_hour*hour_in_day;
                    total_day=total_day+1;
                    fullDay=fullDay+1;
                    dailyWage.put(total_day, totalWage);
                    break;

                case 2:
                    totalWage=totalWage+wage_per_hour*half_time;
                    total_hour=total_hour+4;
                    total_day=total_day+1;
                    dailyWage.put(total_day,totalWage);
                    break;

                default:
                    absentee=absentee+1;
                    break;
            }


        }
        System.out.println("Total Part Time Hour" + total_hour);
        System.out.println("Total Full Time Working Day" + fullDay );
        System.out.println("Total Absent in this month :" +absentee);
        return dailyWage;
    }
}


