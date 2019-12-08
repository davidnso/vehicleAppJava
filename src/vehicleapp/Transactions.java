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
public class Transactions extends Transaction{
  private ArrayList<Transaction> storedTransactions = new ArrayList();
    Transactions(){
    
    }
    public void addTransactions(Transaction e){
        storedTransactions.add(e);
    }
    public ArrayList<Transaction> getAllTransactions(){
    return storedTransactions;
}
    public Transaction getTransaction(String accountNum){
       for(int i=0;i<storedTransactions.size(); i++) {
          if(storedTransactions.get(i).getAccountNum().equals(accountNum)){
             return storedTransactions.get(i);
          }
       }
       
       return null;
    }
}
