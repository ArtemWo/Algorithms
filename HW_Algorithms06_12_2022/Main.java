package HW_Algorithms.HW_Algorithms06_12_2022;

public class Main {
    public static void main(String[] args) {/*
todo First level: 1. Реализовать динамический массив, который при добавлении элементов
     увеличивает свой размера в 2 раза, если места для добавления элемента оказывается недостаточно.
 У динамического массива должны быть следующие методы:
 --- add(int value): void | Добавляет элемент в конец
 --- addAt(int index, int value) : void | Добавляет элемент по индексу со сдвигом всех элементов начиная с текущего и до последнего на 1
 --- get(int index): int | Возвращает элемент по индексу
 --- remove(): void | Удаляет последний элемент
 --- removeAt(int index): void | Удаляет элемент по индексу
 --- set(int index, int value): void | Меняет значение элемента по индексу на указанное
 --- contains(int value): boolean | Проверяет, присутствует ли указанный элемент в списке
 --- size(): int | Возвращает размер списка
 --- clear(): void | Удаляет все элементы из списка, размер списка становится изначальным
 --- shrinkSize(): void | Уменьшает массив до размера, равного количеству элементов в нем
*/

        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.print();

        System.out.println("================add=======================");
        dynamicArray.add(1);        dynamicArray.add(88);
        dynamicArray.add(77);      dynamicArray.add(6);
        dynamicArray.add(2);        dynamicArray.add(54);
        dynamicArray.add(4);        dynamicArray.add(23);
        dynamicArray.add(29);      dynamicArray.add(99);
        dynamicArray.add(100);     dynamicArray.add(230);
        dynamicArray.add(210);
        dynamicArray.sort();
        System.out.println();
        System.out.println("=================addAt=====================");
        dynamicArray.addAt(13, 44);
        dynamicArray.print();
        System.out.println();
        System.out.println("=================removeAt=====================");
        dynamicArray.removeAt(3);
        dynamicArray.print();
        System.out.println();
        System.out.println("==================shrinkSize====================");
        dynamicArray.shrinkSize();
        dynamicArray.print();
        System.out.println();
        System.out.println("===================clear===================");
        dynamicArray.clear();
        dynamicArray.print();
        System.out.println();

    }
}
