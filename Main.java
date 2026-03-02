class Banner
{
    void display()
    {
        System.out.println("***********");
        System.out.println("*        OOPS BANNER APP    *");
        System.out.println("*     Welcome to Java OOP   *");
        System.out.println("***********");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Banner b = new Banner();
        b.display();
    }
}
