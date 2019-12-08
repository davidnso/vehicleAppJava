/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleapp;

/**
 *
 * @author David
 */
public abstract class VehicleRates {
    public abstract double getDailyRate(); // cost per day
    public abstract double getWeeklyRate(); // cost per week
    public abstract double getMonthlyRate(); // cost per month
    public abstract double getMileageChrg(); // cost per mile, based on vehicle type
    public abstract double getDailyInsurRate(); // insurance cost (per day)
    public abstract void setDailyRate(double x);
    public abstract void setWeeklyRate(double x);
    public abstract void setMonthlyRate(double x);
    public abstract void setMileageCharge(double x);
    public abstract void setDailyInsuranc(double x);
}
