class Book
{
String title;
String author;
public Book()
{
title="It's ends with us";
author="rabindranath tagor";
System.out.println("The title is" +title+"and the author name is" +author);
}
public Book(String title,String author)
{
System.out.println("The title is" +title+"and the author name is" +author);
}
public static void main(String[] args)
{
Book b1=new Book();
Book b2=new Book("Simple","priya");
}
}