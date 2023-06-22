package observer;

public class Program {
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Master ivanov = new Master("Ivanov");
        Student sidorov = new Student("Sidorov");
        Researcher belov = new Researcher("Belov");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(belov);

        for (int i = 0; i < 5; i++) {
            geekBrains.needEmployee(Vacancy.programmer);
            google.needEmployee(Vacancy.analyst);
            yandex.needEmployee(Vacancy.tester);
            yandex.needEmployee(Vacancy.cleaner);
        }

    }
}
