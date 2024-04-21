import java.util.ArrayList;

public class Manager extends Employee{

    Manager(String imie, String nazwisko, String adres, String email, String pesel, int employeeYear){
        super(imie, nazwisko, adres, email, pesel, employeeYear);
    }

    public ArrayList<Goal> goals = new ArrayList<>();

     public void addGoals(Goal g){
        this.goals.add(g);
    }
}
