public class Book1
{
  String name;
  String author;
  String isdn;
 public void setName(String name)
   {
    this.name=name;
   }
public String getName()
   {
     return name;
   }
 public void setAuthor(String author)
   {
    this.author=author;
   }
 public String getAuthor()
  {
   return author;
  }
 public void setIsdn(String isdn)
  {
    this.isdn=isdn;
  }
 public String getIsdn()
  {
    return isdn;
  }
public static void main(String args[])
 {
    Book1 b = new Book1();
   b.setName("java");
   b.setAuthor("Rama");
   b.setIsdn("123-456-536");
   System.out.println("Name:"+b.getName());
   System.out.println("Author Name:"+b.getAuthor());
   System.out.println("ISDN number:"+b.getIsdn());
  }
}