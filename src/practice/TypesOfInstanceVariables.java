package practice;

public class TypesOfInstanceVariables
{
    static  int a = 10;
    public static void main(String[] args)
    {
        System.out.println(a);//Direct calling
        TypesOfInstanceVariables v = new TypesOfInstanceVariables();
        System.out.println(v.a);//Using Instance
        System.out.println(TypesOfInstanceVariables.a);//Using Classname
    }
}
