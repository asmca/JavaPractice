package jdk7notes.chapter5;

/**
 * file in jdk7notes.chapter5
 * Created by suse on 14-12-9.
 */
public class CashCard {

    private String number   ;
    private int balance;
    private int bonus;

    public CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    void store(int money)
    {
        if(money>0){
            this.balance+=money;
            if(money>=1000){
                this.bonus++;
            }
        }
        else{
            System.out.println("充值是负值，无效。");
        }

    }

    void charge(int money){
        if (money>0){
            if (money<=this.balance){
                this.balance-=money;
            }else{
                System.out.println("钱不够啦!");
            }
        }
    }

    public String getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public int getBonus() {
        return bonus;
    }

    int exchange(int bonus){
        if(bonus>0){
            this.bonus-=bonus;
        }

        return this.bonus;
    }


}
