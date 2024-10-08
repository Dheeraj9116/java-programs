package oops;

 class ClassH1 
{
    public void dispH1()
    {
        System.out.println("disp() method of ClassH1");
    }
}
 class ClassH2 extends ClassH1 
{
    public void dispH2()
    {
        System.out.println("disp() method of ClassH2");
    }
}
 class ClassH3 extends ClassH1
{
    public void dispH3()
    {
        System.out.println("disp() method of ClassH3");
    }
}
 class ClassH4 extends ClassH1
{
    public void dispH4()
    {
        System.out.println("disp() method of ClassH4");
    }
}
public class HierarchicalInheritance 
{
    public static void main(String args[])
    {
        //Assigning ClassH2 object to ClassH2 reference
        ClassH2 h2 = new ClassH2();
        //call dispH2() method of ClassH2
        h2.dispH2();
        //call dispH1() method of ClassH1
        h2.dispH1();
        
        
        //Assigning ClassH3 object to ClassH3 reference
        ClassH3 h3 = new ClassH3();
        //call dispH3() method of ClassH3
        h3.dispH3();
        //call dispH1() method of ClassH1
        h3.dispH1();
        
        //Assigning ClassH4 object to ClassH4 reference
        ClassH4 h4 = new ClassH4();
        //call dispH4() method of ClassH4
        h4.dispH4();
        //call dispH1() method of ClassH1
        h4.dispH1();
    }
}