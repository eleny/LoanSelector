package ua.kpi.tef.mvc.model;

import java.util.Arrays;
import java.util.List;

public class LoanMortgage extends Loan {

private boolean isPrimaryMarket;


    public LoanMortgage(double loanAmount, int loanPeriodMonths, double loanRatePerYear, boolean hasExtendedPeriodOption, boolean hasPayBeforeDueDateOption, double loanCommission, boolean isPrimaryMarket) {
        super(loanAmount, loanPeriodMonths, loanRatePerYear, hasExtendedPeriodOption, hasPayBeforeDueDateOption, loanCommission);
        this.isPrimaryMarket = isPrimaryMarket;
    }

    @Override
    public double countTotalLoanCost(double loanAmount, int loanPeriodMonths, double loanRatePerYear, double loanCommission) {
        totalAmount = (((loanRatePerYear / 12) * loanPeriodMonths * loanAmount) + (loanAmount * loanCommission) + loanAmount);
        getLoanRatePerYear(this.loanRatePerYear, this.isPrimaryMarket);
        return totalAmount;
    }


    public double getLoanRatePerYear(double loanRatePerYear, boolean isPrimaryMarket) {
        if(!isPrimaryMarket) {
            return loanRatePerYear;
        } else {
            return loanRatePerYear+1.10;
        }
    }
    List<LoanMortgage> mortgageList = Arrays.asList(
            new LoanMortgage(280000.00,24, 9.00, true, true, 1.00, false),
            new LoanMortgage(520000.00,36, 8.00, false, true, 1.10, true),
            new LoanMortgage(50000.00,24, 8.50, false, false, 1.00, false)
            );

}
