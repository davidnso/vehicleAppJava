/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleapp;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author David
 */
public class Reservation {
	private String creditCardNum;// credit card number reserved under
	private String rentalPeriod;// e.g., “D4” (four days), “W2” (two weeks), “M1” (one month)
	private boolean insuranceSelected;// set to true if optional daily insurance wanted 
	
	Reservation(String c,String r,boolean i){
		creditCardNum = c; rentalPeriod = r; insuranceSelected = i;  
		
	}
        public boolean getDailyInsurance(){
            return insuranceSelected;
        }
        public String getRentalPeriod(){
            return rentalPeriod;
        }
        public String getCreditCardNum(){
            return creditCardNum;
        }
	public Reservation getReservation() {
		if(creditCardNum!=null) {
		return new Reservation(creditCardNum, rentalPeriod, insuranceSelected);
		}else{
			return null;}
		}
	public String cancelReservation() {
		creditCardNum=null;
		rentalPeriod=null;
		insuranceSelected=false;
		return "Reservation canceled";
	}
	public String toString() {
		if(creditCardNum!=null) {
		return "Credit Card: "+creditCardNum+" Rental Period: "+rentalPeriod
				+ " Insured: " + insuranceSelected;
		}
		else {
			return "No reservation made";
		}
	}
      
}
