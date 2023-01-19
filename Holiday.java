class Holiday
{
  String name;
  int day;
  String month;
  public Holiday(String name,int day,String month)
  {
  this.name=name;
  this.day=day;
  this.month=month;
  System.out.println("Holiday on:"+name+" Day:"+day+" month:"+month);
  }
 public Holiday()
    {
      System.out.println(" No arguments");
     }
 public static void main(String[] args)
   {
      new Holiday("independenceday",15,"August");
      new Holiday();
   }
}

 