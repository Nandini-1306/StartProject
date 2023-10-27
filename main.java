import billing.invoice;
import billing.PaymentProcess;
import PersonalInfo.checkInOutDetails;
import PersonalInfo.CustomerInfo;
import PersonalInfo.Reservation;
import PersonalInfo.RoomDetails;
import java.util.Scanner;

public class main
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);

            //CustomerInfo class
          
            String FirstName = sc.nextLine();
            String LastName = sc.nextLine();
            String EmailId = sc.nextLine();
            int age = sc.nextInt();
            String address = sc.nextLine();
            String city = sc.next();
            String country = sc.next();
            int phoneNumber = sc.nextInt();
            int alternateNumber = sc.nextInt();

            CustomerInfo customer = new CustomerInfo();
            customer.CustomerPersonalDetails( FirstName ,  LastName ,  EmailId ,  age);
            customer.CustomerAddressDetails( address ,  city ,  country);
            customer.CustomerContactDetails( phoneNumber , alternateNumber);

            //Reservation class 

            int reservationCode = sc.nextInt();
            int date = sc.nextInt();
            int newDate = sc.nextInt();
            String customerName = FirstName + LastName;

            Reservation  reserve = new Reservation( reservationCode, customerName,  date); 
            reserve.confirmReservation() ;
            reserve.cancelReservation();
            reserve.updateReservationDate(newDate);
            reserve.displayReservationDetails();

            //Room Details
            
            int RoomNumber = sc.nextInt();
            int roomPrice =  sc.nextInt();
            int NumberOfAcRooms = sc.nextInt();
            int NumberOfNonAcRooms = sc.nextInt();
         
            RoomDetails room = new RoomDetails();
            room.RoomType(roomPrice);
            room.RoomCharges( roomPrice ,  NumberOfAcRooms ,  NumberOfNonAcRooms);
            room.displayRoomDetails(RoomNumber);

            //checkInOutDetails

            String dayCheckIn = sc.nextLine();
            int dateCheckIn = sc.nextInt();
            int timeCheckIn = sc.nextInt();
            String dayCheckOut = sc.nextLine();
            int dateCheckOut = sc.nextInt();
            int timeCheckOut = sc.nextInt();

            checkInOutDetails check = new checkInOutDetails();
            check.checkInDetails( dayCheckIn ,  dateCheckIn ,  timeCheckIn );
            check.checkOutDetails( dayCheckOut ,  dateCheckOut ,  timeCheckOut);

            //Payment Process 
            PaymentProcess payment = new PaymentProcess();
            payment.methodOfPayment();

            //invoice 

             int billNumber = sc.nextInt();
             int numberOfRooms = sc.nextInt();
             int daysOfLaundary = sc.nextInt();
             int NumberOfVehicles = sc.nextInt();

             invoice in = new invoice(customerName , billNumber);
             in.hotelServices( roomPrice ,  numberOfRooms ,  daysOfLaundary );
             in.ParkingCharges( NumberOfVehicles);
             in.calculateBill();
             in.generateInvoice();
    
    }
}