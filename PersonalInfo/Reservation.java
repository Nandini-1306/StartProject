package PersonalInfo;

public class Reservation
 {
    private int reservationCode;
    private String customerName;
    private int date;
    
    public Reservation(int reservationCode, String customerName, int date) 
  {
        this.reservationCode = reservationCode;
        this.customerName = customerName;
        this.date = date;
  }
    
    public void confirmReservation() 
  {
      System.out.println("Your reservation is confirmed ");  
  }
    
    public void cancelReservation()
  {
      System.out.println("Your reservation is canceled");  
  }
    public void updateReservationDate(int newDate)
  {
        date= newDate;
        System.out.println("Reservation is updated to " + date);
  }

  public  void displayReservationDetails()
  {
      System.out.println("Reservation code :" + reservationCode);
      System.out.println("Customer Name : " + customerName);
      System.out.println("Reseravtion Date :" + date);
      
  }
    
}
