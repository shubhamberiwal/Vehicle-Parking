package packagepark;
import java.util.*;


public class CarParking{
    public static void main(String args[]) {
    	
    	Scanner sc = new Scanner(System.in);
    	try {
    		System.out.println("Enter the number of slots in the parking system: ");
    		int slot = sc.nextInt();
    		
//        	Parking par = new Parking();
        	Car cr = new Car(0, slot);
        	Bike bk = new Bike();
        	Autorick at = new Autorick();
            
            int car=0; int bike=0;int auto=0;
            int choice;int sum=0;
            while(true){
                System.out.println("Press keys to add vehicle:");
                System.out.println("1 for car, 2 for bike and 3 for auto");
                System.out.println("Press 4 to view data and 5 to delete it");
                System.out.println("Press 6 to exit");
                choice = sc.nextInt();
                switch(choice)
                {
                case 1:
                	if(sum==slot) {
                		System.out.println("All Slots are filled. Press 5 in next iteration.");
                		break;
                	}
                	System.out.println("Car Parked!");
                	car++;
                	sum++;
                	cr.setoccupied(sum);
                	cr.setcar(car);
                	break;
            	case 2:
            		if(sum==slot) {
                		System.out.println("All Slots are filled. Press 6 in next iteration.");
                		break;
                	}
            		System.out.println("Bike Parked!");
            		bike++;
            		sum++;
            		cr.setoccupied(sum);
            		bk.setbike(bike);
            		break;
        		case 3:
        			if(sum==slot) {
                		System.out.println("All Slots are filled. Press 6 in next iteration.");
                		break;
                	}
        			System.out.println("AutoRickshaw Parked!");
        			auto++;
        			sum++;
        			cr.setoccupied(sum);
        			at.setauto(auto);
        			break;
    			case 4:
    				
    				int temp1,temp2,temp3;
    				temp1 = cr.getcar();
    				temp2 = bk.getbike();
    				temp3 = at.getauto();
    				System.out.println("=======View Data======");
    				System.out.println("Total Slots: "+slot);
    				System.out.println("Cars Parked: "+temp1);
    				System.out.println("Bikes Parked: "+temp2);
    				System.out.println("Autorickshaws Parked: "+temp3);
    				System.out.println("Slots that are left empty: "+ (slot-sum));
    				System.out.println("=======================");
    				break;
    			case 5:
    				auto = bike = car = 0;
    				sum=0;
    				at.setauto(auto);
    				bk.setbike(bike);
    				cr.setcar(car);
    				System.out.println("All Previous Data has been cleared! All slots are available again");
    				break;
    			case 6:
    				System.out.println("Shutting down the system. Vehicle Parking is no more allowed.");
    				System.exit(0);
    				break;
    			default: 
    				System.out.println("Please Enter a number between 1 to 6.");
    				break;
                }
            }
    	}
    	// Exception Handling for Input mismatch exception
    	catch(InputMismatchException ex) {
    		System.out.println("We are expecting an Integer value. Message: "+ex);
    	}
    }
}
