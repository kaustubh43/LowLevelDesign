package InterfacesDemo;

public class C implements I{

    @Override
    public void funcCommon() {
        System.out.println("Having Common Fun from interface I");
    }

    @Override
    public void fun1() {
        System.out.println("Having Fun 1");
    }

    @Override
    public void fun2() {
        System.out.println("Having Fun 2");
    }

    @Override
    public void fun() {
        System.out.println("Having Fun");
    }
}
