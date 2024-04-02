package abstractAndInterfaceInJava;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author buina
 */
abstract class animal {
    protected String name;
    public static int count = 0;

    public abstract void makeSound();
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
        

}
