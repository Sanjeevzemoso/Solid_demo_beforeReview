package com.solid.Principles;

import java.util.Random;

interface Verification {

    public void useMobileVerification(int mobileNumber);


    public void useAnnexureF();

    public void useLocalPSVerification(String Address);
}

class Ravi implements Verification{




    @Override
    public void useMobileVerification(int mobileNumber) {
        System.out.println("Please open your mobile camera hold still and hold still");
        System.out.println("fetching data from https://docs.opencv.org/3.4/d1/de5/classcv_1_1CascadeClassifier.html#aaf8181cb63968136476ec4204ffca498");
        System.out.println("User Identified and verification completed"+mobileNumber);
    }

    @Override
    public void useAnnexureF() {
        System.out.println("Not Using");

    }

    @Override
    public void useLocalPSVerification(String Address) {
        System.out.println("Not Using");

    }


}

class Ramesh implements Verification{


    @Override
    public void useMobileVerification(int mobileNumber) {
        System.out.println("Not Using");
    }

    @Override
    public void useAnnexureF() {
        System.out.println("Please Provide verification Document");
        System.out.println("Please mention the signed person name");

    }

    @Override
    public void useLocalPSVerification(String Address) {
        Random random = new Random();
        System.out.println("THank you out local police will come for verification in "+ random.nextInt(0,6)
                +" Days at "+ Address);

    }


}

class Raju implements Verification{



    @Override
    public void useMobileVerification(int mobileNumber) {
        System.out.println("Not Using");
    }

    @Override
    public void useAnnexureF() {
        System.out.println("Please Provide verification Document");
        System.out.println("Please mention the signed person name");

    }

    @Override
    public void useLocalPSVerification(String Address) {
        Random random = new Random();
        System.out.println("THank you out local police will come for verification in "+ random.nextInt(0,6)
                +" Days at "+ Address);

    }


}

/************************** After applying Interface Segregation principle ***********************/

interface DigitalVerificationManager {

    public void useMobileVerification(int mobileNumber);
}

interface PhysicalVerificationManager {

    public void useAnnexureF();

    public void useLocalPSVerification(String Address);
}

class RajuClass implements PhysicalVerificationManager {



    @Override
    public void useAnnexureF() {
        System.out.println("Please Provide verification Document");
        System.out.println("Please mention the signed person name");

    }


    @Override
    public void useLocalPSVerification(String Address) {
        Random random = new Random();
        System.out.println("THank you out local police will come for verification in "+ random.nextInt(0,6)
                +" Days at "+ Address);

    }



}

class RameshClass implements PhysicalVerificationManager {




    @Override
    public void useAnnexureF() {
        System.out.println("Please Provide verification Document");
        System.out.println("Please mention the signed person name");

    }


    @Override
    public void useLocalPSVerification(String Address) {
        Random random = new Random();
        System.out.println("THank you out local police will come for verification in "+ random.nextInt(0,6)
                +" Days at "+ Address);

    }
}

class RaviClass implements DigitalVerificationManager {



    @Override
    public void useMobileVerification(int mobileNumber) {
        System.out.println("Please open your mobile camera hold still and hold still");
        System.out.println("fetching data from https://docs.opencv.org/3.4/d1/de5/classcv_1_1CascadeClassifier.html#aaf8181cb63968136476ec4204ffca498");
        System.out.println("User Identified and verification completed"+mobileNumber);
    }

}



public class InterfaceSegregationPrinciple {
    public void run() {

        Raju raju = new Raju();
        raju.useMobileVerification(456456);
        raju.useAnnexureF();
        raju.useLocalPSVerification("Road no : 2 , Hyderguda");

        RajuClass rajuClass = new RajuClass();
        rajuClass.useAnnexureF();
        rajuClass.useLocalPSVerification("Road no : 3 , Banjarahills");
    }


}
