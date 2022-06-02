package com.solid.Principles;

class PassportServices {

    private String uname;
    private String pass;
    private String add;


    public void newRegister( String username , String password , String address ) {
        this.uname = username;
        this.pass =  password;
        this.add =   address;
        System.out.println("Username : "+ username + " Password : " + password +" Address : " + address);
        System.out.println("\n");

    }


    public void login(String username , String password ) {
        int sum = 0 ;
        if (username.equals("ravi")) {
            sum = sum+1;
        }
        if (password.equals("ravi123")) {
            sum = sum + 1 ;
        }
        if( sum == 2 ){
            System.out.println("loggedin");
            sum = 0;
        }
        System.out.println("\n");
    }

    public void renew( long date ) {
        System.out.println("Welcome to renew Services");
        System.out.println("Your passport will be renewed for 10 years :");
        System.out.print(date+10);
        System.out.println("\n");
    }

    public void verification(){
        System.out.println("welcome to verfication services ");
        System.out.println("your services will be  through phone and Physical police check");
        System.out.println("\n");
    }

    public  void updation(String updationString){
        System.out.println("Please wait for few minutes .....");
        System.out.println(updationString+" has been updated");
        System.out.println("\n");
    }

}

/*********************************----Implementing principle-------*****************************/

class Registration {

    private String uname;
    private String pass;
    private String add;


    public void newRegister( String username , String password , String address ) {
        this.uname = username;
        this.pass =  password;
        this.add =   address;
        System.out.println("Username : "+ username + " Password : " + password +" Address : " + address);
        System.out.println("\n");

    }

}

class LoginClass {

    public void login(String username , String password ) {
        int sum = 0 ;
        if (username.equals("ravi")) {
            sum = sum+1;
        }
        if (password.equals("ravi123")) {
            sum = sum + 1 ;
        }
        if( sum == 2 ){
            System.out.println("loggedin");
            sum = 0;
        }
        System.out.println("\n");
    }

}


class VerificationClass {

    public void verification(){
        System.out.println("welcome to verfication services ");
        System.out.println("your services will be  through phone and Physical police check");
        System.out.println("\n");
    }
}

class UpdateClass {

    public void updation(String updationString){
        System.out.println("Please wait for few minutes .....");
        System.out.println(updationString+" has been updated");
        System.out.println("\n");
    }
}

class RenewClass {

    public void renew( long date ) {
        System.out.println("Welcome to renew Services");
        System.out.println("Your passport will be renewed for 10 years :");
        System.out.print(date+10);
        System.out.println("\n");
    }

}










public class SingleResponsibilityPrinciple {


    public void run(){

        PassportServices passportServices = new PassportServices();
        System.out.println("\n\n");
        passportServices.newRegister("ravi","ravi123","Hyderabad");
        passportServices.login("ravi","ravi123");
        passportServices.renew(2015);
        passportServices.verification();
        passportServices.updation("Name change to riya");
        System.out.println("\n\n\n");


        /******* After applying the Single Substitution Principle ******/

        Registration registration = new Registration();
        registration.newRegister("ravi","ravi123","Hyderabad");

        RenewClass renewClass = new RenewClass();
        renewClass.renew(2015);

        VerificationClass verificationClass = new VerificationClass();
        verificationClass.verification();

        UpdateClass updateClass = new UpdateClass();
        updateClass.updation("Name change to riya");
    }



}
