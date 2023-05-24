public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var papper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var papper = 763789;
        dog = dog + 2;
        cat = cat + 2;
        papper = papper + 2;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);

    }

    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var papper = 763789;
        dog = dog - 3.5;
        cat = cat + 1.6;
        papper = papper + 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);
    }

    public static void task4 () {
        System.out.println("Задача 4");
        var frend = 19;
        System.out.println(frend);
        frend = frend + 2;
        System.out.println(frend);
        frend = frend / 7;
        System.out.println(frend);
    }

    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var box1 = 78.2;
        var box2 = 82.7;
        var veight = box1 + box2;
        System.out.println(veight);
        var difference = box2 - box1;
        System.out.println(difference);

    }
    public static void task7 () {
        System.out.println("Задание 7");
        var box1 = 78.2;
        var box2 = 82.7;
        var minus = box2 - box1;
        System.out.println(minus);
        var ostatok = box2 % box1;
        System.out.println(ostatok);

    }
    public static void task8 () {
        System.out.println("задание 8");
        var time = 640;
        var work = 8;
        var worker = time / work;
        System.out.println("Всего работников в компании — " + worker + " человек");
        worker = worker + 94;
        time = worker * 8;
        System.out.println("Если в компании работает " + worker + " человек, то всего " + time + " часов работы может быть поделено между сотрудниками");

    }

}