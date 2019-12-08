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
public class Vehicles extends Vehicle {

	 ArrayList<Vehicle> agency_vehicles = new ArrayList();
	Vehicles(){ /*The constructor of the vehicles class will create and have these cars in it whenever it is called.*/
		Reservation rs = new Reservation("8420","D4",true);
		Vehicle chevy = new Car("Chevrolet Camero",30,"KH4GM4564GD",rs,2);
		Vehicle FordF = new Car("Ford Fusion",34,"AB4FG5689GM",null,4);
		Vehicle FordFH = new Car("Ford Fusion Hybrid",32,"KU4EG3245RW",null,4);
		Vehicle ChevyI = new Car("Chevrolet Impala",30,"RK3BM4256YH",null,4);
		
		Vehicle HondaO = new SUV("Honda Odyssey", 28, "VM9RE2645TD",6, null, 7);
		Vehicle DodgeC = new SUV("Dodge Caravan", 25, "QK3FL4273ME",8, null, 7);
		Vehicle FordEx = new SUV("Ford Expedition", 20, "JK2RT9364HY",10, null, 7);
		
		Vehicle TenF = new Truck("Ten-Foot",12, "EJ5KU2435BC", null, 2810);
		Vehicle SevenF = new Truck("Seventeen-Foot",10, "KG4DM5472RK", null, 5930);
		Vehicle TwentyFourF = new Truck("Twenty-Four-Foot",8, "EB2WR3182QB", null, 6500);
		Vehicle TwentyFourF2 = new Truck("TwentyFourFoot",8, "TY3GH4290EK", null, 6500);
		this.add(chevy);this.add(FordF);this.add(FordFH);this.add(ChevyI);this.add(HondaO);this.add(DodgeC);this.add(FordEx);this.add(TenF);
		this.add(SevenF);this.add(TwentyFourF);this.add(TwentyFourF2);
	}
	public void add(Vehicle v) { //add a new vehicle to the arraylist
		agency_vehicles.add(v);
	} // add a new vehicle to the collection
	public void remove(String VIN) throws VINNotFoundException{
		for(int i=0; i<agency_vehicles.size();i++) { // removes a vehicle based on the specified vin number by cycling through the arraylist.
			if(agency_vehicles.get(i).getVIN().equals(VIN)) {
				agency_vehicles.remove(i);
			}else {
				throw new VINNotFoundException();
			}
		}
	}//– throws VINNotFoundException if no vehicle found for provided VIN
	
	public Vehicle getVehicle(String VIN) {
		boolean vehicleFound= false;
		for(int i=0; i<agency_vehicles.size();i++) {
			if(agency_vehicles.get(i).getVIN().equals(VIN)) {
				vehicleFound =true;
				return agency_vehicles.get(i);
				
			}
		}
		if(vehicleFound==false) {
			throw new VINNotFoundException();
		}
		return null; 
	}//– throws VINNotFoundException if no vehicle found for provided VIN 
	public void reset() { //resets the position of the pointer back to the head of the arraylist.
		int point=0; 
		agency_vehicles.get(point);
	}
	public boolean hasNext() { // if there is another car in the array return true. 
		if(getNext()!=null) {
			return true; 
		}else {
			return false;
		}
	}
	public Vehicle getFirst() { // get the first car
		return agency_vehicles.get(0);
	}
	public Vehicle getNext() {
		for(int i=0;i<agency_vehicles.size();i++) { // get the next car in the array and print it out. 
			if(agency_vehicles.get(i)!=null) {
				return agency_vehicles.get(i+1);
			}
		}
		return null;
			
	}
	public void getAll() { // print all the cars in the array. 
		for(int i=0;i<agency_vehicles.size();i++) {
		System.out.println(agency_vehicles.get(i));
		}
	}
	public void getAllAvailable() { // print all the available cars in the array( meaning unreserved). 
		for(int i=0;i<agency_vehicles.size();i++) {
			if(agency_vehicles.get(i).getReservation()==null) {
				System.out.println(agency_vehicles.get(i));
			}
		}
	}
	public void getCar() { // show only the cars in the array. 
	for(int i=0;i<agency_vehicles.size();i++) {
		if(agency_vehicles.get(i).toString().contains("Seating Capacity") && !agency_vehicles.get(i).toString().contains("Cargo")) {
			System.out.println(agency_vehicles.get(i));
		}
	}
	}
	public void getTruck() { // displays only the trucks in the array
		for(int i=0;i<agency_vehicles.size();i++) {
			if(agency_vehicles.get(i).toString().contains("lbs.") ) {
				System.out.println(agency_vehicles.get(i));
			}
		}
		}
	public void getSUV() { // displays only the SUV's in the Array
		for(int i=0;i<agency_vehicles.size();i++) {
			if(agency_vehicles.get(i).toString().contains("Storage") ) {
				System.out.println(agency_vehicles.get(i));
			}
		}
		}
	//****************IGNORE ALL OF THIS CODE***************************
	
	public static void main(String []args) {
		
		
	}
	@Override
	public String toString() {
		return "Contains collection of all cars.";
	}
	
}