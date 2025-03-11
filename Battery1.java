class Battery
{
int capacity;
void start()
{
System.out.print("The total capacity");
}
}
class Mobile
{
 Battery b;
Mobile()
{
 b=new Battery();
 b.start();
}
}
public class Battery1
{
public static void main(String[] args)
{
Mobile m=new Mobile();

}
}