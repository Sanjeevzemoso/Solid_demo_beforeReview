package com.solid.Principles;


class RegistrationType {
    public void registerforNRI(String medium) {
        if (medium.equals("Normal")) {
            System.out.println("Registering for NRI adult age above 15");
            System.out.println("Need to pay Charges");
            System.out.println("The passport is valid for 20 years ");
            System.out.println("You can regester through portal");
            System.out.println("\n");
        }
        if(medium.equals("Child")){
            System.out.println("Registering for NRI child age below 15");
            System.out.println("The passport is valid for 8 years ");
            System.out.println("You can register through portal");
            System.out.println("\n");
        }
        if(medium.equals("Senior citizen")){
            System.out.print("Please visit this link for help : ");
            System.out.println("https://www.bankbazaar.com/passport/passport-for-senior-citizen.html");
            System.out.println("\n");
        }
    }

    public void registerForNonNRI(String medium){
        if (medium.equals("Normal")) {
            System.out.println("Registering for adult age above 15");
            System.out.println("The passport is valid for 20 years ");
            System.out.println("You can register here");
            System.out.println("https://passport.gov.in/nri/Online.do");
            System.out.println("\n");
        }
        if(medium.equals("Child")){
            System.out.println("Registering for child age below 15");
            System.out.println("The passport is valid for 8 years ");
            System.out.println("You can register through portal");
            System.out.println("\n");
        }

        if(medium.equals("Senior citizen")){
            System.out.print("Please visit this link for help : ");
            System.out.println("https://www.bankbazaar.com/passport/passport-for-senior-citizen.html");
            System.out.println("\n");
        }

    }


}

/************************ With open close principle ****************************/

interface RegistrationService {

    public void registerForNRI( );

    public void registerForNonNRI( );
}


class Normal implements RegistrationService {



    @Override
    public void registerForNRI( ) {
        System.out.println("Registering for NRI adult age above 15");
        System.out.println("Need to pay Charges");
        System.out.println("The passport is valid for 20 years ");
        System.out.println("You can regester through portal");
        System.out.println("\n");
    }

    @Override
    public void registerForNonNRI( ) {
        System.out.println("Registering for adult age above 15");
        System.out.println("The passport is valid for 20 years ");
        System.out.println("You can register here");
        System.out.println("https://passport.gov.in/nri/Online.do");
        System.out.println("\n");
    }
}


class Child implements RegistrationService {


    @Override
    public void registerForNRI( ) {
        System.out.println("Registering for NRI child age below 15");
        System.out.println("The passport is valid for 8 years ");
        System.out.println("You can register through portal");
        System.out.println("\n");
    }

    @Override
    public void registerForNonNRI( ) {
        System.out.println("Registering for adult age above 15");
        System.out.println("The passport is valid for 20 years ");
        System.out.println("You can register here");
        System.out.println("https://passport.gov.in/nri/Online.do");
        System.out.println("\n");
    }
}

class SeniorCitizen implements RegistrationService {
    @Override
    public void registerForNRI() {

            System.out.print("Please visit this link for help : ");
            System.out.println("https://www.bankbazaar.com/passport/passport-for-senior-citizen.html");
            System.out.println("\n");



    }

    @Override
    public void registerForNonNRI() {

            System.out.print("Please visit this link for help : ");
            System.out.println("https://www.bankbazaar.com/passport/passport-for-senior-citizen.html");

    }
}


    public class OpenClosePrinciple {

    public void run () {

            RegistrationType registrationType = new RegistrationType();
            registrationType.registerForNonNRI("Senior citizen");
            registrationType.registerforNRI("Normal");

            /*************** After implementing the Open Close Principle **********/

            SeniorCitizen seniorCitizen = new SeniorCitizen();
            seniorCitizen.registerForNonNRI();

            Normal normal = new Normal();
            normal.registerForNonNRI();
    }


}
