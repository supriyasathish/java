interface Playable
{

  void Play();
}

class Guitar implements Playable
{
  @ Override
  public void Play()
  { 
    System.out.println("Guitar");
}
}

class Piano implements Playable
{

 @ Override
 public void Play()
{
 System.out.println("Piano");
}
}
 

public class Sample
{
public static void main (String args[])
{
Guitar g=new Guitar();
Piano p=new Piano();
g.Play();
p.Play();

}
}











