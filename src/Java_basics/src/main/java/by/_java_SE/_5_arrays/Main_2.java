package by._java_SE._5_arrays;

public class Main_2 {
    public static void main(String[] args) {

        String birthdays [] = new String[10];
        birthdays[0] = "Лена Елисеева, 12 марта";
        birthdays[1] = "Коля Романов, 18 мая";
        birthdays[7] = "Олеся Остапенко, 3 января";

        String olesyaBirthday = birthdays[7];
        System.out.println(olesyaBirthday);

        int birthdaysLength = birthdays.length;
        System.out.println(birthdaysLength);

        birthdays[0] = "Лена Елисеева, 12 марта";
        birthdays[1] = "Коля Романов, 18 мая";
        birthdays[2] = "Вика Игнатова, 12 июля";
        birthdays[3] = "Денис Козлов, 7 сентября";
        birthdays[4] = "Максим Масленников, 9 ноября";
        birthdays[5] = "Роман Баранов, 14 августа";
        birthdays[6] = "Валерия Пяткина, 1 апреля";
        birthdays[7] = "Олеся Остапенко, 3 января";
        birthdays[8] = "Костя Гурко, 19 октября";
        birthdays[9] = "Сережа Наумов, 3 мая";

        for (int i = 0; i < birthdays.length; i++) {
            System.out.println(birthdays[i]);
        }
        String last = birthdays[birthdays.length-1];
        System.out.println(last);
    }
}
