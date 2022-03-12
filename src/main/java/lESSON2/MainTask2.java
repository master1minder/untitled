package lESSON2;

import java.util.Scanner;

//class Cat {
//    //4.1
//    private String name;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    //4.2
//    private static int catsCount = 0;
//
//    public static void addNewCat() {
//        catsCount += 1;
//    }
//
//    //4.3
//    public static void setCatsCount(int catsCount) {
//        Cat.catsCount = catsCount;
//    }
//
//    //4.4
//    private String fullName;
//
//    public void setName(String firstName, String lastName) {
//        String fullName = firstName + lastName;
//        this.fullName = fullName;
//    }
//
//
//}

public class MainTask2 {
    static Scanner scan = new Scanner(System.in);

//    public static void main(String[] args) {
//        //level 4
//        //4.5
///*        Cat cat1 = new Cat();
//        Cat.count++;
//        Cat cat2 = new Cat();
//        Cat.count++;
//        System.out.println("Cats count is " + Cat.count);*/
//
////        4.3.1
//        int i = 1;
//        while (i < 11) {
//            System.out.println(i);
//            i++;
//        }
////      4.3.2
//        i = 10;
//        while (i > 0) {
//            System.out.println(i);
//            i++;
//        }
////      4.3.3
//        int n = scan.nextInt();
//        String str = scan.nextLine();
//
//        for (int j = 0; j < n; j++) {
//            System.out.println(str);
//        }
//
//        //4.3.4
//        int i = 0;
//        while (i++ < 10) {
//            int j = 0;
//            while (j++ < 10)
//                System.out.print("S");
//            System.out.println();
//        }
//
//        //4.3.5
//        int i = 1, n = 1;
//        while (i <= 10) {
//            System.out.print(i + " ");
//            while (n <= 9) {
//                n++;
//                System.out.print(i * n + " ");
//            }
//            i++;
//            n = 1;
//            System.out.println("");
//        }
//
//
//        //4.4.1
//        for (int i = 1; i < 101; i++) {
//            if (i % 2 == 0) System.out.println(i);
//        }
//
//        //4.4.2
//        int m = scan.nextInt();
//        int n = scan.nextInt();
//        for (int i = 0; i < m; i++) {
//            System.out.println();
//            for (int j = 0; j < n; j++)
//                System.out.print("8");
//        }
//        //4.4.3
//        for (int i = 0; i <= 10; i++) { // цикл выполнится 11 раз
//            System.out.println("8"); // одну 8ку уже вывели
//            for (j = 0; j <= i; j++) // цикл выполнится на 1 раз больше чем нужно
//                System.out.print("8");
//        }
//
//        //4.4.4
//        for (int i=0;i<10;i++)
//            System.out.print("8");
//
//        for (int i=0;i<10;i++)
//            System.out.println("8");
//
//        //4.4.5
//        for (int i=0;i<10;i++)
//            System.out.println(name+" любит меня.");
//
//    }


    //4.2.1
    public int min(int a, int b) {
        if (a < b) return a;
        else return b;
    }

    //4.2.2
    public int max(int a, int b, int c, int d) {
        if (a > b && a > c && a > d) return a;
        if (b > a && b > c && b > d) return b;
        if (c > b && c > a && c > d) return c;
        if (d > b && d > a && d > c) return d;
        return 1;
    }

    //    4.2.3
    public int max(int a, int b, int c) {
        if (a > b && a > c) return a;
        if (b > a && b > c) return b;
        if (c > a && c > b) return c;
        return 1;
    }

    public void sortThree(int a, int b, int c) {
        if (max(a, b, c) == a && b > c)
            System.out.println(a + ' ' + b + ' ' + c);
        if (max(a, b, c) == a && c > b)
            System.out.println(a + ' ' + c + ' ' + b);
        if (max(a, b, c) == b && a > c)
            System.out.println(b + ' ' + a + ' ' + c);
        if (max(a, b, c) == b && c > a)
            System.out.println(b + ' ' + c + ' ' + a);
        if (max(a, b, c) == c && a > b)
            System.out.println(c + ' ' + a + ' ' + b);
        if (max(a, b, c) == c && b > a)
            System.out.println(c + ' ' + b + ' ' + a);
    }

