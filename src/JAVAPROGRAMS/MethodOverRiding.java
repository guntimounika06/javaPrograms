package JAVAPROGRAMS;
class Parent
{
    void makeMoney()
    {
        System.out.println("Parents makes Money");
    }
}

 class Child extends Parent
{
    void makeMoney()
    {
        System.out.println("spends money");

    }
}

 public class MethodOverRiding
{

    public static void main(String[] args)
    {
        Parent myParent = new Child();
        myParent.makeMoney();// TODO Auto-generated method stub

    }

}


