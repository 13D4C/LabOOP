/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm_crisis;

/**
 *
 * @author airew
 */
public class Pigeous extends Bird {
    public Pigeous(){
        this("",0);
        this.setPower(150);
    }
    public Pigeous(String name,int age){
        super(name,age);
        this.setPower(150);
    }
    public void wingAttack(Animal a, int times){
        
        for(int i=times; i>0; i--){
            a.setPower(a.getPower()-5);
        }
    }
    @Override
    public void eat(Food f){
        setPower(getPower()+(2*f.getPower()));
    }

    @Override
    public void wingAttack(Animal a) {
        a.setPower(getPower()- (a.getPower()-5));
    }

    @Override
    public void fly() {
        System.out.println(getName() + " fly fly ....");
    }
}