    //4.2.4
    public void sravni(String name1, String name2) {
        if (name1.equals(name2)) System.out.println("Имена идентичны");
        else if (name1.length() == name2.length()) System.out.println("Длины имен равны");
    }

    //4.2.5
    public void task5() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        if (age < 18)
            System.out.println("Подрасти еще");
    }

    //4.2.6
    public void task6() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        if (age > 20)
            System.out.println("И 18-ти достаточно");
    }

}

//level5

//class Cat5{
//    //1
//    String name;
//    int age;
//    public int weight;
//    public int strength;
//    //2
//    public boolean fight(Cat5 anotherCat){
//        if (this.weight > anotherCat.weight && this.strength> anotherCat.strength)
//            return true;
//        else return false;
//    }
//
//    public Cat5(String name, int age, int weight, int strength) {
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//        this.strength = strength;
//    }
//}
//3
//class Dog{
//    private String name;
//    private int age;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//}

//4
//Cat5 cat1 =new Cat5("CAt1",4,6,3);
//Cat5 cat2 =new Cat5("Cat2",5,5,5);
//Cat5 cat3 =new Cat5("Cat3",1,2,1);

//5
//System.out.print(cat1.fight(cat2));
//System.out.print(cat1.fight(cat3));
//System.out.print(cat2.fight(cat1));
//System.out.print(cat2.fight(cat3));
//System.out.print(cat3.fight(cat1));
//System.out.print(cat3.fight(cat2));

//5.1.1
//class Friend {
//    String name;
//    int age;
//    char gender;
//    public void initialize(String name)
//    {
//        this.name = name;
//    }
//    public void initialize(String name,int age)
//    {
//        this.name = name;
//        this.age = age;
//    }
//    public void initialize(String name,int age,char gender)
//    {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }
//}

//5.1.2
//class Cat51{
//    String name;
//    int weight;
//    int age;
//    String color;
//    String address;
//    public Cat51(String name)
//    {
//        this.name = name;
//    }
//    public Cat51(String name,int weight,int age)
//    {
//        this.name = name;
//        this.weight = weight;
//        this.age = age;
//    }
//    public Cat51(String name,int age)
//    {
//        this.name = name;
//        this.age = age;
//    }
//    public Cat51(int weight, String color)
//    {
//        this.weight = weight;
//        this.color = color;
//    }
//    public Cat51(int age,String color,String address)
//    {
//        this.age = age;
//        this.color = color;
//        this.address = address;
//    }
//}

//5.1.3
//class Dog51{
//    private String name;
//    private int weight;
//    private String color;
//    public Dog51(String name)
//    {
//        this.name = name;
//
//    }
//    public Dog51(String name,int rost)
//    {
//        this.name = name;
//        this.weight = rost;
//
//    }
//    public Dog51(String name,int rost,String color)
//    {
//        this.name = name;
//        this.weight = rost;
//        this.color = color;
//    }
//}

//5.1.4
//class Circle{
//    int centerX;
//    int centerY;
//    int radius;
//    int width;
//    String color;
//
//    public Circle(int centerX, int centerY, int radius) {
//        this.centerX = centerX;
//        this.centerY = centerY;
//        this.radius = radius;
//    }
//
//    public Circle(int centerX, int centerY, int radius, int width) {
//        this.centerX = centerX;
//        this.centerY = centerY;
//        this.radius = radius;
//        this.width = width;
//    }
//
//    public Circle(int centerX, int centerY, int radius, int width, String color) {
//        this.centerX = centerX;
//        this.centerY = centerY;
//        this.radius = radius;
//        this.width = width;
//        this.color = color;
//    }
//}

//5.1.5
//class Rectangle {
//    int top, left, width, height;
//
//    public Rectangle(int left, int top, int width, int height) {
//        this.left = left;
//        this.top = top;
//        this.width = width;
//        this.height = height;
//    }
//
//    public Rectangle(int left, int top) {
//        this.left = left;
//        this.top = top;
//        width = 0;
//        height = 0;
//    }
//
//    public Rectangle(int left, int top, int width) {
//        this.left = left;
//        this.top = top;
//        this.width = width;
//        height = width;
//    }
//
//    public Rectangle(Rectangle rectangle, int left, int top, int width, int height) {
//        this.left = left;
//        this.top = top;
//        this.width = width;
//        this.height = height;
//    }
//}
