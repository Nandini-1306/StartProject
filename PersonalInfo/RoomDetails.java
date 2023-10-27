package PersonalInfo;
    
public class RoomDetails
{
    int RoomNumber;
    double TotalRoomCharges = 0.0;
    public void RoomType(int roomPrice)
    {
          if(roomPrice>2000 )
          {
            System.out.println(" AC room  with two bed");
          }
         else if(roomPrice<=2000)
          {
            System.out.println("Non AC room with only one bed ");
          }
          else
          {
            System.out.println("NO Choice Available");
          }
    }
   public  void RoomCharges(int roomPrice , int NumberOfAcRooms , int NumberOfNonAcRooms )
    {
      if(roomPrice >2000)
      {
         TotalRoomCharges += roomPrice*NumberOfAcRooms;
      }
      else 
      {
         TotalRoomCharges += roomPrice*NumberOfNonAcRooms;
      }

    }
   public  void displayRoomDetails(int RoomNumber)
    {
      System.out.println("Room Number :" + RoomNumber);
      System.out.println("total room Charges :" + TotalRoomCharges);
    }   
}
