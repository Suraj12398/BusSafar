package com.masai;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import com.masai.entities.User;
import com.masai.entities.Bus;
import com.masai.utility.Admin;
import com.masai.entities.*;
public class BusTicketReservation {

    private static List<Bus> buses = new ArrayList<>();
    private static List<User> users = new ArrayList<>();
    private static List<Bookings> bookingList = new ArrayList<>();

   
    public static void main(String[] args) {
    	buses.add(new Bus("b1", "pune", "nagpur", "Ac",
                new Date(2023, 11, 3), new Date(2023, 11, 4), 30));
    	
    	users.add(new User("User","User","User","User"));
    	
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bus Reservation System");
        System.out.println("-------------------------------------");
        while (true) {
            System.out.println("Select user type:");
            System.out.println("1. Admin");
            System.out.println("2. Passenger");
            System.out.println("3. Exit");
            int opt = Integer.parseInt(scanner.nextLine());
            switch (opt) {
                case 1:
                    admin(scanner);
                    break;
                case 2:
                    user(scanner);
                    break;
                case 3:
                    System.out.println("Thank you for using the Bus Safar");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        
    }
    
    
//   ===================================admin=====================================================
    
        private static void admin(Scanner scanner){
        	 while (true) {
                 System.out.println("Enter username:");
                 String username = scanner.nextLine();
                 System.out.println("Enter password:");
                 String password = scanner.nextLine();
                 if (username.equals(Admin.USERNAME) && password.equals(Admin.PASSWORD)) {
                     break;
                 }
                 System.out.println("Invalid username or password. Try again.");
             }
             System.out.println("Login successful.");
             while (true) {
                 System.out.println("Enter an option:");
                 System.out.println("1. Add bus");
                 System.out.println("2. Update bus");
                 System.out.println("3. Delete bus");
                 System.out.println("4. View all bookings");
                 System.out.println("5. View all users");
                 System.out.println("6. View bookings for a date range");
                 System.out.println("7. View bookings by bus name");
                 System.out.println("8. View bookings by user name");
                 System.out.println("9. logout to main Menu");
                 System.out.println("0. Exit");
                 int option = Integer.parseInt(scanner.nextLine());
                 switch (option) {
                     case 1:
                         addBus(scanner);
                         break;
                     case 2:
                         updateBus(scanner);
                         break;
                     case 3:
//                         deleteBus(scanner);
                         break;
                     case 4:
//                         viewAllBookings();
                         break;
                     case 5:
                         viewAllUsers();
                         break;
                     case 6:
//                        viewBookingsForDateRange(scanner);
                         break;
                     case 7:
//                        viewBookingsByBusName(scanner);
                         break;
                     case 8:
//                    	 viewBookingsByUserName(scanner);
                         break;
                     case 9:
                    	 main(null);
                         break;
                     case 0:
                         System.exit(0);
                         break; 
                     default:
                         System.out.println("Invalid option. Try again.");
                 }
             
        }
       
    }
    
        
    	private static void viewAllUsers() {
	// TODO Auto-generated method stub
    		if(users.toString()=="[]") {
    			System.out.println("No user Found");
    		}
    		else {
    			System.out.println(users.toString());
    		}
    		
}


		private static void updateBus(Scanner scanner) {
    		// TODO Auto-generated method stub
    			System.out.println("Enter bus name:");
    			String busName = scanner.nextLine();
    			Bus bus = findBusByName(busName);
    			if (bus == null) {
    			System.out.println("Bus not found.");
    			return;
    			}
    			System.out.println("Enter new bus name (leave blank to keep the same):");
    			String newBusName = scanner.nextLine();
    			if (!newBusName.isEmpty()) {
    			bus.setBusName(newBusName);
    			}
    			System.out.println("Enter new bus type (leave blank to keep the same):");
    			String newBusType = scanner.nextLine();
    			if (!newBusType.isEmpty()) {
    			bus.setBusType(newBusType);
    			}
    			System.out.println("Enter new total seats (leave blank to keep the same):");
    			String newTotalSeatsString = scanner.nextLine();
    			if (!newTotalSeatsString.isEmpty()) {
    			int newTotalSeats = Integer.parseInt(newTotalSeatsString);
    			bus.setTotalSeats(newTotalSeats);
    			}
    			System.out.println("Bus updated.");
    	}


    		
    		private static Bus findBusByName(String busName) {
    			// TODO Auto-generated method stub
    			 for (Bus bus : buses) {
    			        if (bus.getBusName().equals(busName)) {
    			            return bus;
    			        }
    			    }
    			    return null;
    		}


    		private static void addBus(Scanner scanner) {
    	        System.out.println("Enter bus name:");
    	        String busName = scanner.nextLine();
    	        
    	        System.out.println("Enter source:");
    	        String source = scanner.nextLine();
    	        
    	        System.out.println("Enter destination:");
    	        String destination = scanner.nextLine();
    	        
    	        System.out.println("Enter bus type(AC/NAC):");
    	        String busType = scanner.nextLine();
    	        
    	        System.out.println("Enter departure time (format: yyyy-MM-dd HH:mm):");
    	        Date departureTime = parseDate(scanner.nextLine());
    	        
    	        System.out.println("Enter arrival time (format: yyyy-MM-dd HH:mm):");
    	        Date arrivalTime = parseDate(scanner.nextLine());
    	        
    	        System.out.println("Enter total seats:");
    	        int totalSeats = Integer.parseInt(scanner.nextLine());
    	        Bus bus = new Bus(busName, source, destination, busType, departureTime, arrivalTime, totalSeats);
    	        buses.add(bus);

    	        System.out.println(buses);

    	        System.out.println("Bus added.");
    	    }

    		
    		
    		private static Date parseDate(String dateString) {
    			
    			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    		    try {
    		        return dateFormat.parse(dateString);
    		    } catch (ParseException e) {
    		        System.out.println("Invalid date format. Please use format yyyy-MM-dd HH:mm");
    		        return null;
    		    }
    		}
        
        
        
    //==============================User===================================================================    
        
 // user Sign in Sign out
        private static void user(Scanner scanner){
       	 while (true) {
       		System.out.println("Enter an option:");
            System.out.println("1. Sign in");
            System.out.println("2. Sign up");
            System.out.println("0. Exit");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1:
                        signInUser(scanner);
                        break;
                    case 2:
                        SignUpUser(scanner);
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                		}
            		}
        		}
       public static User findUser(String username, String password) {
            for (User user : users) {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    return user;
                }
            }
            return null;
        }
      
