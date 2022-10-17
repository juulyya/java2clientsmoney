public class Main {
    public static void main(String[] args) {
        int clientsMoney = 300;
        int addMoney = 1570;
        int newMoney;
        int bonus = 0;
        if (addMoney >= 1000) {
            bonus = addMoney / 100;
        }
        newMoney = clientsMoney + addMoney + bonus;
        System.out.println(" Счёт клиента " + clientsMoney);
        System.out.println(" Сумма пополнения " + addMoney);
        System.out.println(" Начислено бонусов " + bonus);
        System.out.println(" Итоговая сумма " + newMoney);

    }
}