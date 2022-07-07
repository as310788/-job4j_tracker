package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает сервис банковских переводов.
 * @version 1.0
 */
public class BankService {
    /**
     * Это поле содержит всех пользователей системы с привязанными к ним счетами.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Этот метод должен добавить пользователя в систему
     * Чтобы добавить пользователя в систему нужно использовать метод Map.put.
     * Этот метод принимает один параметр: пользователя, т.е. объект класса User.
     * По умолчанию к этому user нужно добавить пустой список - new ArrayList<Account>().
     * В методе должна быть проверка, что такого пользователя еще нет в системе.
     * Если он есть, то нового добавлять не надо.
     * @param user пользователь, объект класса User.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод должен добавить новый счет к пользователю.
     * Первоначально пользователя нужно найти по паспорту.
     * Для этого нужно использовать метод findByPassport.
     * В этом методе должна быть проверка, что такого счета у пользователя еще нет.
     * @param passport номер паспорта пользователя.
     * @param account счет пользователя.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта.
     * То есть нужно использовать перебор всех элементов через цикл for-earch и метод Map.keySet.
     * Если ничего не найдено - метод должен вернуть null.
     * @param passport номер паспорта пользователя.
     * @return метод должен вернуть null или пользователя.
     * переделали методы поиска по паспорту вместо циклов на Stream API.
     */

    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод ищет счет пользователя по реквизитам.
     * Сначала нужно найти пользователя по паспорту с помощью метода findByPassport.
     * Потом получить список счетов этого пользователя и в нем найти нужный счет.
     * Поскольку метод findByPassport может вернуть null, то прежде чем получать список аккаунтов,
     * требуется проверить что метод findByPassport вернул отличное от null значение.
     * @param passport номер паспорта пользователя.
     * @param requisite реквизиты счета пользователя.
     * @return метод должен вернуть null или нужные реквизиты счета.
     * Переделали методы поиска по паспорту и реквизитам на использование вместо циклов Stream API.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account a = null;
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод предназначен для перечисления денег с одного счёта на другой счёт.
     * Если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят),
     * то метод должен вернуть false.
     * @param srcPassport паспорт отправителя.
     * @param srcRequisite реквизиты отправителя.
     * @param destPassport паспорт получателя.
     * @param destRequisite реквизиты получателя.
     * @param amount сумма средств на счете отправителя srcAccount
     * @return если счёт не найден или не хватает денег на счёте отправителя srcAccount
     *  метод должен вернуть false, если все в порядке то true.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}