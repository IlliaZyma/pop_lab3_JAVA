package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        int storageSize = scanner.nextInt();
        int itemNumbers = scanner.nextInt();
        main.starter(storageSize, itemNumbers);
    }

    private void starter(int storageSize, int itemNumbers) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager(storageSize);
        System.out.println("Enter num of consumer");
        int num_of_consumers = scanner.nextInt();
        Consumer[] consumers = new Consumer[num_of_consumers];
        for (int i = 0; i<num_of_consumers; i++) {
            consumers[i] = new Consumer(itemNumbers, manager);
        }

        System.out.println("Enter num of producers");
        int num_of_producers = scanner.nextInt();
        Producer[] producers = new Producer[num_of_producers];
        for (int i = 0; i<num_of_producers; i++) {
            producers[i] = new Producer(itemNumbers, manager);
        }

    }
}