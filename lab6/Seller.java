/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author airew
 */
public class Seller extends Employee {
     public Food sell(Employee e){
         if(e.getWallet().getBalance() > Food.getPrice()){
         Food jo = new Food();
         this.getWallet().setBalance(this.getWallet().getBalance()+Food.getPrice());
         e.getWallet().setBalance(e.getWallet().getBalance()-Food.getPrice());
         return jo;
         }else{
             System.out.println("Your money is not enough.");
             return null;
         }
          }
    }

