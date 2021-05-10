package staff;

public abstract class Employee {
    private String name;
    private String nino;
    private double salary;

    public Employee(String name, String nino, double salary) {
        this.name = name;
        this.nino = nino;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNino() {
        return nino;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setNino(String nino) {
        this.nino = nino;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double increment) {
        if (increment >= 0) {
            this.salary += increment;
        }
    }

    public double payBonus(){
        return this.salary * 0.01 ;
    }

}
