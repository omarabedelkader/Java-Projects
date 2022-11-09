/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loan;

/**
 *
 * @author Omar
 */
public class Loan {
        
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;
           
    public Loan(){
        
    }
    
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public int getNumberOfYears(){
        return numberOfYears;
    }
    
    public double getloanAmount(){
        return loanAmount;
    }
    
    public java.util.Date getLoanDate(){
        return loanDate;
    }
    
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    
    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }
    
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }
    
    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 100;
        double monthlyPayment = loanAmount * monthlyInterestRate /  (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        return monthlyPayment;
    }   
    
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
        
    }
}
