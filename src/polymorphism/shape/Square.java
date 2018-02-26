package polymorphism.shape;

import static util.Print.print;

public class Square extends Shape{
    public void draw() {
        print("Square.draw()");
    }

    public void erase() {
        print("Square.erase()");
    }
}
