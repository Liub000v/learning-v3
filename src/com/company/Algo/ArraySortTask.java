//package com.company.Algo;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
///**
// * В консоль вводится целое число т - количество элементов массива
// * Затем последовательно вводятся n целочисленнных элементов массива
// * Необходимо отсортировать введенных n элементов по возрастанию и вывести в консоль в качетве результата
// * <p>
// * Пример:
// * <p>
// * Входные данные
// * -----------------------------------------
// * 5
// * 4
// * 3
// * 4
// * 7
// * 1
// * <p>
// * ------------------------------------------
// * <p>
// * <p>
// * Выходные данные
// * __________________________________________
// * 1, 3, 4, 4, 7
// * __________________________________________
// */
//public class ArraySortTask {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите общее количество цифр: ");
//        int num = in.nextInt();
//        int[] numbers = new int[num];
//        int[] numbers1 = new int[num];
//        for (int i = 0; i < num; i++) {
//            System.out.print("Введите " + (i + 1) + " цифру: ");
//            numbers[i] = in.nextInt();
//        }
//        in.close();
//        for (int i = 0; i < num; i++) { //В двух циклах сравниванем каждый элемент массива с каждым. Считаем скольких переменных она больше и скольким равна.
//            int numBefore = 0;
//            int numEqually = -1;
//            for (int j = 0; j < num; j++) {
//                if (numbers[i] > numbers[j]) {
//                    numBefore++;
//                } else {
//                    if (numbers[i] == numbers[j]) {
//                        numEqually++;
//                    }
//                }
//            }
//            if (numEqually > 0) {
//                for (int m = 0; m <= numEqually; m++) {
//                    int index = numBefore + m;
//                    numbers1[index] = numbers[i];
//                }
//            } else {
//                numbers1[numBefore] = numbers[i];
//            }
//        }
//
//        for (int i = 0; i < num; i++) {
//            System.out.print(numbers1[i] + " ");
//        }
//    }
//
//}
//
