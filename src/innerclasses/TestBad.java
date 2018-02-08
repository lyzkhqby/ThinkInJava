package innerclasses;

public class TestBad {
    public void f() {
        System.out.println("f()");
    }

    public static class Tester {
        public static void main(String[] args) {
            TestBad t = new TestBad();
            t.f();
        }
    }
}
