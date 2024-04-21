import java.util.Date;

public class Employee {

    public String imie, nazwisko, adres, email, pesel;
    public int employeeYear;
    public int salary = 3000;
    Employee(String imie, String nazwisko, String adres, String email, String pesel, int employeeYear){
        this.imie = imie;
        this.nazwisko=nazwisko;
        this.adres = adres;
        this.email = email;
        this.pesel = pesel;
        this.employeeYear = employeeYear;

    }

    public int calculateSalary(){
        int temp_salary = salary;
        int year = 2024;
        int month = 4;
        int years =year - employeeYear;
        System.out.println(years);
        for(int i = 0; i<years; i++){
            temp_salary+=1000;
        }

        if(this instanceof Developer){
            Developer d = (Developer) this;
            for(Technology tech : d.technologies){
                temp_salary += tech.bonus;
            }
        }
        else if(this instanceof Tester){
            Tester t = (Tester) this;
            temp_salary += (300 * t.tests.size());
        }
        else if(this instanceof Manager){
            Manager m = (Manager) this;
            for(Goal g : m.goals){
                if(g.year == year && g.month == month){
                    temp_salary += g.bonus;
                }
            }
        }

        return  temp_salary;
    }
}
