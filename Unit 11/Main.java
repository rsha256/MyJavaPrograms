import java.util.Scanner;

public class Main 
{
    final static Scanner scn = new Scanner(System.in);
    //above i get user input with the Scanner package, which i use throughout the class from the name of 'scn'. I used static so it'd be a class variable (accesible throughout the class as 1 copy)
    
    public static void main(String[] args) 
    {

        System.out.println( "Enter the number of employees: " );
        int numOfEmployeesToCreate = scn.nextInt();
        //above i get user input for the number of employees stored to the var numOfEmployeesToCreate
        
        Employee[] employees = new Employee[numOfEmployeesToCreate];
        //above i created an array of Employee objects with enough storage for 'numOfEmployeesToCreate' employees
        
        //create the employees 'numOfEmployees' times
        for (int i = 0; i < numOfEmployeesToCreate; i++) 
        {
            System.out.println("Making employee " + (i+1) + " of " + numOfEmployeesToCreate + "\n");
            employees[i] = createEmployee();
            //above i created a reference to each createEmployee object in the array
            System.out.println();
        }
        
        //display the employees info
        for(int i = 0; i < numOfEmployeesToCreate; i++) 
        {
            System.out.println("Showing employee " + (i+1) + " of " + numOfEmployeesToCreate + "\n");
            System.out.println(employees[i]);
            System.out.println();
        }
        
        scn.close();
    }
    
    public static Employee createEmployee() 
    {
        System.out.println("\n= New Employee =");
        System.out.print("Enter employee number: "); 
        int num = scn.nextInt();
        System.out.println("= Name =");
        Name name = createName();
        System.out.println("= Address =");
        Address address = createAddress();
        System.out.println("= Hire Date =");
        Date date = createDate();
        return new Employee(num, name, address, date);
    }
    //above i passed the Employee object to the createEmployee class method above
    
    public static Name createName() 
    {
        System.out.print("Enter first name: ");
        String f = scn.next();
        System.out.print("Enter last name: ");
        String l = scn.next();
        return new Name(f, l);
    }
    //above i passed the Name object to the createName class method above which gets user for the Strings of first and last name (represented by f and l)
    
    public static Address createAddress() 
    {
        System.out.print("Enter Street: ");
        String street = scn.next();
        System.out.print("Enter City: ");
        String city = scn.next();
        System.out.print("Enter State (two letters): ");
        String state = scn.next();
        System.out.print("Enter Zip: ");
        int zip = scn.nextInt();
        return new Address(street, city, state, zip);
    }
    //above i created the createAddress class method which gets user input for the street, city, state, and zip
    
    public static Date createDate() 
    {
        System.out.print("Enter month (1-12): ");
        int m = scn.nextInt();
        System.out.print("Enter day: ");
        int d = scn.nextInt();
        System.out.print("Enter year: ");
        int y = scn.nextInt();
        return new Date(m, d, y);
    }
    //above i created a class method that when invoked passes an the object Date to the method returning a new 'Date' with the user-inputted month, day & year
}