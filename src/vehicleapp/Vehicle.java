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
public abstract class Vehicle {
	private String description; // make-model for cars and SUVs, length for trucks
	private int mpg;  // miles per gallon
	private String vin;  // unique vehicle identification number
	private Reservation resv=null;  
	Vehicle(String d,int m, String v,Reservation r){
		description=d; 
		mpg=m; 
		vin= v; 
		resv= r;
	}
	Vehicle(String d,int m,String v){
		description=d; 
		mpg=m; 
		vin= v; 
		resv= null;
	}
	Vehicle(){
		description= null; vin=null;resv=null; 
		mpg=0;
	}
	public int getMPG() {
		return mpg; 
	}
	public String getVIN() {
		return vin; 
	}
	public Reservation getReservation() {
		return resv; 
	}
	public void setReservation(Reservation r) {
		resv=r;
	}
	public void cancelReservation() {
		resv =null;
		System.out.println("Reservation canceled");
	}
	public abstract String toString(); // ABSTRACT METHOD – implemented in each subclass
	/*public boolean isReserved() {
		if(resv.getReservation() != null) {
			return false;
		}else {
		return true;
		}
	}
	/*public void reserve(Reservation r) {
		if(isReserved()) {
			throw new ReservedVehicleException();
		}
		
	}
	public void cancelReservation() { 
		if(!isReserved()) {
			throw new UnreservedVehicleException();
		}
		else {
		 resv = null;
		}
	} */
	
}
