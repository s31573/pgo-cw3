import java.util.ArrayList;

public class Developer extends  Employee{

    public ArrayList<Technology> technologies = new ArrayList<>();

    Developer(String imie, String nazwisko, String adres, String email, String pesel, int employeeYear){
        super(imie, nazwisko, adres, email, pesel, employeeYear);
    }

    public void addTechnology(Technology technology){
        this.technologies.add(technology);
    }

}
