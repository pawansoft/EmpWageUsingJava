package com.EmpWage;

import com.EmpWage.DAO.EmpWageDAO;
import com.EmpWage.POJO.EmpWagePojo;

public class Driver {
    public static void main(String[] args) {
        EmpWageDAO ed=new EmpWageDAO(4, 20, 8, 1, 0,0,0,0);
        EmpWagePojo empWagePojo=new EmpWagePojo();
        System.out.println("Calculated Total Wage : " +empWagePojo.calculate_Total_Wage(3, ed.getHalf_time(),ed.getWage_per_hour(), ed.getHour_in_day(),ed.getPresent(), ed.getPresent(), ed.getTotalWage() ,ed.getTotal_hour(),ed.getTotal_working_day()));
    }
}
