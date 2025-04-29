package practice;
//this keyword refers to the current instance variable
//whenever the instance variable and the local variable are of same type, to refer the current instance variable we use this keyword.
public class ThisKeyword
{
    int y;//Instance variable
    public void display(int y)//Local variable
    {
        this.y = y;
    }

    public void show(int y)
    {
       this.y = y;
    }

    public static void main(String[] args)
    {
        ThisKeyword t = new ThisKeyword();
        t.display(100);
        System.out.println("Value = " + t.y);
        ThisKeyword d = new ThisKeyword();
        d.show(20);
        System.out.println("Value: " + d.y);
    }
}
