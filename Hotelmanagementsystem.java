package Hotelmenuproject;
	import java.util.*;
	public class Hotelmanagementsystem {
	  int password;
	  String name,email,contact,city;
	  int count=0;
	  int choice=0;
	  double bill;
	  int quantity;
	  Scanner sc=new Scanner(System.in);
	  userlogin user[]=new userlogin[10];
	    public void hotel() {
		do {
		System.out.println("Enter 1 Register");
		System.out.println("      2 Login");
		System.out.println("      3 Exit");
		choice =sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("---------------------------REGISTER--------------------------------------------------------");
			System.out.println("enter name");
			name=sc.next();
			System.out.println("enter contact");
			contact=sc.next();
			System.out.println("enter email");
			email=sc.next();
			System.out.println("enter password");
			password=sc.nextInt();
			System.out.println("enter city");
			city=sc.next();
			user[count]=new userlogin(name,contact,email,password,city);
			count++;
			
			break;
		case 2:
			System.out.println("---------------------------LOGIN--------------------------------------------------------");
			System.out.println("enter email");
			String mail=sc.next();
			System.out.println("enter password");
			int code=sc.nextInt();
			for(int i=0;i<count;i++) {
				if(user[i].getPassword()==code) {
					System.out.println("Login Successfully");
					System.out.println("-----welcome to Taj Hotel ---------"+name);
					menu();
				}else {
					System.out.println("Invalid Login");
				}
			}
			break;
		case 3:
			System.out.println("-----------------------------EXIT--------------------------------------------------------");
			count=0;
			break;
		default:
			System.err.println("Invalid Choice");
		}
		}while(choice!=0);
	}
	      
	         public void menu() {
	    	    do { 
	    	    System.out.println("Enter 1 for VEG");
				System.out.println("Enter 2 for Nonveg");
				System.out.println("Enter 3 for Total bill");
				System.out.println("Enter 4 for Exit");
				choice=sc.nextInt();
				switch(choice) {  
				
				case 1:
					System.out.println("-----------------------------------------VEG------------------------------ ------------------------");
					veg();
					break;
				case 2:
					System.out.println("-----------------------------------------NON VEG------------------------------------------------------");
			         nonveg();	
					break;
				case 3:
					System.out.println("-----------------------------------------TOTAL BILL------------------------------------------------------");
					bill();
					break;
				case 4:
					System.out.println("-----------------------------------------EXIT------------------------------------------------------");
					count=0;
					break;
					default:
						System.out.println("Invalid Choice");
						
				}
	    	    } while(choice!=0);
	    	      hotel();
	         } 
	    	    public void veg() {
	    	    	String a="Y";
	    	    	System.out.println("----------------------------------------------------------------------------------------------------");
					System.out.println("| Sr. No |          Dish Name                  |       Price         |");
				    System.out.println("----------------------------------------------------------------------");
				    System.out.println("| 1      |       Chole Bhature                 |       180           |");
				    System.out.println("----------------------------------------------------------------------");
				    System.out.println("| 2      |       Veg Pulao                     |       220            |");
				    System.out.println("----------------------------------------------------------------------");
				    System.out.println("| 3      |       Paneer Butter Masala          |       280           |");
				    System.out.println("----------------------------------------------------------------------");
				    System.out.println("| 4      |       Paneer Tikka Masala           |       200           |");
				    System.out.println("----------------------------------------------------------------------");
				    System.out.println("| 5      |      Veg Kofta Curry                |       260           |");
				    System.out.println("----------------------------------------------------------------------");
	    	    do {
	    	    	System.out.println("enter serial no");
	    	    	choice=sc.nextInt();
	    	    	switch(choice) {
	    	    	case 1:
	    	    		System.out.println("enter quantity");
	    	    		quantity=sc.nextInt();
	    	    		bill=bill+quantity*180;
	    	    		break;
	    	    	case 2:
	    	    		System.out.println("enter quantity");
	    	    		quantity=sc.nextInt();
	    	    		bill=bill+quantity*220;
	    	    		break;
	    	    	case 3:
	    	    		System.out.println("enter quantity");
	    	    		quantity=sc.nextInt();
	    	    		bill=bill+quantity*280;
	    	    		break;
	    	    	case 4:
	    	    		System.out.println("enter quantity");
	    	    		quantity=sc.nextInt();
	    	    		bill=bill+quantity*200;
	    	    		break;
	    	    	case 5:
	    	    		System.out.println("enter quantity");
	    	    		quantity=sc.nextInt();
	    	    		bill=bill+quantity*260;
	    	    		break;
	    	    		default:
	    	    			System.out.println("Invalid Choice");
	    	    	} 
	    	    	System.out.println("ENTER Y for continue or N for stop");
			        a  =sc.next();
	    	    }while(!a.equalsIgnoreCase("N"));
	    	    }
	    	    
	    	    
	    	    public void nonveg(){
	    	    	String a="Y";
				    System.out.println("----------------------------------------------------------------------");
				    System.out.println("| Sr. No |          Dish Name                  |       Price         |");
				    System.out.println("----------------------------------------------------------------------");
				    System.out.println("| 1      |       Chicken Tandoori              |       320           |");
				    System.out.println("----------------------------------------------------------------------");
				    System.out.println("| 2      |       Egg Curry                     |       180           |");
				    System.out.println("----------------------------------------------------------------------");
				    System.out.println("| 3      |       Fish Curry                    |       380           |");
				    System.out.println("----------------------------------------------------------------------");
				    System.out.println("| 4      |       Chicken Butter Masala         |       340           |");
				    System.out.println("----------------------------------------------------------------------");
				    System.out.println("| 5      |       Prawns Masala                 |       420           |");
				    System.out.println("----------------------------------------------------------------------");
				    do {
		    	    	System.out.println("enter serial no");
		    	    	choice=sc.nextInt();
		    	    	switch(choice) {
		    	    	case 1:
		    	    		System.out.println("enter quantity");
		    	    		quantity=sc.nextInt();
		    	    		bill=bill+quantity*320;
		    	    		break;
		    	    	case 2:
		    	    		System.out.println("enter quantity");
		    	    		quantity=sc.nextInt();
		    	    		bill=bill+quantity*180;
		    	    		break;
		    	    	case 3:
		    	    		System.out.println("enter quantity");
		    	    		quantity=sc.nextInt();
		    	    		bill=bill+quantity*380;
		    	    		break;
		    	    	case 4:
		    	    		System.out.println("enter quantity");
		    	    		quantity=sc.nextInt();
		    	    		bill=bill+quantity*340;
		    	    		break;
		    	    	case 5:
		    	    		System.out.println("enter quantity");
		    	    		quantity=sc.nextInt();
		    	    		bill=bill+quantity*420;
		    	    		break;
		    	    		default:
		    	    			System.out.println("Invalid Choice");
		    	    	} 
		    	    	System.out.println("ENTER Y for continue or N for stop");
				        a  =sc.next();
		    	    }while(!a.equalsIgnoreCase("N"));
	    	    }
	    	    public void bill() {
	    	    	System.out.println("----------------------------------------------------------------------------------------------------");
					System.out.println("|                                          Name:"+name+"                                              |");
					System.out.println("|                                        Contact Number:"+contact+"                                   |");
					double total= bill;
					System.out.println("|                                        Bill is "+total+ " Rs                                         |");
					System.out.println("                                 Thankyou for choosing US! Visit again                                 ");
					System.out.println("----------------------------------------------------------------------------------------------------");
	    	   
	    	    } 
	     
	    
	         
	         public static void main(String[] args) {
		    Hotelmanagementsystem h=new Hotelmanagementsystem();
		     h.hotel();
	}

	}

	
	
	
	
	

