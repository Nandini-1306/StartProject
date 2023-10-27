 package billing;
 
 public class PaymentProcess
    {
        int option;
       public  void methodOfPayment()
        {
            System.out.println("Enter your choice");
            System.out.println("1 : credit/debit card");
            System.out.println("2 : upi ");
            System.out.println("3: Net Banking");
            switch(option)
            {
               case 1:  
                    System.out.println("Enter your card number");
                    break;
               case 2:
                    System.out.println("Enter your upi id"); 
                    break; 
               case 3:
                    System.out.println("Enter your bank name");
                    break;
               default :
                     System.out.println("Invalid choice . Please try again!");
                           
            }
        }

    }
    