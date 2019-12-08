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
public class Transaction{
 private String acctNum; // five-digit acct number
private String companName;
private String vehicleType; // car, SUV or Truck
private String rentalPeriod; // days, week, months
private String rentalCost;
    Transaction(String companName,String acctNum,String vehicleType,String rentalPeriod,String rentalCost){
    this.acctNum = acctNum; 
    this.companName=companName;
    this.vehicleType = vehicleType; 
    this.rentalPeriod = rentalPeriod; 
    this.rentalCost=rentalCost; 
    }
    Transaction(){
        acctNum = null; 
        companName=null; 
        vehicleType = null; 
        rentalCost = null; 
    }
    public void AppendFile(){
        
    }public String getAccountNum(){
        return acctNum; 
    }public String getCompanyName(){
        return companName;
    }public String getVehicleType(){
        return vehicleType; 
    }public String getRentalPeriod(){
        return rentalPeriod; 
    }public String getrentalCost(){
        return rentalCost;
    }
    public String toString(){
        return companName + " "+ acctNum + " " +vehicleType + " "+ rentalPeriod+" "+rentalCost+"\n";
    }
    
}
