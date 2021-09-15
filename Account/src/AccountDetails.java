import java.util.*;

class AccountDetails {
    
    public void getAccountDetails(){
        
        Scanner s =new Scanner(System.in);
        Account A =new Account();
        System.out.println("Enter account id:");
        int accountId = s.nextInt();
        
        System.out.println("Enter account Type:");
        String accountType = s.nextLine();
       
        
        while(true){
        	Scanner sc =new Scanner(System.in);
            System.out.println("Enter balance:");
             int bal = sc.nextInt();
            if(bal>0)
            {
            	A.setBalance(bal);
                break;
            }
            System.out.println(" balance Should be positive");
        }
        
        A.setAccountId(accountId);
        A.setAccountType(accountType);
      
        
    }
    
    public int getWithdrawAmount(){
         Scanner sc =new Scanner(System.in);
         int withdraw;
        while(true){
            System.out.println("Enter the amount to be withdrawn:");
            withdraw = sc.nextInt();
            if(withdraw>0)
            {
            	break;
            }
            System.out.println("Amount should be positive");
           
            
        }
		return withdraw;
		
        
    }
    
    
    public static void main (String[] args) {
        
        AccountDetails ac = new AccountDetails();
        
        ac.getAccountDetails();
        int withdraw = ac.getWithdrawAmount();
        
        Account a = new Account();
        
        a.withdraw(withdraw);
        
        
    }
}