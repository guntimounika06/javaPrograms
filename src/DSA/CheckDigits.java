package DSA;

public class CheckDigits
{
    public static boolean isNumeric(String str)
    {
        if(str.isEmpty()) return false;
        for(char ch : str.toCharArray())
        {
            if(!Character.isDigit(ch))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(isNumeric("12345"));
        System.out.println(isNumeric("12a45"));
    }
}
