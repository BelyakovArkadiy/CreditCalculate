public class CreditPaymentService {
    public int calculate(int amount, int term, double percent) {
         double percentInMonth = percent / 100 / 12;
         double coefficient = (percentInMonth * Math.pow((1+percentInMonth),term)) / (Math.pow((1+percentInMonth),term) - 1);
         int paymentPerMonth = (int)(coefficient * amount);
         return paymentPerMonth;


      }
    }




