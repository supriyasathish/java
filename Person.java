class Person{
String name;
int age;

public void introduce(String name,  int age)
{
  System.out.println(name);
  System.out.println(age);
  System.out.println("Welcome");
  
}

public static void main(String args[])
{
Person p=new Person();
p.introduce("Priya",17);
}
}

