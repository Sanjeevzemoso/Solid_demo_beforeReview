package com.solid.Principles;


abstract class FormRegistartion {

    public abstract void submitAadharProof(String aadharNumber);


    public abstract void submitDOBProof(int age);


    public abstract  void submitPensionProof();


    public abstract  void submitForeignResidenceProof( long socialSecurityNumber );
}

class DualCitizen extends FormRegistartion{


    @Override
    public void submitAadharProof(String aadharNumber) {
        System.out.println("Not applicable");

    }



    @Override
    public void submitDOBProof(int age) {
        System.out.println("Not applicable");
    }



    @Override
    public void submitPensionProof() {
        System.out.println("Not applicable");

    }

    @Override
    public void submitForeignResidenceProof(long socialSecurityNumber) {
        System.out.println("Foreign residents need to submit overseas residence proof copy at the office");
        System.out.println("SSN has been noted and submitted");
    }


}

class Indian extends FormRegistartion{




    @Override
    public void submitAadharProof(String aadharNumber) {
        if(aadharNumber.length() > 12) {
            System.out.println( "submitted aadhar with number ********" + aadharNumber.substring(aadharNumber.length()-4));
        }

    }

    @Override
    public void submitDOBProof(int age) {

        if(age > 18 ) {
            System.out.println("Registered dob age :"+age);
            System.out.println("Please also submit pan card copy at the office");
        }
        else
        {
            System.out.println("Registered dob");
        }
    }

    @Override
    public void submitPensionProof() {
        System.out.println("Not applicable");
    }

    @Override
    public void submitForeignResidenceProof(long socialSecurityNumber) {
        System.out.println("Not applicable");
    }

}

class Senior extends FormRegistartion{




    @Override
    public void submitAadharProof(String aadharNumber) {
        System.out.println(aadharNumber.length());
        if(aadharNumber.length() > 10 ) {
            System.out.println( "submitted aadhar with number ********" + aadharNumber.substring(aadharNumber.length()-4));
        }

    }

    @Override
    public void submitDOBProof(int age) {
        System.out.println("Not applicable");
    }

    @Override
    public void submitPensionProof() {
        System.out.println("Pension Proof has been submitted ");

    }

    @Override
    public void submitForeignResidenceProof(long socialSecurityNumber) {
        System.out.println("Not applicable");
    }

}

/********************************************* After Implementing Liskov substitution principle *************************/

interface ForeignFormsManager {
    public void submitForeignResidenceProof(long Number);
}


interface IndianFormsManager {
    public void submitAadharProof(String aadhar);
    public void submitDOBProof(int age);
}


interface PensionFormsManager {

    public void submitAadharProof(String aadhar);
    public   void submitPensionProof();


}

class SeniorForms implements PensionFormsManager{


    @Override
    public void submitAadharProof(String aadharNumber) {
        System.out.println(aadharNumber.length());
        if(aadharNumber.length() > 10 ) {
            System.out.println( "submitted aadhar with number ********" + aadharNumber.substring(aadharNumber.length()-4));
        }

    }

    @Override
    public void submitPensionProof() {
        System.out.println("Pension Proof has been submitted ");

    }
}

class IndianForms implements IndianFormsManager {




    @Override
    public void submitAadharProof(String aadharNumber) {
        System.out.println(aadharNumber.length());
        if(aadharNumber.length() > 10 ) {
            System.out.println( "submitted aadhar with number ********" + aadharNumber.substring(aadharNumber.length()-4));
        }
    }

    @Override
    public void submitDOBProof(int age) {
        if(age > 18 ) {
            System.out.println("Registered dob age :"+age);
            System.out.println("Please also submit pan card copy at the office");
        }
        else
        {
            System.out.println("Registered dob");
        }
    }
}

 class DualCitizenForm implements ForeignFormsManager  {


     @Override
     public void submitForeignResidenceProof(long socialSecurityNumber) {
         System.out.println("Not applicable");
     }
 }

public class LiskovSubstitution {

    public void run() {

        Indian indian = new Indian();
        indian.submitAadharProof("ADSF45FG56RT4532");
        indian.submitDOBProof(23);
        indian.submitPensionProof();
        indian.submitForeignResidenceProof(78659432);


        /**********8 after applying principle ************/

        Senior senior = new Senior();
        senior.submitAadharProof("ASDFGJGROD3133D");
        senior.submitPensionProof();

        DualCitizen dualCitizen = new DualCitizen();
        dualCitizen.submitForeignResidenceProof(453533252);

    }




}
