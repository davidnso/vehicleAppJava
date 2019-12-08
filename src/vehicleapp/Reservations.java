/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleapp;

import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Reservations {
    ArrayList<Reservation> RSVP = new ArrayList();
    Reservations(){
        
    }
    public void add(Reservation e){
        RSVP.add(e);
    }
    public ArrayList<Reservation> getAllReservations(){
        return RSVP;
    }
}
