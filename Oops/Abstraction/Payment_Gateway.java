package Oops.Abstraction;
import java.util.Scanner;

class main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Select payment Method: \n 1.Credit Card \n 2.UPI \n 3. Net Banking");
    int choice = input.nextInt();

    System.out.print("Enter amount:");
    double amount = input.nextDouble();

    input.nextLine();
    IPayment payment;

    switch (choice) {
      case 1:
        System.out.print("Enter Credit Card Number: ");
        String cardNumber = input.nextLine();
        payment = new CreditCardPayment(cardNumber);
        break;

        case 2:
          System.out.print("Enter UPI ID:");
          String UserrId = input.nextLine();
          payment = new  UpiPayment(upiId);
          break;

        case 3:
          System.out.print("Enter");
    
      default:
        System.out.println("Invaalid choice!!");
        input.close();
        return ;
    }

  }

    
}

abstract class IPayment {
        abstract void paymentProcess(double amount);
        
        abstract void generateReceipt();
    
}

class CreditCardPayment extends IPayment{
    String cardNumber;

    public CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }
    @Override 
    public void paymentProcess(double amount){
        System.out.print("Processing card payment of Rs: "+ amount + "using card nuber."+ cardNumber);
    }
    @Override 
    public void  generateReceipt(){
        System.out.println("your reciept is generated.");
    }
}import java.util.Scanner;
 
 class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Select payment Method : 1.Credit Card 2. UPI 3.Net Banking");
 
        int choice = sc.nextInt();
 
        System.out.print("Enter Amount : ");
 
        double amount = sc.nextDouble();
 
        sc.nextLine();
        IPayment payment;
        switch (choice) {
            case 1:
                System.out.println("Enter Credit Card Number: ");
                String cardNumber = sc.nextLine();
                payment = new CreditCardPayment(cardNumber);
                break;
            case 2:
                System.out.println("Enter UPI ID: ");
                String upiId = sc.nextLine();
                payment = new UpiPayment(upiId);
                break;
            case 3:
                System.out.println("Enter UserID: ");
                String userId = sc.nextLine();
                payment = new NetBankingPayment(userId);
                break;
 
            default:
                System.out.println("Invalid Choice!!");
                sc.close();
                return;
 
        }
 
        PaymentService service = new PaymentService(payment);
 
        service.executePayment(amount);
        sc.close();
    }
 
    class PaymentService {
        private IPayment payment;
 
        public PaymentService(IPayment payment) {
            this.payment = payment;
        }
 
        public void executePayment(double amount) {
            payment.paymentProcess(amount);
            payment.generateReceipt();
 
        }
 
    }
 
    abstract class IPayment {
        abstract void paymentProcess(double amount);
 
        abstract void generateReceipt();
 
    }
 
    class CreditCardPayment extends IPayment {
        String cardNumber;
 
        public CreditCardPayment(String cardNumber) {
            this.cardNumber = cardNumber;
        }
 
        @Override
        public void paymentProcess(double amount) {
 
            System.out.println("Processing card payment of Rs: " + amount + " using card number : " + cardNumber);
 
        }
 
        @Override
        public void generateReceipt() {
            System.out.println("Credit card payment Receipt Generated.");
        }
 
    }
 
    class UpiPayment extends IPayment {
        String upiId;
 
        public UpiPayment(String upiId) {
            this.upiId = upiId;
        }
 
        @Override
        public void paymentProcess(double amount) {
 
            System.out.println("Processing UPI payment of Rs: " + amount + " using UPI Id : " + upiId);
 
        }
 
        @Override
        public void generateReceipt() {
            System.out.println("UPI payment Receipt Generated.");
        }
    }
 
class NetBankingPayment extends IPayment {
    String userId;
 
    public NetBankingPayment(String userId) {
        this.userId = userId;
    }
 
    @Override
    public void paymentProcess(double amount) {
 
        System.out.println("Processing Net Banking payment of Rs: " + amount + " using UserId: " + userId);
 
    }
 
    @Override
    public void generateReceipt() {
        System.out.println("Net Banking payment Receipt Generated.");
    }
}
 
 
