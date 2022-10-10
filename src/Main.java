public class Main {
    public static void main(String[] args) {

        int clientsmoney = 300;
        int addmoney = 1570;
        int newmoney;
        int bonus = 0;
        if (addmoney >= 1000) {
            bonus = addmoney / 100;
        }
        newmoney = clientsmoney + addmoney + bonus;
        System.out.println(" Счёт клиента " + clientsmoney);
        System.out.println(" Сумма пополнения " + addmoney);
        System.out.println(" Начислено бонусов " + bonus);
        System.out.println(" Итоговая сумма " + newmoney);


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}