package com.solid.Principles;

class ShoppingMall {

    private DebitCard debitCard;

    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void doPurchaseSomething(long amount){
        debitCard.doTransaction(amount);
    }


}

class DebitCard {

    public void doTransaction(long amount){
        System.out.println("payment using Debit card");
    }
}

class CreditCard {

    public void doTransaction(long amount){
        System.out.println("payment using Credit card");
    }
}

/*****************************---- After applying dependency inversion principle *************************/

interface BankCard {

    public void doTransaction(long amount);
}

class CreditCardClass implements BankCard {
    @Override
    public void doTransaction(long amount) {
        System.out.println("payment using Credit card");
    }
}

class DebitCardClass implements BankCard {
    @Override
    public void doTransaction(long amount) {
        System.out.println("payment using Debit card");
    }
}

class ShoppingMallClass {
    private BankCard bankCard;

    public ShoppingMallClass(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }


}



public class DependencyInversionPrinciple {

    public void run(){

        DebitCard debitCard=new DebitCard();
        ShoppingMall shoppingMall=new ShoppingMall(debitCard);
        shoppingMall.doPurchaseSomething(5000);



        /***************** After applying dependency inversion principle ********************/

        BankCard bankCard=  new CreditCardClass();
        ShoppingMallClass shoppingMallVar=new ShoppingMallClass(bankCard);
        shoppingMallVar.doPurchaseSomething(5000);
    }

}
