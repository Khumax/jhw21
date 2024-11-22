//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
        int amount = 14_999; // цена билета
        boolean ticket = true;

        int percent;
        if (ticket) {
            percent = 5; //из расчета 20 руб = 1 миля, соответственно бонус 5%
        } else {
            percent = 0;
        }

        int bonus = amount * percent / 100; //считаем бонусы

        System.out.println( "Ваш бонус состовляет: " + bonus+" миль" );
    }
}