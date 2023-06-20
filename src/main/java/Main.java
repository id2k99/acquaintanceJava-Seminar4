//Организовать ввод и хранение данных пользователей. ФИО возраст и пол
//        вывод в формате Фамилия И.О. возраст пол
//        добавить возможность выхода или вывода списка отсортированного по возрасту
//        *реализовать сортировку по возрасту с использованием индексов
//        *реализовать сортировку по возрасту и полу с использованием индексов

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> id = new ArrayList<>();
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> patronymic = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        String input = "";
        Scanner in = new Scanner(System.in);
        Integer count = 0;
        System.out.println("Введите Фамилию Имя Отчество возраст и пол через пробел");
        System.out.println("Для выхода введите quit и нажмите Enter");
        System.out.println("Для сортировки списка по возрасту введите sort и нажмите Enter");

        while (!input.equals("quit") | !input.equals("sort")){    // вот тут не могу понять почему не срабатывает
            input = in.nextLine();                                // условие quit или sort для выхода из цикла.
            if (!input.equals("quit") | !input.equals("sort")){   // когда по остаётся что-то одно, quit или sort
                String [] tmp = input.split(" ");           // то условие срабатывает
                id.add(count);
                surname.add(tmp[0]);
                name.add(tmp[1]);
                patronymic.add(tmp[2]);
                age.add(Integer.parseInt(tmp[3]));
                gender.add(tmp[4]);
                count = count +1;
            }
        }
        if (input.equals("quit")){
            for (int i = 0; i < id.size(); i++) {
                System.out.println(
                        id.get(i)+" "
                                +surname.get(i)+" "
                                +name.get(i).charAt(0)+". "
                                +patronymic.get(i).charAt(0)+". "
                                +gender.get(i)+" "
                                + age.get(i)
                );
            }
        }

        if (input.equals("sort")){                                  //отсортировал Список age, а как его связать
            System.out.println("Сортировка");                       //с другими спсиками понять не могу.
            Collections.sort(age);
            for (int i = 0; i < id.size(); i++) {
                System.out.println(
                        id.get(i)+" "
                                +surname.get(i)+" "
                                +name.get(i).charAt(0)+". "
                                +patronymic.get(i).charAt(0)+". "
                                +gender.get(i)+" "
                                + age.get(i)
                );
            }
        }

    }

}
