import java.util.Scanner;
 
class Main {
   public static void main(String[] args) {
      Bank obj=new Bank();
      boolean flag=true;
      while(flag){
      System.out.println("enter number.");
          Scanner scanner = new Scanner(System.in);
         int num= scanner.nextInt(); 
        
         switch(num){
             
             case 1:
             obj.CheckBalance();
             break;
             case 2:
             obj.DepositMoney();
             break;
             case 3:
             obj.WithdrawMoney();
             break;
             default:
                   flag=false;
                       obj.Exit();
             
         }
         
         }
   }
}


class Bank {
   
   int Balance=0;
   void CheckBalance() {
        System.out.println("Your account balance is" + Balance);
   }
    void DepositMoney() {
         System.out.println("enter money to deposit.");
          Scanner scanner = new Scanner(System.in);
         int deposit= scanner.nextInt(); 
      Balance+=deposit;
       System.out.println("Money added successfully.");
        System.out.println("Your account balance is " + Balance);
      
   }
    void WithdrawMoney() {
        System.out.println("enter money to withdraw.");
          Scanner scanner = new Scanner(System.in);
         int withdraw= scanner.nextInt();
      if(Balance >= withdraw){
          Balance-=withdraw;
          System.out.println("Withdraw process successfull.");
      }
      else{
           System.out.println("Not sufficient balance.");
      }
       System.out.println("Your account balance is " + Balance);
          
   }
    void Exit() {
       System.out.println("Process Completed.");
   }
}

