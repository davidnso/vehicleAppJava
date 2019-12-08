/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class SystemInterface {
// variables set to aggregation objects
private static VehicleRates agencyRates;
private static linkedList agencyVehicles;
private static Accounts systemAcc;
private static Transactions transactions_history;
private static Reservations RSVP;
// used to set aggregation objects
/*public static void*/ SystemInterface(linkedList v, Accounts a, Transactions t, VehicleRates x,Reservations r) throws FileNotFoundException, IOException, Exception{
agencyRates = x;
agencyVehicles = v;
systemAcc = a;
transactions_history = t;
RSVP=r;
getAccountFile();
getTransactionsFile();
getReservationFile();
}
// Each of the following methods returns an array of strings to be displayed by the user interface. // Note that methods makeReserv, cancelReservation, and addAccount return the information // submitted as a means of confirming the requested action.
/*public static ArrayList<String> addAccount(Account acct_info) { return null;}
public void getReservationForm(String c, String sV, String cC, Boolean s) { ... }
public ArrayList<String> getAllAccounts() { ... }
public ArrayList<String> getCarRates() { ... }
public ArrayList<String> getSUVRates() { ... }
public ArrayList<String> getTruckRates() { ... }
public ArrayList<String> getAvailCars() { ... }
public ArrayList<String> getAvailSUVs() { ... }
public ArrayList<String> getAvailTrucks() { ... }
public ArrayList<String> getAllVehicles() { ... }
public ArrayList<String> estimatedRentalCost(RentalDetails details) { ... }
public ArrayList<String> makeReservation(ReservationDetails details) { ... }
public ArrayList<String> getReservation(String vin) { ... }
public ArrayList<String> getAllReservations() { ... }
public ArrayList<String> cancelReservation(String vin) { ... }
public ArrayList<String> processReturnedVehicle(String vin, String rental_period, int num_days_driven) { ... }*/
public void getAccountFile() throws FileNotFoundException, IOException{
 ArrayList<String> data= new ArrayList();
 
File accountsFile = new File("AccountInfo.txt");
Scanner FS = new Scanner(accountsFile);
FileReader FR = new FileReader(accountsFile);
FileWriter FW = new FileWriter(accountsFile,true); 

 while(FS.hasNext()){
      data.add(FS.nextLine());
  }
  System.out.println(data.size());
  int i=0;int y=1;int j=2;
  while(data.size()-1>=j){
  Account fileAcc = new Account(data.get(i),data.get(y), Boolean.valueOf(data.get(j)));
 System.out.println("he");
    systemAcc.add(fileAcc);
  i+=3;y+=3;j+=3;
  }
}
 public void getTransactionsFile() throws Exception{
     
     ArrayList<String> data = new ArrayList();
     File accountsFile = new File("Transactions.txt");
     Scanner FS = new Scanner(accountsFile);
     while(FS.hasNext()){
         data.add(FS.nextLine());
         
     }
    System.out.println(data.size());
    int a=0; int b=1; int c=2; int d=3; int e=4;
    while(data.size()>=e){
        Transaction fileTran = new Transaction(data.get(b),data.get(a),data.get(c),data.get(d),data.get(e));
        transactions_history.addTransactions(fileTran);
        a+=5;b+=5;c+=5;d+=5;e+=5;
    }
 }
 public void appendTransactionFile(Transaction x) throws Exception{
     File F = new File("Transactions.txt"); 
     FileWriter FW = new FileWriter(F,true); 
     PrintWriter PW = new PrintWriter(FW); 
     PW.println(x.getAccountNum());  PW.println(x.getCompanyName());
     PW.println(x.getVehicleType()); PW.println(x.getRentalPeriod());
      PW.println(x.getrentalCost());
     PW.close();FW.close();
     transactions_history.addTransactions(x);
 }
 public void getReservationFile() throws Exception{
     
     ArrayList<String> data = new ArrayList();
     File RSVPFile = new File("Reservations.txt");
     Scanner FS = new Scanner(RSVPFile);
     while(FS.hasNext()){
         data.add(FS.nextLine());
         
     }
    System.out.println(data.size());
    int a=0; int b=1; int c=2; 
    while(data.size()>=c){
        Reservation fileRes = new Reservation(data.get(a),data.get(b),Boolean.valueOf(data.get(c)));
      //System.out.println(fileRes.toString());
        RSVP.add(fileRes);
        a+=3;b+=3;c+=3;
    }
 }
 public void appendReserveFile(Reservation e) throws Exception{
            File F = new File("Reservations.txt");
            FileWriter FW = new FileWriter(F,true);
            PrintWriter PW = new PrintWriter(FW);
            
            PW.println(e.getCreditCardNum());PW.println(e.getRentalPeriod());PW.println(e.getDailyInsurance());
            PW.close(); FW.close();
            RSVP.add(e);
        }

}