package polymorphism;

import static util.Print.print;

class Actor {
    public void act() {}
}

class HappyActor extends Actor {
    public void act() {
        print("HappyActor");
    }
}

class SadActor extends Actor {
    public void act() {
        print("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();
    public void change() { actor = new SadActor(); }
    public void perfromPlay() { actor.act(); }
}

public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.perfromPlay();
        stage.change();
        stage.perfromPlay();
    }
}
