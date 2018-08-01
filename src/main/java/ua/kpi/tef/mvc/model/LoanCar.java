package ua.kpi.tef.mvc.model;

import java.util.Arrays;
import java.util.List;

public class LoanCar extends Loan {

private boolean isNewCar;


    public LoanCar(double loanAmount, int loanPeriodMonths, double loanRatePerYear, boolean hasExtendedPeriodOption, boolean hasPayBeforeDueDateOption, double loanCommission, boolean isNewCar) {
        super(loanAmount, loanPeriodMonths, loanRatePerYear, hasExtendedPeriodOption, hasPayBeforeDueDateOption, loanCommission);
        this.isNewCar = isNewCar;
    }

    @Override
    public double countTotalLoanCost(double loanAmount, int loanPeriodMonths, double loanRatePerYear, double loanCommission) {
        totalAmount = (((loanRatePerYear / 12) * loanPeriodMonths * loanAmount) + (loanAmount * loanCommission) + loanAmount);
        getLoanRatePerYear(this.loanRatePerYear, this.isNewCar);
        return totalAmount;
    }


    public double getLoanRatePerYear(double loanRatePerYear, boolean isPrimaryMarket) {
        if(isNewCar) {
            return loanRatePerYear;
        } else {
            return loanRatePerYear+1.10;
        }
    }
    List<LoanCar> mortgageList = Arrays.asList(
            new LoanCar(100000.00,24, 9.00, true, true, 1.00, false),
            new LoanCar(520000.00,36, 8.00, false, true, 1.10, true),
            new LoanCar(200000.00,24, 7.00, false, false, 1.00, false)
            );

}
