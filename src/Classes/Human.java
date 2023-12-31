package Classes;

import Classes.Account.BankCard;
import java.util.ArrayList;
import java.util.HashSet;

public class Human {
    private final String name;
    private final Account account;
    private final String password;
    private final ArrayList<BankCard> bankCards;

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<BankCard> getBankCards() {
        return bankCards;
    }
    public void addCard(Account.BankCard bankCard) {
        bankCards.add(bankCard);
    }
    public boolean authenticate(String enteredPassword) {
        return password.equals(enteredPassword);
    }
    public Human(String name, String password, Account account) {
        this.bankCards = new ArrayList<>();
        this.name = name;
        this.password = password;
        this.account = account;
    }

}
