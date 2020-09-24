package com.EmpWage.DAO;

public class EmpWageDAO {
    private int half_time;
    private int wage_per_hour;
    private int hour_in_day;
    private int totalWage;
    private int total_day;
    private int total_hour;
    private int total_working_day;


    public int getHalf_time() {
        return half_time;
    }

    public EmpWageDAO(int half_time, int wage_per_hour, int hour_in_day, int totalWage, int total_day, int total_hour, int total_working_day) {
        this.half_time = half_time;
        this.wage_per_hour = wage_per_hour;
        this.hour_in_day = hour_in_day;

        this.totalWage = totalWage;
        this.total_day = total_day;
        this.total_hour = total_hour;
        this.total_working_day = total_working_day;
    }

    public void setHalf_time(int half_time) {
        this.half_time = half_time;
    }

    public int getWage_per_hour() {
        return wage_per_hour;
    }

    public void setWage_per_hour(int wage_per_hour) {
        this.wage_per_hour = wage_per_hour;
    }

    public int getHour_in_day() {
        return hour_in_day;
    }

    public void setHour_in_day(int hour_in_day) {
        this.hour_in_day = hour_in_day;
    }

    public int getTotalWage() {
        return totalWage;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public int getTotal_day() {
        return total_day;
    }

    public void setTotal_day(int total_day) {
        this.total_day = total_day;
    }

    public int getTotal_hour() {
        return total_hour;
    }

    public void setTotal_hour(int total_hour) {
        this.total_hour = total_hour;
    }

    public int getTotal_working_day() {
        return total_working_day;
    }

    public void setTotal_working_day(int total_working_day) {
        this.total_working_day = total_working_day;
    }
}
