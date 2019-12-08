/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleapp;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Accounts extends Account {
    
     ArrayList<Account> account = new ArrayList();
     Accounts(){
        
     }
     public void add(Account acct) { account.add(acct); }
public Account getAccount(String acct_num) { 
        for(int i=0;i<account.size(); i++) {
          if(account.get(i).getAcctNum().equals(acct_num)){
             return account.get(i);
          }
       }
       
       return null; }
public ArrayList<Account> getAllAccounts(){
    return account;
}
    // returns the account object with acct_num
//- throws InvalidAcctNumException if acct number contains non-digits, or is not 5 digits long
//- throws AccountNumberNotFoundException if account number does not exist
   
    }
   