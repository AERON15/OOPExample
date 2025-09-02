
class Fruit {
    private String color; 

    public void setColor(String color) {
        this.color = color;  
    }

    public String getColor() {
        return color;  
    }

   
    void eat() {
        System.out.println("You eat the fruit.");
    }
}


class Apple extends Fruit {
    @Override
    void eat() {
        System.out.println("You bite the " + getColor() + " apple.");
    }
}

class Carrot extends Fruit {
    @Override
    void eat() {
        System.out.println("You crunch the " + getColor() + " carrot.");
    }
}


public class OOPExample {
    public static void main(String[] args) {
        Fruit myFruit1 = new Apple();
        myFruit1.setColor("red");
        myFruit1.eat();  

        Fruit myFruit2 = new Carrot();
        myFruit2.setColor("orange");
        myFruit2.eat(); 
    }
}

