package observer;

import java.util.EnumSet;
import java.util.Random;

public class Master implements Observer {

    private static Random random = new Random();
    private  String name;
    private double minSalary;

    final EnumSet<Vacancy> suitableVacancies = EnumSet.of(Vacancy.programmer, Vacancy.analyst, Vacancy.tester);

    public EnumSet<Vacancy> getSuitableVacancies() {
        return suitableVacancies;
    }
    public Master(String name) {
        this.name = name;
        minSalary = random.nextDouble(60000, 80000);
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy, double salary, Publisher jobAgency) {
        if (minSalary <= salary){
            System.out.printf("Рабочий %s (%f) >>> Мне нужна эта работа! [%s - %s - %f]\n",
                    name, minSalary, companyName, vacancy, salary);
            //minSalary = salary;
            jobAgency.removeObserver(this);
        }
        else {
            System.out.printf("Рабочий %s >>> Я найду работу получше (%f)! [%s - %s - %f]\n",
                    name, minSalary, companyName, vacancy, salary);
        }
    }
}
