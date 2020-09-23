package com.EmpWage;

import com.EmpWage.DAO.EmpWageDAO;
import com.EmpWage.POJO.EmpWagePojo;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

	 System.out.println("Enter the number of companies :");
        int limit=sc.nextInt();
        for (int i=1;i<=limit; i++)
        {


        	System.out.println("Enter your company Name : ");
        	String company=sc.next();
       		System.out.println("Enter the Wage per hour :");
        	int wage_per_hour=sc.nextInt();
        	System.out.println("Enter the working day in a month : ");
        	int workingDayInMonth=sc.nextInt();
        	System.out.println("Enter Working hour per month : ");
        	int workingHourPerMonth=sc.nextInt();

        	EmpWageDAO ed=new EmpWageDAO(4, wage_per_hour, 8, 1, 0,0,0,0);
       		EmpWagePojo empWagePojo=new EmpWagePojo();
        	System.out.println("Thank you for using our services : " +company + " :-) ");
        	System.out.println("Your Calculated Total Wage : " +empWagePojo.calculate_Total_Wage(workingHourPerMonth,workingDayInMonth,3, ed.getHalf_time(),ed.getWage_per_hour(), ed.getHour_in_day(),ed.getPresent(), ed.getPresent(), ed.getTotalWage() ,ed.getTotal_hour(),ed.getTotal_working_day()));
	}    
    }
}