        private static void SignUpUser(Scanner scanner) {
		// TODO Auto-generated method stub
        	 System.out.print("Enter username: ");
             String username = scanner.nextLine();

             // Check if user name already exists
             User existingUser =findUser(username, "");
             while (existingUser != null) {
                 System.out.println("Username already exists. Please try again.");
                 System.out.print("Enter username: ");
                 username = scanner.nextLine();
                 existingUser = findUser(username, "");
             }

             System.out.println("Enter password: ");
             String password = scanner.nextLine();
             System.out.println("Enter Email Id: ");
             String emailId = scanner.nextLine();
             System.out.println("Enter mobile number: ");
             String mobileNo = scanner.nextLine();
             
             
             System.out.println("Sign up Successfully");
             User newUser = new User(username, password,mobileNo,emailId);
             users.add(newUser);
             
	}


		private static void signInUser(Scanner scanner){
       	 
                System.out.println("Enter username:");
                String username = scanner.nextLine();
                System.out.println("Enter password:");
                String password = scanner.nextLine();
   

                User user = findUser(username, password);

                if (user != null) {
                    System.out.println("Login successful");
                } else {
                    System.out.println("Login failed");
                    System.out.println("Invalid username or password. Try again.");
                    
                }
               
    
            while (true) {
                System.out.println("Enter an option:");
                System.out.println("1. Book a seat");
                System.out.println("2. View available seats");
                System.out.println("3. List of Bus Available");
                System.out.println("4. Search bus by city name");
                System.out.println("5. Booking History");
                System.out.println("6. Change Profile");
                System.out.println("7. Delete Account");
                System.out.println("8. logout to Main Menu");
                System.out.println("9. Exit");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1:
                        bookSeat(scanner);
                        break;
                    case 2:
                        ViewAvailableSeats(scanner);
                        break;
                    case 3:
                        listBus(scanner);
                        break;
                    case 4:
                        searchBus(scanner);
                        break;
                    case 5:
                        BookingHistory();
                        break;
                    case 6:
                        changeProfile(scanner);
                        break;
                    case 7:
                        deleteAcc(scanner);
                        break;
                    case 8:
                        main(null);
                        break;
                    case 9:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            
       }
      
   }
   


private static void listBus(Scanner scanner) {
			// TODO Auto-generated method stub
	System.out.println("Available buses:");
    for (int i = 0; i < buses.size(); i++) {
        System.out.println(i + 1 + ". " + buses.get(i));
    }
	 }


private static void deleteAcc(Scanner scanner) {
			// TODO Auto-generated method stub
	System.out.println("Account deleted");
		}


private static void changeProfile(Scanner scanner) {
			// TODO Auto-generated method stub
	System.out.println("changed profile");
		}


private static void BookingHistory() {
			// TODO Auto-generated method stub
	System.out.println("History");
		}


private static void searchBus(Scanner scanner) {
			// TODO Auto-generated method stub
	System.out.println("bus searched");
		}


private static void ViewAvailableSeats(Scanner scanner) {
			// TODO Auto-generated method stub
	
	
		}


private static void bookSeat(Scanner scanner) {
			// TODO Auto-generated method stub
if(buses.size()==0) {
	System.out.println("No Bus Found");
	signInUser(scanner);
}
    // Display list of available buses
    System.out.println("Available buses:");
    for (int i = 0; i < buses.size(); i++) {
        Bus bus = buses.get(i);
        System.out.println(i + 1 + ". " + bus.getSource() + " to " + bus.getDestination() + " (" + bus.getDepartureTime() + ")");
    }

    // Ask user to select a bus
    System.out.print("Select a bus (1-" + buses.size() + "): ");
    int busIndex = scanner.nextInt() - 1;
    while (busIndex < 0 || busIndex >= buses.size()) {
        System.out.print("Invalid input. Please select a bus (1-" + buses.size() + "): ");
        busIndex = scanner.nextInt() - 1;
    }

    // Display seat map for selected bus
    Bus selectedBus = buses.get(busIndex);
    int[] seatMap = selectedBus.getSeatMap();
    System.out.println("Seat map for " + selectedBus.getSource() + " to " + selectedBus.getDestination() + " (" + selectedBus.getDepartureTime() + "):");
    for (int i = 0; i < seatMap.length; i++) {
        if (i % 5 == 0) {
            System.out.println();
        }
        if (i < 9) {
            System.out.print(" ");
        }
        if (seatMap[i] == 1) {
            System.out.print("X");
        } else {
            System.out.print(i + 1);
        }
        System.out.print(" ");
    }
    System.out.println();

    // Ask user to select a seat
    System.out.print("Select a seat (1-" + seatMap.length + "): ");
    int seatNumber = scanner.nextInt();
    while (seatNumber < 1 || seatNumber > seatMap.length || seatMap[seatNumber - 1] == 1) {
        if (seatMap[seatNumber - 1] == 1) {
            System.out.print("Seat " + seatNumber + " is already booked. Please select another seat: ");
        } else {
            System.out.print("Invalid input. Please select a seat (1-" + seatMap.length + "): ");
        }
        seatNumber = scanner.nextInt();
    }

    // Book the selected seat and update the seat map
    selectedBus.bookSeat(seatNumber);
    seatMap[seatNumber - 1] = 1;

    // Add booking information to the booking list
    Bookings booking = new Bookings(selectedBus.getBusName(), selectedBus.getDestination(), seatNumber, selectedBus.getDepartureTime());
    bookingList.add(booking);

    System.out.println("Booking successful. Your seat number is " + seatNumber + "."+ "of Bus :"+selectedBus.getBusName() +"on "+selectedBus.getDepartureTime() );		
    System.out.println("------Thank You For Using Bus Safar--------");
    System.out.println("                        ");
    
    while (true) {
   		System.out.println("Enter an option:");
   		System.out.println("Enter 1 for main menu");
   	    System.out.println("Enter 0 for Exit");
   	    
            int optio = scanner.nextInt();
            switch (optio) {
                case 1:
                    signInUser(scanner);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            		}
        		}
}

//	private static void deleteBus(Scanner scanner) {
//        System.out.println("Enter bus name:");
//        String busName = scanner.nextLine();
//        Bus bus = findBusByName(busName);
//        if (bus == null) {
//            System.out.println("Bus not found.");
//            return;
//        }
//        buses.remove(bus);
//        bookingsByBusName.remove(busName);
//        System.out.println("Bus deleted.");
//    }



	
}
