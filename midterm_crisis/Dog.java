/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm_crisis;

/**
 *
 * @author airew
 */
public class Dog extends Animal {
    public Dog(String name, int age){
        setName(name);
        setAge(age);
        setPower(200);
    }
    public void kick(Animal a){
        a.setPower(a.getPower()-5);
    }

    @Override
    public void eat(Food f) {
        setPower(getPower()+f.getPower());
    }
}
