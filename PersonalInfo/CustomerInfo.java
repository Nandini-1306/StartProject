package PersonalInfo;

 interface PersonalInfo
{
  public  void CustomerPersonalDetails(String FirstName , String LastName , String EmailId ,int age);
  public void CustomerAddressDetails(String address , String city , String country);
  public void  CustomerContactDetails(int phoneNumber , int alternateNumber);
   
}
 public class CustomerInfo implements PersonalInfo
{
        
 
public void CustomerPersonalDetails(String FirstName , String LastName , String EmailId , int age)
 {
       
       System.out.println(" Name :" + FirstName +LastName);
       System.out.println("EmailId : " + EmailId);
       System.out.println("Age :" + age);
   
 }
 public void CustomerAddressDetails(String address , String city , String country)
 {
      System.out.println("Address :" + address);
      System.out.println("City :" + city);
      System.out.println("Country "+ country);
 }
 public void CustomerContactDetails(int phoneNumber , int alternateNumber)
 {
       System.out.println("phone number :" + phoneNumber);
       System.out.println( "alternate number :" +alternateNumber);
}
}