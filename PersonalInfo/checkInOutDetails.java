package PersonalInfo;

interface CheckInOut
{
  void checkInDetails(String dayCheckIn , int dateCheckIn , int timeCheckIn);
  void checkOutDetails(String dayCheckOut , int dateCheckOut , int timeCheckOut);
}
public  class checkInOutDetails implements CheckInOut
{
     public void checkInDetails(String dayCheckIn , int dateCheckIn , int timeCheckIn )
     {
        System.out.println("day of check-In :" + dayCheckIn);
        System.out.println("date of check -In:" + dateCheckIn);
        System.out.println("Time of check-In :" + timeCheckIn );

     }
     public void checkOutDetails(String dayCheckOut , int dateCheckOut , int timeCheckOut)
     {
        System.out.println("day of check-Out :" + dayCheckOut) ;
        System.out.println("date of check-Out :" + dateCheckOut);
        System.out.println("Time of check-out :" + timeCheckOut );
     }
}