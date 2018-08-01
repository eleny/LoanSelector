package ua.kpi.tef.mvc.model;

public abstract class Loan /*implements Comparable<AbstractInsurance>*/ {

    protected double loanAmount;
    protected int loanPeriodMonths;
    protected double loanRatePerYear;
    protected boolean hasExtendedPeriodOption;
    protected boolean hasPayBeforeDueDateOption;
    protected double loanCommission;
    protected double totalAmount;
//    private double loanFinesOverdue;


    public Loan(double loanAmount, int loanPeriodMonths, double loanRatePerYear, boolean hasExtendedPeriodOption, boolean hasPayBeforeDueDateOption, double loanCommission) {
        this.loanAmount = loanAmount;
        this.loanPeriodMonths = loanPeriodMonths;
        this.loanRatePerYear = loanRatePerYear;
        this.hasExtendedPeriodOption = hasExtendedPeriodOption;
        this.hasPayBeforeDueDateOption = hasPayBeforeDueDateOption;
        this.loanCommission = loanCommission;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public int getLoanPeriodMonths() {
        return loanPeriodMonths;
    }

    public double getLoanRatePerYear() {
        return loanRatePerYear;
    }

    public boolean isHasExtendedPeriodOption() {
        return hasExtendedPeriodOption;
    }

    public boolean isHasPayBeforeDueDateOption() {
        return hasPayBeforeDueDateOption;
    }

    public double getLoanCommission() {
        return loanCommission;
    }

//    public double getLoanFinesOverdue() {
//        return loanFinesOverdue;
//    }


    public abstract double countTotalLoanCost(double loanAmount, int loanPeriodMonths, double loanRatePerYear, double loanCommission);

    }
