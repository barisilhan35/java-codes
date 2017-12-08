public class Employee extends Object
{
   private String name;

   public Employee(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
   }

   public static void main(String[] args)
   {
      Employee emp = new Employee("John Doe");
      System.out.println(emp.getName());
   }
}