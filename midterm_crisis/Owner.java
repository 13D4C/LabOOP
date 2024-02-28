/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm_crisis;

/**
 *
 * @author airew
 */
public class Owner {
    protected final String name;
    protected Animal animal;
    public Owner(){
        this.name= "";
        this.animal = null;
    }
    public Owner(String name){
        this.name = name;
    }
    public Owner(Animal animal){
        this.name ="";
        this.animal=null;
        
    }
    public Owner(String name, Animal animal){
        this.name= name;
        this.animal = animal;
    }
    
    public String getName(){
        return name;
    }
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public void feedFood(Food f){
        animal.setPower(animal.getPower()+f.getPower());
    }
    @Override
    public String toString(){
        return "Owner : name = "+this.getName()+ ", Animal : name = "+animal.getName()+", power = " + animal.getPower()+", age = "+animal.getAge();
    }
    public void protectOwnerFrom(Animal a){
        Animal check = new Dog(a.getName(), a.getAge());
        Animal code = new Pigeous(a.getName(), a.getAge());
        if(a instanceof Dog){
            ((Dog) check).kick(a);
        }
        
        else if(a instanceof Pigeous){
            ((Pigeous) code).wingAttack(a);
        }
    }
}
