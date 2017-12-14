package ch.mycompany.gui;

/**
 * Hello world!
 *
 */
public class App 
{
    double d = Double.longBitsToDouble(42);  // Noncompliant
    public static void main( String[] args )
    {
        int i = 42;
        double d = Double.longBitsToDouble(i);  // Noncompliant
        System.out.println( "Hello World!" );
    }

    private void untested() {
        try {
            System.out.println( "Hello World!" );
        } catch(Exception e) {
            int i = 42;
            double d = Double.longBitsToDouble(i);  // Noncompliant
        }
    }

    public int foo() {
        int i = 100023;
        return i;
    }

    private void bar() {
    }

    private void foobar() {
        int gugus = 6666;
        //FIXME fix this
        float pi = 3.1415f;
        double e = 2.718;
    }

}
