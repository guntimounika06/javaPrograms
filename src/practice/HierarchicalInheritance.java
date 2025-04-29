package practice;
class One
{
    public void numbers()
    {
        System.out.println("Numberical values");
    }
}
class Letter extends One
{
    public void alphabets()
    {
        System.out.println("Alphabet words");
    }
}
class HierarchicalInheritance extends One
{
    public void types()
    {
        System.out.println("Different types of colors");
    }

    public static void main(String[] args)
    {
        HierarchicalInheritance h = new HierarchicalInheritance();
        h.types();
        h.numbers();
        //h.alphabets();
        Letter l = new Letter();
        l.alphabets();
        l.numbers();
        //l.types();
    }
}

