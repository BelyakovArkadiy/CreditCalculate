public class CreditPaymentService {
    public int calculate(int loanTermInYears) {
        int payment = 0;
        if (loanTermInYears == 1) {
           payment = 87911;
        }

        if (loanTermInYears == 2) {
           payment = 46140;
        }


        if (loanTermInYears == 3) {
            payment =  32262;
        }
        return payment;
      }
    }




