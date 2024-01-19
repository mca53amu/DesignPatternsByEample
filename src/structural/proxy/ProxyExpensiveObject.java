package structural.proxy;

public class ProxyExpensiveObject implements ExpensiveObject {
    private volatile RealObject realObject;

    @Override
    public void test() {
        if (realObject == null) {
            synchronized (ProxyExpensiveObject.class) {
                if (realObject == null) {
                    realObject = new RealObject();
                }
            }

        }
        realObject.test();
    }
}
