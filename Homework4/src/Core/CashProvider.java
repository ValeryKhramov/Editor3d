package Core;

import Interfaces.ICarrierRepo;
import Interfaces.ICashRepo;
import Models.BankAccount;
import Models.Carrier;
import Models.Ticket;
import Models.User;
import Services.CarrierRepository;
import Services.CashRepository;

import java.util.ArrayList;

/**
 * Класс - провайдер для взаимодействия с банком и базой перевозчиков
 */
public class CashProvider {
    private long cardNumber;
    private boolean isAuthorized;
    private ICashRepo cashRepository;
    private ICarrierRepo carrierRepository;





    /**
     * Конструктор класса
     */
    public CashProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
    }



    // подсказка  Carrier carrier = carrierRepository.read(1);
    // подсказка  return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
    /**
     * Метод покупки билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     * @throws RuntimeException
     */
    public boolean buy(Ticket ticket) {
        Carrier carrier = carrierRepository.read(1);
        return cashRepository.transaction(ticket.getPrice(), cardNumber,carrier.getCardNumber());
    }



    /**
     * Метод авторизации клиента. Здесь должно быть реализовано обращение к банку для подтверждения личности клиента.
     *
     * @param client
     */
    public void authorization(User client) {
        for (BankAccount bankAccount: CashRepository.getCashRepository().getClients()) {
            if (client.getCardNumber() == bankAccount.getCard()) {
                System.out.println("Личность клиента подтверждена!");
            }else {
                System.out.println("Личность клиента не подтверждена!");
            }
        }
    }
}
