/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/


public class Main {
    int age;
    String name;

    public int getage() {
        return this.age;
    }

    public String getname() {
        return this.name;
    }

    
    public void setname(String name) {
        this.name = name;
    }

    
    public void setage(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Main ob = new Main();
        ob.setname("Shreyansh");
        ob.setage(90);
        
        
        System.out.println(ob.getage());  
        System.out.println(ob.getname()); 
    }
}
