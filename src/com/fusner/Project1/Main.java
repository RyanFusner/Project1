package com.fusner.Project1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    static ArrayList<String> list = new ArrayList<String>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        displayMenu();
        int choice = scanner.nextInt();

        while (choice != 0)
        {
            switch (choice)
            {
                case 1: add();
                        break;
                case 2: remove();
                        break;
                case 3: update();
                        break;
                case 4: displayList();
                        break;
            }
            displayMenu();
            choice = scanner.nextInt();
        }
    }

    static void add()
    {
        System.out.println("\nEnter an item:");
        list.add(scanner.next());
        displayList();
    }

    static void remove()
    {
        System.out.println("\nWhich item: ");
        list.remove(scanner.nextInt()-1);
        displayList();
    }

    static void update()
    {
        System.out.println("\nWhich item: ");
        int i = scanner.nextInt()-1;
        System.out.println("\nEnter new description: ");
        list.set(i, scanner.next());
        displayList();
    }

    static void displayList()
    {
        System.out.println("\nTo-Do:");
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println("(" + (i+1) + ") " + list.get(i));
        }
        System.out.println();
    }

    static void displayMenu()
    {
        System.out.println("(1) Add a task.\n(2) Remove a task.\n(3) Update a task.\n(4) List all tasks.\n(0) Exit.\nPlease choose an option:");
    }
}
