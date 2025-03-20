package DSA;

public class CharacterCount
{
    public static int countChar(String str, char ch)
    {
        int count = 0;
        for(char c : str.toCharArray())
        {
            if(c == ch)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        String str = "hello world";
        char ch = 'o';
        System.out.println("Occurence of " + ch + " : " + countChar(str, ch));
    }
}
