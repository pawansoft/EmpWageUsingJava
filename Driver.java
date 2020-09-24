package com.EmpWage.Builder;

import com.EmpWage.DAO.EmpWageDAO;
import com.EmpWage.EmpWageBuilder;
import com.EmpWage.POJO.EmpWagePojo;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args)
    {
        //Declaring Array List to store the total Employee wage of company
        ArrayList wagePerCompany=new ArrayList<>();

        //creating object of scanner class to take input from user
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

            //Creating object of the Employee Data access Object
            EmpWageDAO empDAO=new EmpWageDAO(4,wage_per_hour,8,0,0,0,0);
            //Creating the object to plain java old object class
            EmpWagePojo empWagePojo=new EmpWagePojo();

            EmpWageBuilder empWageBuilder=new EmpWageBuilder();
            System.out.println("Thank you for using our services : " +company + " :-) ");
            int totalWage=empWagePojo.calculate_Total_Wage(workingHourPerMonth, workingDayInMonth, empDAO.getHalf_time(),empDAO.getWage_per_hour(), empDAO.getHour_in_day(), empDAO.getTotalWage(), empDAO.getTotal_day(),empDAO.getTotal_hour(),empDAO.getTotal_working_day());
            System.out.println("TotalWage for " + company + "=" +totalWage);
   //Setting the total wage in empWageBuilder class
            empWageBuilder.setCompanyName(company);
            empWageBuilder.setTotalWage(totalWage);
            System.out.println("Company : "+empWageBuilder.getCompanyName());
            System.out.println("TotalWage :" +empWageBuilder.getTotalWage());
    //Adding the each total wage in array list, fetching from employee builder
            wagePerCompany.add(empWageBuilder.getTotalWage());


        }
   //Printing the arraylist of object containing the total wage for each company
        for(Object wage: wagePerCompany)
        {
            System.out.println(wage);
        }

    }
}
