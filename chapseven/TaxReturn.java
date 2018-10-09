/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapseven;

/**
 *
 * @author Frebby
 */
public class TaxReturn {
    private String securityNum;
    private String lastName;
    private String firstName;
    private String street;
    private String address;
    private String city;
        private int zipCode;
            private double annualIncome;
                private String maritalStats;
                    private String taxLiability;

    public TaxReturn(String securityNum, String lastName, String firstName, String street, String address, String city, int zipCode, double annualIncome, String maritalStats) {
        this.securityNum = securityNum;
        this.lastName = lastName;
        this.firstName = firstName;
        this.street = street;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.annualIncome = annualIncome;
        this.maritalStats = maritalStats;
       
    }



}
