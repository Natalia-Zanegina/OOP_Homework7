package observer;

public interface Publisher {

    /**
     * Регистрация нового наблюдателя
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * Убрать наблюдателя из списка
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * Компания отправляет новую вакансию
     * @param companyName
     * @param salary
     */
    void sendOffer(String companyName, Vacancy vacancy, double salary);
}
