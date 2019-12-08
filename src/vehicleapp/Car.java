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
import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle{
	
	String makeModel; 
	int seatingCapacity;
	String Vin;
	int mpg;
	String type="Car";
        CarRates carRate = new CarRates();
	private ArrayList<Vehicle> agency_vehicles = new ArrayList(); 
	
	Car(String n,int a,String p,Reservation rs,int l){
		super(n,a,p,rs);
		makeModel = n;
		Vin=p;
		mpg=a;
		seatingCapacity = l;
	}
	Car(){
		
	}
	//IGNORE ALL OF THIS CODE!!!
	
	@Override
	public String toString() {
		
		return makeModel+"("+type+") MPG: "+mpg+" Seating:" + seatingCapacity+" VIN:"+Vin;
	}
	
	

}
