import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //Задание 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());

        //Задание 3
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullName.replace('ё', 'е'));

        //Задание 4*
        fullName = "Ivanov Ivan Ivanovich";
        int index1 = fullName.indexOf(' ');
        int index2 = fullName.indexOf(' ', index1 + 1);
        lastName = fullName.substring(0, index1);
        firstName = fullName.substring(index1 + 1, index2);
        middleName = fullName.substring(index2 + 1, fullName.length());
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Отчество сотрудника - " + middleName);

        //Задание 5*
        fullName = "ivanov ivan ivanovich";
        index1 = fullName.indexOf(' ');
        index2 = fullName.indexOf(' ', index1 + 1);
        fullName = Character.toUpperCase(fullName.charAt(0)) + fullName.substring(1, index1 + 1)
                + Character.toUpperCase(fullName.charAt(index1 + 1)) + fullName.substring(index1 + 2, index2 + 1)
                + Character.toUpperCase(fullName.charAt(index2 + 1)) + fullName.substring(index2 + 2, fullName.length());
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв - " + fullName);

        //Задание 6*
        String str1 = "135";
        String str2 = "246";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            str.append(str1.charAt(i));
            str.append(str2.charAt(i));
        }
        System.out.println("Данные строки - " + str);

        //Задание 7*
        String str3 = "aabccddefgghiijjkk";
        StringBuilder strB = new StringBuilder();
        strB.append(str3.charAt(0));
        for (int i = 0; i < str3.length() - 1; i++) {
            if (str3.charAt(i) != str3.charAt(i + 1)) {
                strB.append(str3.charAt(i + 1));
            }
        }
        System.out.println(strB);

    }
}