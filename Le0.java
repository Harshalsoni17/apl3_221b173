/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Juet
{
    String name;
    int age;
    void setter(String s,int n){
        name= s;
        age = n;
        
    }
    String name2;
    int age2;
    void setter2(String s,int n){
        name2= s;
        age2 = n;
        
    }
    
    void getter(){
        System.out.println("name   " + " age");
        System.out.println(name + age);
    }
    void getter2(){
        System.out.println();
        System.out.println(name2 + age2);
    }
	public static void main(String[] args) {
	    Juet st=new Juet();
	    
	   st.setter("harshal  ",20);
	   st.getter();
	    st.setter2("Harsha  ",22);
	   st.getter2();
		
	}
}
