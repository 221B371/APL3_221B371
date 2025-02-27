/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Singleton {
    private static final Singleton instance = new Singleton(); // Eager initialization

    private Singleton() {} // Private constructor

    public static Singleton getInstance() {
        return instance; // Always returns the pre-created instance
    }

    public void showMessage() {
        System.out.println("Eager Singleton");
    }
}

public class Eager {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        obj.showMessage();
    }
}

