import billing.invoice;
import billing.PaymentProcess;
import PersonalInfo.checkInOutDetails;
import PersonalInfo.CustomerInfo;
import PersonalInfo.Reservation;
import PersonalInfo.RoomDetails;
import java.util.Scanner;

import facilities.Food;
import facilities.beverages;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to KingHotels");
        
        System.out.println("Please enter your personal details: ");
        System.out.println("Enter your First Name");
        String FirstName = scanner.nextLine();
        System.out.println("Enter your last Name");
        String LastName = scanner.nextLine();
        System.out.println("Enter your Email Id ");
        String EmailId = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your address");
        String address = scanner.nextLine();
        System.out.println("Enter your city Name");
        String city    = scanner.nextLine();
        System.out.println("Enter your country Name");
        String country  = scanner.nextLine();
        System.out.println("Enter your phone Number");
        int phoneNumber = scanner.nextInt();
        System.out.println("Enter your alternate  Number");
        int alternateNumber = scanner.nextInt();

        CustomerInfo customer = new CustomerInfo();
        customer.CustomerPersonalDetails( FirstName ,  LastName ,  EmailId ,  age);
        customer.CustomerAddressDetails( address ,  city ,  country);
        customer.CustomerContactDetails( phoneNumber ,  alternateNumber);

         System.out.println("---------------------------------------------------------------------------------------------------");

        System.out.println("Enter the date for your reservation");
        String date = scanner.nextLine();
        
        scanner.nextLine();
        System.out.println();
        System.out.println("Enter your reservation code to confirm your reservation. ");
        System.out.println("NOTE YOUR CODE SHOULD BE BETWEEN 1 TO 5");
        int reservationCode = scanner.nextInt();

        Reservation reserve = new Reservation(reservationCode,  date);

           if(reservationCode >=1 && reservationCode<=5)
        {
            reserve.confirmReservation() ;
            System.out.println();
            System.out.println("Your Reservation status:");
            reserve.displayReservationDetails(FirstName,LastName,EmailId);
        } 
        else 
        {
            reserve.cancelReservation();
            System.exit(0);
        }
        
            
            System.out.println("---------------------------------------------------------------");


            System.out.println("Here are the room details: ");
            System.out.println("1.Total rooms : 10 \n" + "2.Total AC ooms : 5, Rate : 4500/- \n " + "3.Total Non-Ac rooms : 5, Rate : 2500/- \n" );
            System.out.println("enter the no. of AC rooms");
            int NumberOfAcRooms=scanner.nextInt();
             System.out.println("enter the no. of NON-AC rooms");
            int NumberOfNonAcRooms=scanner.nextInt();

            //Room Details 
            RoomDetails room = new RoomDetails(NumberOfAcRooms, NumberOfNonAcRooms);
            room.RoomCharges();
            room.displayRoomDetails();

            System.out.println("---------------------------------------------------------------");

        Food hakkaNoodles = new Food("Hakka Noodles", 130.0, "Chinese", true);
        Food dumplings = new Food("Dumplings", 180.0, "Chinese", true);
        Food indianThali = new Food("Indian Big Thali", 350.0, "Indian", true);
        Food pavBhaji = new Food("Pav Bhaji", 130.0, "Indian", true);

        double totalFood = 0.0;
        double totalBeverages = 0.0;

        
        System.out.println("Food Menu:");
        System.out.println("1. " + hakkaNoodles.name + " - " + hakkaNoodles.price + " - " + hakkaNoodles.category);
        System.out.println("2. " + dumplings.name + " - " + dumplings.price + " - " + dumplings.category);
        System.out.println("3. " + indianThali.name + " - " + indianThali.price + " - " + indianThali.category);
        System.out.println("4. " + pavBhaji.name + " - " + pavBhaji.price + " - " + pavBhaji.category);
        System.out.println("---------------------------------------------------------");
        System.out.println("Enter the number of the item you'd like to order for food (or 0 to finish your food order):");
        

        while (true) {
            int foodChoice = scanner.nextInt();

            if (foodChoice == 0) {
                break;
            }

            if (foodChoice >= 1 && foodChoice <= 4) {
                switch (foodChoice) {
                    case 1:
                        totalFood += hakkaNoodles.price;
                        break;
                    case 2:
                        totalFood += dumplings.price;
                        break;
                    case 3:
                        totalFood += indianThali.price;
                        break;
                    case 4:
                        totalFood += pavBhaji.price;
                        break;
                }
                System.out.println("Added to your food order. Your current food total is: $" + totalFood);
                System.out.println("Add your choice or add 0 to terminate");


            } else {
                System.out.println("Invalid choice. Please choose a valid item from the food menu.");
            }
        }

        // Beverage Menu
        beverages cafe = new beverages();

        System.out.println("Beverage Menu:");
        System.out.println("1. Mocha Cold Coffee - tall, grande, venti");
        System.out.println("2. Caramel Cold Coffee - tall, grande, venti");
        System.out.println("3. Espresso Cold Coffee - tall, grande, venti");
        System.out.println("4. Iced Americano - tall, grande, venti");
        System.out.println("5. Iced Latte - tall, grande, venti");
        System.out.println("6. Black Tea - short, tall, grande");
        System.out.println("7. Tea Latte - chai, green");
        System.out.println("8. Flat White Espresso - tall, grande, venti");
        System.out.println("---------------------------------------------------------");
        System.out.println("Enter the number of the item you'd like to order for beverages (or 0 to finish your order):");

        while (true) {
            int beverageChoice = scanner.nextInt();

            if (beverageChoice == 0) {
                break;
            }

            if (beverageChoice >= 1 && beverageChoice <= 8) {
                System.out.println("Enter the size (tall, grande, venti):");
                String size = scanner.next();

                double beveragePrice = 0;
                switch (beverageChoice) {
                    case 1:
                    beveragePrice = cafe.chooseColdCoffee("mocha", size);
                        break;
                    case 2:
                        beveragePrice = cafe.chooseColdCoffee("caramel", size);
                        break;
                    case 3:
                        beveragePrice = cafe.chooseColdCoffee("espresso", size);
                        break;
                    case 4:
                        beveragePrice = cafe.chooseIcedCoffee("iced americano", size);
                        break;
                    case 5:
                        beveragePrice = cafe.chooseIcedCoffee("iced latte", size);
                        break;
                    case 6:
                        beveragePrice = cafe.chooseTea("black tea", size);
                        break;
                    case 7:
                        System.out.println("Enter tea type (chai, green):");
                        String teaType = scanner.next();
                        beveragePrice = cafe.chooseTea("tea latte", teaType);
                        break;
                    case 8:
                        beveragePrice = cafe.chooseHandcraftedEspresso("flat white", size);
                        break;
                }

                totalBeverages += beveragePrice;
                System.out.println("Added to your beverage order. Your current beverage total is: $" + totalBeverages);
            } else {
                  System.out.println("Invalid choice. Please choose a valid item from the beverage menu.");
            }
        }

        System.out.println("Thank you for your order!");
        System.out.println("Total Food Bill: $" + totalFood);
        System.out.println("Total Beverage Bill: $" + totalBeverages);
        System.out.println("Grand Total: $" + (totalFood + totalBeverages));
  
        System.out.println("------------------------------------------------------------------------------");

          System.out.println("Enter your payment method ");
            PaymentProcess payment = new PaymentProcess();
            payment.methodOfPayment();

        System.out.println("------------------------------------------------------------------------------");
         System.out.println("Enter your checkIn Details\n Enter day of checkIn");
         String dayCheckIn = scanner.nextLine();
         scanner.nextLine();
         System.out.println("Enter date of check In");
         int dateCheckIn = scanner.nextInt();
         System.out.println("Enter time of checkIn");
         int timeCheckIn = scanner.nextInt();
         System.out.println("Enter your checkOut Details\n  Enter day of checkout");
         String dayCheckOut = scanner.nextLine();
         System.out.println("Enter date of check Out");
         int dateCheckOut= scanner.nextInt();
         System.out.println("Enter time of check Out");
         int timeCheckOut = scanner.nextInt();

         checkInOutDetails details = new checkInOutDetails();
         details.checkInDetails( dayCheckIn ,  dateCheckIn , timeCheckIn );
         details.checkOutDetails( dayCheckOut ,  dateCheckOut ,  timeCheckOut);

         System.out.println("--------------------------------------------------------------------------------");
         System.out.println("Your total generated invoice is shown below\n :");
         
         System.out.println("customer name :" + (FirstName+LastName));
         System.out.println("Adress :" + address);
         System.out.println("Mobile number :" + phoneNumber);

         System.out.println("Total number of rooms"+ (NumberOfAcRooms + NumberOfNonAcRooms));
         System.out.print("TotalCharge"+ room.TotalRoomCharges);
         System.out.println("total Food Charges :" + totalFood);
         System.out.println("Total beverages Charges :" + totalBeverages);
         double totalroomcharges=room.TotalRoomCharges;
         double Total = totalroomcharges  + totalFood + totalBeverages;
         System.out.println("Total Invoice" + Total);
         System.out.println( "Thank you for visiting KingHotels");
         
        }
        
}