package structural.proxy;

public class RealObject implements ExpensiveObject {
    @Override
    public void test() {
        System.out.println("I am real object");
    }
}
