class Employee implements Cloneable
{
   private String name;
   private int age;
   private Address address;

   Employee(String name, int age, Address address)
   {
      this.name = name;
      this.age = age;
      this.address = address;
   }

   @Override
   public Object clone() throws CloneNotSupportedException
   {
      return super.clone();
   }

   Address getAddress()
   {
      return address;
   }

   String getName()
   {
      return name;
   }

   int getAge()
   {
      return age;
   }
}

class Address
{
   private String city;

   Address(String city)
   {
      this.city = city;
   }

   String getCity()
   {
      return city;
   }

   void setCity(String city)
   {
      this.city = city;
   }
}

class CloneDemo
{
   public static void main(String[] args) throws CloneNotSupportedException
   {
      Employee e = new Employee("John Doe", 49, new Address("Denver"));
      System.out.println(e.getName() + ": " + e.getAge() + ": " + 
                         e.getAddress().getCity());
      Employee e2 = (Employee) e.clone();
      System.out.println(e2.getName() + ": " + e2.getAge() + ": " + 
                         e2.getAddress().getCity());
      e.getAddress().setCity("Chicago");
      System.out.println(e.getName() + ": " + e.getAge() + ": " + 
                         e.getAddress().getCity());
      System.out.println(e2.getName() + ": " + e2.getAge() + ": " + 
                         e2.getAddress().getCity());
   }
}