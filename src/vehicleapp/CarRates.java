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
public class CarRates extends VehicleRates{
double dailyRate = 24.95; 
	double weeklyRate = 149.95;
	double monthlyRate = 514.95;
	double mileageCharge = .15; 
	double insurancerRates = 14.95; 
        CarRates(){}
    @Override
	public double getDailyRate() {
		
		return dailyRate;
	}

	@Override
	public double getWeeklyRate() {
		// TODO Auto-generated method stub
		return weeklyRate;
	}

	@Override
	public double getMonthlyRate() {
		// TODO Auto-generated method stub
		return monthlyRate;
	}

	@Override
	  public double getMileageChrg() {
		// TODO Auto-generated method stub
		return mileageCharge;
	}

	@Override
	public double getDailyInsurRate() {
		// TODO Auto-generated method stub
		return insurancerRates;
	}

    @Override
    public void setDailyRate(double x) {
        dailyRate = x; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setWeeklyRate(double x) {
       weeklyRate = x; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMonthlyRate(double x) {
        monthlyRate = x; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMileageCharge(double x) {
        mileageCharge = x; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDailyInsuranc(double x) {
        insurancerRates = x; //To change body of generated methods, choose Tools | Templates.
    }
    
}
