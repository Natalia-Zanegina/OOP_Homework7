package observer;

import java.util.EnumSet;

public interface Observer {

    void receiveOffer(String companyName, Vacancy vacancy, double salary);

    EnumSet<Vacancy> getSuitableVacancies();
}
