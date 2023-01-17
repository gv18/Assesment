interface Test{
    void TestDraw();
}
class InterfaceImplementation implements Test{
    public void TestDraw(){
        System.out.println("Hello");
    }
}
public class InterfaceTest
{
    public static void main (String[] args)
    {
        Test t1 = new InterfaceImplementation();
        t1.TestDraw();
    }
}