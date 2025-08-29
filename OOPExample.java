// 1. Encapsulation: Keep info safe inside the Fruit class
class Fruit {
    private String color;  // We hide the color

    public void setColor(String color) {
        this.color = color;  // Set color safely
    }

    public String getColor() {
        return color;  // Get color safely
    }

    // 2. Abstraction: We say fruit can be eaten, but don't say how here
    void eat() {
        System.out.println("You eat the fruit.");
    }
}

// 3. Inheritance: Apple and Carrot are kinds of Fruit
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

// 4. Polymorphism: One fruit type, many forms!
public class OOPExample {
    public static void main(String[] args) {
        Fruit myFruit1 = new Apple();
        myFruit1.setColor("red");
        myFruit1.eat();  // Output: You bite the red apple.

        Fruit myFruit2 = new Carrot();
        myFruit2.setColor("orange");
        myFruit2.eat();  // Output: You crunch the orange carrot.
    }
}
