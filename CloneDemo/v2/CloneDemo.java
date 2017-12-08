class Data implements Cloneable
{
   int x;

   @Override
   public Object clone() throws CloneNotSupportedException
   {
      return super.clone();
   }
}

class CloneDemo
{
   public static void main(String[] args) throws CloneNotSupportedException
   {
      Data data = new Data();
      data.x = 5;
      System.out.println("data.x = " + data.x);
      Data data2 = (Data) data.clone();      
      System.out.println("data2.x = " + data2.x);
   }
}