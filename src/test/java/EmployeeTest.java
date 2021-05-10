import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;
import staff.techstaff.DatabaseAdmin;
import staff.techstaff.Developer;

public class EmployeeTest {

    Manager manager;
    Developer developer;
    DatabaseAdmin databaseAdmin;
    Director director;


    @Before
    public void setUp() {
        manager = new Manager("Dani", "JN010101", 99999.99, "Risk Management");
        developer = new Developer("Alex", "JN010101", 99999.99);
        databaseAdmin = new DatabaseAdmin("Pete", "JN010101", 99999.99);
        director = new Director("Zsolt", "JN010101", 99999.99, "Risk Management", 100000.00 );
    }

    @Test
    public void canRaiseManagerSalary(){
        manager.raiseSalary(1000.00);
        assertEquals(100999.99, manager.getSalary(), 0.001);
    }
    @Test
    public void canGetManagerPayBonus(){
        assertEquals(999.99, manager.payBonus(), 0.01);
    }

    @Test
    public void canRaiseDeveloperSalary(){
        developer.raiseSalary(1000.00);
        assertEquals(100999.99, developer.getSalary(), 0.001);
    }
    @Test
    public void canGetDeveloperPayBonus(){
        assertEquals(999.99, developer.payBonus(), 0.01);
    }

    @Test
    public void canRaiseDatabaseAdminSalary(){
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(100999.99, databaseAdmin.getSalary(), 0.001);
    }
    @Test
    public void canGetDatabaseAdminPayBonus(){
        assertEquals(999.99, databaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void canGetDirectorBudget(){
        assertEquals(100000, director.getBudget(), 0.001);
    }
}
