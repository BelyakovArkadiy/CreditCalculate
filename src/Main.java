public class Main {
    public static void main(String[] args) {
     CreditPaymentService service = new CreditPaymentService();
         int paymentPerMonth1 = service.calculate(1);
         int paymentPerMonth2 = service.calculate(2);
         int paymentPerMonth3 = service.calculate(3);
         float percent = 9.99f;
            System.out.println("The monthly payment is " + paymentPerMonth1 + ", interest rate " + percent);
            System.out.println("The monthly payment is " + paymentPerMonth2 + ", interest rate " + percent);
            System.out.println("The monthly payment is " + paymentPerMonth3 + ", interest rate " + percent);

    }
}
