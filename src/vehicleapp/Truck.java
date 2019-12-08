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

public class Truck extends Vehicle {
	
	int loadCapacity;
	String type="Truck";
	String Vin;
	int mpg;
	String des;
        TruckRates rates = new TruckRates();
	//ArrayList<Vehicle> agency_vehicles = new ArrayList();
	Truck(String n,int a,String p,Reservation rs,int l){
		super(n,a,p,rs);
		des=n;
		 loadCapacity = l;
		 Vin=p;
		 mpg=a;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return des+"("+type+") MPG: "+mpg+" Load Capacity:" + loadCapacity+"lbs. VIN:"+Vin;
	}
	
	


}
