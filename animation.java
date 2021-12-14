/**
 * This class represents an animated picture. You can start the animation using
 * the start method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been animated, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class animation
{
    // defining fields by instance variables
    private Triangle top;
    private Triangle middle;
    private Triangle base;
    private Circle sun;
    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;
    private Person person5;
    private boolean animated;

    /**
     * Constructor for objects of class animation
     */
    public animation()
    {
        //initialization with the reference to newly generated objects
        top = new Triangle();
        middle = new Triangle();
        base = new Triangle();  
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
        person4 = new Person();
        person5 = new Person();
        sun = new Circle();
        animated = false;
    }

    /**
     
     */
    public void start()
    {
        if(!animated) {
            //this draws the object persons by giving them methods
            person1.makeVisible();
            person1.slowMoveHorizontal(-70);
            person1.moveVertical(-20);
            person1.changeSize(50,70);
            person1.changeColor("blue");
            person2.makeVisible();
            person2.changeColor("black");
            person2.moveHorizontal(-60);
            person2.moveUp();
            person2.moveLeft();
            person2.moveRight();
            person2.moveLeft();
            person2.changeSize(90,50);
            person3.makeVisible();
            person3.moveVertical(-60);
            person3.moveLeft();
            person3.changeColor("green");
            person3.changeSize(60,80);
            person4.makeVisible();
            person4.slowMoveVertical(-40);
            person4.moveRight();
            person4.moveRight();
            person4.changeColor("brown");
            person4.changeSize(80,60);
            person5.makeVisible();
            person5.moveHorizontal(80);
            person5.moveVertical(-20);
            person5.moveRight();
            person5.changeColor("red");
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            animated = true;
            
    
            
            
            
            
        }
    }

    
}
