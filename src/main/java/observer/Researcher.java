package observer;

import java.util.EnumSet;
import java.util.Random;

public class Researcher implements Observer {

    private static Random random = new Random();
    private  String name;
    private double minSalary;
    final EnumSet<Vacancy> suitableVacancies = EnumSet.of(Vacancy.programmer, Vacancy.analyst);
    public EnumSet<Vacancy> getSuitableVacancies() {
        return suitableVacancies;
    }

    public Researcher(String name) {
        this.name = name;
        minSalary = random.nextDouble(40000, 100000);
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy, double salary) {
        if (minSalary <= salary){
            System.out.printf("Исследователь %s (%f) >>> Мне нужна эта работа! [%s - %s - %f]\n",
                    name, minSalary, companyName, vacancy, salary);
            minSalary = salary;
        }
        else {
            System.out.printf("Исследователь %s >>> Я найду работу получше (%f)! [%s - %s - %f]\n",
                    name, minSalary, companyName, vacancy, salary);
        }
    }
}
