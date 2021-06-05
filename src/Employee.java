public class Employee {
    String name;
    double baseSalary;
    int workHours;
    int hireYear;


    Employee(String name, double baseSalary, int workHours, int hireYear) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax() {
        if (this.baseSalary < 1000) {
            return 0;
        } else {
            return baseSalary * 0.03;
        }
    }

    double bonus() {
        return baseSalary*0.075;
    }

    double raiseSalary() {
        if (2021 - workHours < 10) {
            return baseSalary * 0.05;
        } else if (2021 - workHours >= 10 && 2021 - workHours < 20) {
            return baseSalary * 0.1;
        } else {
            return baseSalary * 0.15;
        }
    }
    void printInfo(){
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.baseSalary);
        System.out.println("Çalışma saati: "+this.workHours);
        System.out.println("Başlangıç yılı: "+this.hireYear);
        System.out.println("Vergi: "+this.tax());
        System.out.println("Bonus: "+this.bonus());
        System.out.println("Maaş artışı: "+raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş: "+(baseSalary-tax()+bonus()));
        System.out.println("Toplam maaş: "+(baseSalary+raiseSalary()));
    }
}
