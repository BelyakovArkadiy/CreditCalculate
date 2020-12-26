public class Main {
    public static void main(String[] args) {
     CreditPaymentService service = new CreditPaymentService();
         int paymentPerMonth1 = service.calculate(1_000_000,12,9.99);
         int paymentPerMonth2 = service.calculate(1_000_000,24,9.99);
         int paymentPerMonth3 = service.calculate(1_000_000,36,9.99);
            System.out.println("The monthly payment is " + paymentPerMonth1 );
            System.out.println("The monthly payment is " + paymentPerMonth2 );
            System.out.println("The monthly payment is " + paymentPerMonth3 );

    }
}
