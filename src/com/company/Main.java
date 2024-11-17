package com.company;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задание 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задание 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(paper);

        //Задание 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        //Задание 5
        var frog  = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задание 6
        var weight1 = 78.2;
        var weight2 = 82.7;

        var sum = weight1 + weight2;
        System.out.println(sum);
        var different = weight2 - weight1;
        System.out.println(different);

        //Задание 7
        var reminder = weight2%weight1;
        System.out.println(reminder);

        //Задание 8
        var allTime = 640;
        var dayTime = 8;

        var employee = allTime/dayTime;

        System.out.println("Всего работников компании " + employee + " человек");

        employee = employee + 94;
        allTime = employee * 8;

        System.out.println("Если в компании работает " + employee + " человек, то всего " + allTime + " часов работы может быть поделено между сотрудниками");

    }
}
