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

public class SUV extends Vehicle {
	
	int seatingCapacity;
	int cargoCapacity;
	String Vin;
	int mpg;
	String des; 
	String type="SUV";
        SUVRates rates = new SUVRates();
	private ArrayList<Vehicle> agency_vehicles = new ArrayList();
	SUV(String n,int a,String p,int s,Reservation rs,int l){
		super(n,a,p,rs);	
		des=n;
		mpg=a;
		seatingCapacity = l;
		cargoCapacity = s;
		Vin=p;
		
	}
	
	@Override
	public String toString() {
		
		return des+"("+type+") MPG: "+mpg+" Seating:" + seatingCapacity+" Storage: "+cargoCapacity +" cu. ft. VIN:"+Vin;
	}

	
}