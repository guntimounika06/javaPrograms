package practice;
class Multi
{
    public void vegetables()
    {
        System.out.println("Leafy Vegetables");
    }
}
class Level extends Multi
{
    public void vegetable()
    {
        System.out.println("Raw Vegetables");

    }
}
class MultiLevelInheritance extends Level
{
    public void fruits()
    {
        System.out.println("All fruits");
    }

    public static void main(
            String[] args)
    {
        MultiLevelInheritance m = new MultiLevelInheritance();
        m.fruits();
        m.vegetable();
        m.vegetables();
        Level l = new Level();
        l.vegetables();
        l.vegetable();
        //l.fruits();
    }

}
