package lesson2.crossword;

public class A {
    public void hello(){
        System.out.println("Hello from A");
    }
    protected void world(){
        System.out.println(" World");
    }
    // final нельзя ovverride в производных
    final void secure(){
        System.out.println("Secure A");

    }
}
