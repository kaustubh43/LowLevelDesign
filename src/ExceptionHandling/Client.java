package ExceptionHandling;

public class Client {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            String str = null;
            System.out.println(str.length());
            System.out.println("Null pointer exception caught");
        }
        finally{
            System.out.println("Finally block");
        }
    }
}
