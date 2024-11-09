package Bu;
class Employee{ Employee(String n, double s){ name = n; salary = s; }

public void setSalary(double s){
salary = s;
}

public String getName(){
return name;
}

public double getSalary(){
return salary;
}

private String name;
private double salary;
}

class Manager extends Employee{ Manager(String s, double d, double b){ super(s,d); bonus = b; }

public void setBonus(double b){
bonus = b;
}

public double getBonus(){
return bonus;
}

public double getSalary(){
double basesalary = super.getSalary();
return basesalary + bonus;
}

private double bonus;
}

class appBu{

public static void main(String[]args){
Employee e = new Employee("Programmer", 20000);
Manager m = new Manager("SBI", 20000, 5000);	
e = new Manager("SBI", 20000, 5000);

System.out.println("Bank Name: " + e.getName());
System.out.println("Employee Salary: " + e.getSalary());
System.out.println("Manager Salary: " + (m.getBonus() + e.getSalary()));


}
}