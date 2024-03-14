interface A{
    final String name = "A";
    void methodOfA();
}
interface A1 extends A{
    String name = "A1";
    void methodA1();
}
interface A2 extends A{
    String name = "A2";
    void methodA2();
}
 interface A12 extends A1,A2{
    String name = "A12";
    void methodA12();
}
   class B implements A12{
    @Override
    public void methodOfA(){
    System.out.println(A.name);
    }
    @Override
    public void methodA1(){
    System.out.println(A1.name);
    }
    @Override
    public void methodA2(){
    System.out.println(A2.name);
    }
    @Override
    public void methodA12(){
    System.out.println(A12.name);
    }
    }




public class LAb7_2 {
    public static void main(String[] args) {
        B h = new B();
        h.methodOfA();
        h.methodA1();
        h.methodA2();
        h.methodA12();
    }
}
