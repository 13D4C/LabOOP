/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author airew
 */
public class Account {
      protected double balance;
      protected String name;
      public Account (double balance, String name) {
            this.balance = balance;
            this.name = name;
      }
      public void deposit (double a) {
            if (a > 0) {
                  System.out.println(a + " baht is deposited to " + this.getName() + ".");
                  this.setBalance(this.getBalance() + a);
            }
            else {
                  System.out.println("Input number must be a positive integer.");
            }
      }
      public void withdraw (double a)  throws WithdrawException {
            if (a < 0) {
                  System.out.println("Input number must be a positive integer.");
            }
            else if (this.getBalance() - a < 0) {
                  System.out.println("Not enough money!");
            }
            else {
                  System.out.println(a + " baht is withdrawn from " + this.getName() + ".");
                  this.setBalance(this.getBalance() - a);
            }
      }
      
      public void showAccount () {
            System.out.println(this.getName() + " account has " + this.getBalance() + " baht.");
      }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}