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
public class Node {
Node next;
Vehicle data; 
	Node(Vehicle d){
		data=d;
		next=null;
	}
	void Display(){
		System.out.println(data.toString());
	}
}
class linkedList{
	Node head;
        ArrayList<String> VinNumbers= new ArrayList();
	linkedList(){
		Node head=null;
		populateLinkedList();
                getAllVin();
	}
	public boolean isEmpty() {
		return head==null;
	}
	public void append(Vehicle n) {
		Node newNode = new Node(n);
		newNode.next = head;
		head=newNode;
	/*	 if(this.isEmpty()) {
			 head = newNode;
		 }
		 while(ref !=null) {
			 ref = ref.next;
		 }
		 ref=newNode;
		 */
	}
	public Vehicle getFirst() {
		return head.data;
	}

	public void printList() {
		Node n = head; 
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		
	}
	public void printAllAvailable() {
		Node ref = head; 
		while(ref!=null) {
			if(ref.data.getReservation()==null) {
				System.out.println(ref.data);
			}
			ref=ref.next;
		}
	}
	public void getCars() {
		Node ref = head; 
		while(ref!=null) {
			if(ref.data instanceof Car) {
				System.out.println(ref.data);
			}
			ref=ref.next;
		}
	}
	public void getTrucks() {
		Node ref = head; 
		while(ref!=null) {
			if(ref.data instanceof Truck) {
				System.out.println(ref.data);
			}
			ref=ref.next;
		}
	}
	public void getSUVs() {
		Node ref = head; 
		while(ref!=null) {
			if(ref.data instanceof SUV) {
				System.out.println(ref.data);
			}
			ref=ref.next;
		}
	}
	public void printFinalNode() {
		Node n = head; 
		while(n.next!=null) {
			
			n=n.next;
		}
		System.out.println(n.data);
	}
	public void remove(String vin) {
		Node ref = head; 
		Node prev = head; 
		while(ref!=null) {
			prev=ref;
			ref=ref.next;
			if(vin.equals(ref.data.getVIN())) {
				System.out.println("\n"+ref.data+" was removed.");
				prev.next=ref.next; 
				
				break;
			}
		}
	}
	public Vehicle getVehicle(String VIN) {
		Node ref = head; 
		Vehicle foundVehicle=null;
		while(ref!=null) {
			
			if(ref.data.getVIN().equals(VIN)) {
				 foundVehicle = ref.data;
			}
			ref=ref.next;
		}
		return foundVehicle;
	}
	public ArrayList<Vehicle> getAccountVehicles(String acctNum){
            Node ref = head; int count = 0; String otherdata=null;
            ArrayList<Vehicle> newdata = new ArrayList();
            while(ref!=null){
          
                if(ref.data.getReservation()!=null){
                    if(ref.data.getReservation().getCreditCardNum().equals(acctNum)){
                   newdata.add(ref.data);
                   otherdata=ref.data.toString();
                    }
                }
            ref = ref.next;
            }
            return newdata;
        }
	public void populateLinkedList() {
		
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
		Vehicle TwentyFourF2 = new Truck("Twenty-Four-Foot",8, "TY3GH4290EK", null, 6500);
		append(chevy);append(FordF);append(FordFH);append(ChevyI);append(HondaO);append(DodgeC);append(FordEx);append(TenF);
		append(SevenF);append(TwentyFourF);append(TwentyFourF2);
		
               
	}
        private void getAllVin()
        {
            
            Node ref = head;
            int i=0;
           while(ref!=null){
                VinNumbers.add(i,ref.data.getVIN());
                ref=ref.next;
                i++;
                
          }
        }

}
