import java.util.ArrayList;

public class Tester extends Employee{
    Tester(String imie, String nazwisko, String adres, String email, String pesel, int employeeYear){
        super(imie, nazwisko, adres, email, pesel, employeeYear);
    }

    public ArrayList<String> tests = new ArrayList<>();

    public void addTestType(String test){
        this.tests.add(test);
    }
}
