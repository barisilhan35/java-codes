class City
{
   private String name;

   City(String name)
   {
      this.name = name;
   }

   String getName()
   {
      return name;
   }

   void setName(String name)
   {
      this.name = name;
   }
}

class CloneDemo
{
   public static void main(String[] args)
   {
      double[] temps = { 98.6, 32.0, 100.0, 212.0, 53.5 };
      for (int i = 0; i < temps.length; i++)
         System.out.print(temps[i] + " ");
      System.out.println();
      double[] temps2 = temps.clone();
      for (int i = 0; i < temps2.length; i++)
         System.out.print(temps2[i] + " ");
      System.out.println();

      System.out.println();

      City[] cities = { new City("Denver"), new City("Chicago") }; 
      for (int i = 0; i < cities.length; i++)
         System.out.print(cities[i].getName() + " ");
      System.out.println();
      City[] cities2 = cities.clone();
      for (int i = 0; i < cities2.length; i++)
         System.out.print(cities2[i].getName() + " ");
      System.out.println();

      cities[0].setName("Dallas");
      for (int i = 0; i < cities2.length; i++)
         System.out.print(cities2[i].getName() + " ");
      System.out.println();
   }
}