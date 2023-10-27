
 package billing;
 
 public class invoice 
    {
        private double totalAmount =0.0;
        private String customerName;
        private int billNumber;  
        int ChargePerDayOfParking = 100;
        int chargePerDayOfLaundary = 500;
        
        public invoice(String customerName , int billNumber)
        {
            this.customerName = customerName;
            this.billNumber = billNumber;
        }
  
       public void foodItem(String itemName , int itemPrice , int itemQuantity)
       {
        double FoodTotal = itemPrice * itemQuantity ;
        totalAmount += FoodTotal;
        System.out.println(itemQuantity + " " + itemName + " "  + itemPrice);
        System.out.println("Food Total" + FoodTotal);
       }

       public void hotelServices(int roomPrice , int numberOfRooms , int daysOfLaundary )
       {
          double roomCharges = roomPrice * numberOfRooms ;
          double laundaryCharges = daysOfLaundary *chargePerDayOfLaundary  ;
          totalAmount += roomCharges + laundaryCharges;
          System.out.println(roomPrice + " " + numberOfRooms + " " + " " + daysOfLaundary + " " + chargePerDayOfLaundary );
          System.out.println("Room Charges :" + roomCharges);
          System.out.println("Laundary Charges : " + laundaryCharges);
       }

      public  void ParkingCharges(int NumberOfVehicles)
       {
          double totalParkingCharges = NumberOfVehicles * ChargePerDayOfParking ;
          totalAmount += totalParkingCharges;
          System.out.println("Parking Charges:" + totalParkingCharges  );
       }
       public  double calculateBill()
       {
          return totalAmount;
       }
       public void generateInvoice()
       {
        System.out.println("Customer Name :" + customerName);
        System.out.println("Bill Number :" + billNumber);
        System.out.println("Total Amount :" + totalAmount);
        System.out.println("including all taxes");
       }

       public double getTotalAmount()
       {
        return totalAmount;
       }

       public void getCustomerName()
       {
         this.customerName = customerName;
       }
    }

     