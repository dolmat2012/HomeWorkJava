//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
// Критерии фильтрации можно хранить в Map.
//Например:
//“Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
//Работу сдать как обычно ссылкой на гит репозиторий
//Частые ошибки:
//1. Заставляете пользователя вводить все существующие критерии фильтрации
//2. Невозможно использовать более одного критерия фильтрации одновременно
//3. При выборке выводятся ноутбуки, которые удовлетворяют только одному фильтру, а не всем введенным пользователем
//4. Работа выполнена только для каких то конкретных ноутбуков, и если поменять характеристики ноутбуков или добавить еще ноутбук,
// то программа начинает работать некорректно.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Notebook 1", 8, "Windows10", 80000, "HP"));
        set.add(new Notebook("Notebook 2", 16, "Windows10", 85000, "Asus"));
        set.add(new Notebook("Notebook 3", 32, "linux", 85000, "Lenovo"));
        set.add(new Notebook("Notebook 4", 64, "linux", 90000, "Lenovo"));

        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();

    }
}