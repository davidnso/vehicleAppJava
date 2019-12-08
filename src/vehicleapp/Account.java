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
public class Account {
    private String acctNum; // five-digit acct number
    private String companyName;
    private boolean primeCustomer;
    
     Account(){
         acctNum=null;
        companyName=null;
        primeCustomer=false; 
     }
    Account(String acctNum,String companyName,boolean primeCustomer){
        this.acctNum=acctNum;
        this.companyName=companyName;
        this.primeCustomer=primeCustomer; 
    }
    public String getAcctNum() {
       /* for(int i=0;i<account.size();i++){ 
            if(account.toString().contains(name)){
                return account.get(i).acctNum;
            }
        } */
        return acctNum;
    }
    public String getCompanyName(){
        return companyName;
    }
    public boolean getPrimeBool(){
        return primeCustomer;
    }
    public void AddAccount(Accounts p){
       // account.add(p);
    }
    
    
   // public String[] getVehiclesReserved() { return this; }
    public boolean primeCustomer() { return primeCustomer; }
    public String toString() {return "Account Number: "+acctNum+"\nCompany Name: "+companyName+"\nPrime Customer: "+primeCustomer; }
}
