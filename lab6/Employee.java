/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author airew
 */
public class Employee {
    private static String nationality = "Thai";

    public static String getNationality() {
        return nationality;
    }

    public static void setNationality(String aNationality) {
        nationality = aNationality;
    }
    private String name;
    private Wallet wallet;
    private int energy;
    public boolean equals(Employee e){
        if(e.name.equals(name)){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        return "My name is " + this.getName() + ". \nI have " +
                    this.getEnergy() + " energy left.\nI have a balance of " +
                    this.getWallet().getBalance() + " baht.";
    }
    public boolean buyFood(Seller s){
        if (s == null) {
                  return false;
            }   
            else {
                  this.eat(s.sell(this));
                  return true;
            }
        
    }
    public void eat(Food f){
        this.energy += Food.getEnergy();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
    
    
}
