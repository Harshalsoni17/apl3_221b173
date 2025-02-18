/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Abstract Base Class: Bharatvanshi
abstract class Bharatvanshi {
    // Abstract methods
    public abstract void fight();
    public abstract void obey();
    public abstract void kind();
}

// Concrete Class: Pandav


// Concrete Class: Kaurav


// Concrete Class: Arjun (Subclass of Pandav)


// Concrete Class: Bheem (Subclass of Pandav)


// Concrete Class: Vikarn (Subclass of Kaurav)

// Main Class for testing
public class Main {
    public static void main(String[] args) {
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        Bharatvanshi vikarn = new Vikarn();
        Bharatvanshi kaurav = new Kaurav();

        arjun.fight();
        arjun.obey();
        arjun.kind();

        System.out.println();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        System.out.println();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();

        System.out.println();

        kaurav.fight();
        kaurav.obey();
        kaurav.kind();
    }
}
