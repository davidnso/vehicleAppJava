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
public class ReservedVehicleException extends RuntimeException {

	ReservedVehicleException(){
		
	}
}
class UnreservedVehicleException extends RuntimeException{
	UnreservedVehicleException(){
		
	}
}
class VINNotFoundException extends RuntimeException{
	VINNotFoundException(){
		
	}
}
class noVehicleFoundException extends RuntimeException{
	noVehicleFoundException(){
		
	}
}