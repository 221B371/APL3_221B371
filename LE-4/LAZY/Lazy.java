/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Singleton {
    private static Singleton instance;

    private Singleton() {} // Private constructor

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Create instance only when needed
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Lazy Singleton!");
    }
}

public class Lazy {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        obj.showMessage();
    }
}
