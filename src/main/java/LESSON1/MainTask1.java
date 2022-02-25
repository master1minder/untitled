package LESSON1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Scanner;

public class MainTask1 {
    public static void main(String[] args) {
        //Первый Модуль
        /*1*/
        String name1 = "Max", name2 = "Kirill", name3 = "Timur";
        /*2*/
        for (int i = 0; i < 10; i++)
            System.out.println("Когда я вырасту, то хочу быть паровым экскаватором!");

        /*3*/
        // String s = "Merry";
        // System.out.println("Christmas");
        // System.out.println("Merry New");
        // System.out.println("weekend");
        System.out.print("Happy New");
        // System.out.println("weekend");
        // System.out.println(s);
        // System.out.print("Merry New!");
        System.out.print(" ");
        System.out.println("Year");

        /*4*/
        String s = "5";

        String t = "6";

        int x = 7;


        /*5*/
        System.out.println("Меня зовут Амиго.\n" +
                "\n" +
                "Я согласен на зарплату $800/месяц в первый год.\n" +
                "Я согласен на зарплату $1500/месяц во второй год.\n" +
                "Я согласен на зарплату $2200/месяц в третий год.\n" +
                "Я согласен на зарплату $2700/месяц в четвертый год.\n" +
                "Я согласен на зарплату $3200/месяц в пятый год.\n" +
                "\n" +
                "Поцелуй мой блестящий металлический зад!");

        /*6*/
        String s = "Nothing";
        s = s + " ";
        s = s + "personal";
        s = s + ",";
        s = s + " ";
        s = s + "it's";
        s = s + " ";
        s = s + "just";
        s = s + " ";
        s = s + "business";
        s = s + ".";
        System.out.println(s);

        /*7*/
        //String s = "15";
        int a = 5;
        //int z = 18;
        int d = 18;
        int c = a + d;
        String b = " better then ";
        System.out.println(a + b + c);

        /*8*/
        for (int i = 0; i < 16; i++)
            System.out.println("Слава Роботам! Убить всех человеков!");


        //Второй модуль
        //1
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        //2
        Dog d1 = new Dog("Max");
        Dog d2 = new Dog("Bella");
        Dog d3 = new Dog("Jack");


        //3
        System.out.println("Мне так плохо! Хочу, чтобы все умерли!");

        //4 не открываеться требуеться премиум подписка
        //5
        Cat c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();

        //6
        //owner это поля ссылки на классы
        Cat s1 = new Cat();
        Dog s2 = new Dog();
        Fish s3 = new Fish();
        Woman s4 = new Woman();
        s1.owner = s4;
        s2.owner = s4;
        s3.owner = s4;

        //7
        int min(int a,int b){
            if (a<b) return a;
            else  return b;
        }
        //8
        int max(int a,int b){
            if (a>b) return a;
            else  return b;
        }
        //9
        int min(int a,int b,int c){
            if (a<b && a<c) return a;
            if (b<a && b<c) return b;
            else return c;
        }

        //10
        int min(int a,int b,int c,int d){
            max = min(a,b);
            if (max<c && max<d) return max;
            return max;
        }

        String dublicate(String s){
            return "\n"+s + "\n"+s "\n" +s;
        }

        String split(String s){
            return " "+s + " "+s " " +s;
        }


        //Третий модуль
        //1
         System.out.println("AUGUST"+ "28" +"2003");
        //2 нет номера

        //3
        Zerg zerg1 = new Zerg("Zerg1");
        Zerg zerg2 = new Zerg("Zerg2");
        Zerg zerg3 = new Zerg("Zerg3");
        Zerg zerg4 = new Zerg("Zerg4");
        Zerg zerg5= new Zerg("Zerg5");
        Zerg zerg6 = new Zerg("Zerg6");
        Zerg zerg7 = new Zerg("Zerg7");
        Zerg zerg8 = new Zerg("Zerg8");
        Zerg zerg9 = new Zerg("Zerg9");
        Zerg zerg10 = new Zerg("Zerg10");

        Protosov sov = new sov("Filin");
        Protosov sov = new sov("ZloyFilin");
        Protosov sov = new sov("DobriyFilin");

        Terran terran = new Terran("T0");
        Terran terran1 = new Terran("T1");
        Terran terran2 = new Terran("T2");
        Terran terra3 = new Terran("T34");
        Terran terra4 = new Terran("T4");
        Terran terra5 = new Terran("T5");
        Terran terra6 = new Terran("T6");
        Terran terra7 = new Terran("T7");
        Terran terra8 = new Terran("T8");
        Terran terra9 = new Terran("T9");
        Terran terran10 = new Terran("T10");
        Terran terran12 = new Terran("T12");

        //4
        Integer sum=1;
        for (int i=0;i<10;i++){
            sum =sum* i;
        }
        //5
        Integer sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
        //6
        String a="Мама";
        String b="Мыла";
        String c="Раму";
        System.out.println(a+b+c);
        System.out.println(a+c+b);
        System.out.println(c+a+b);
        System.out.println(c+b+a);
        System.out.println(b+a+c);
        System.out.println(b+c+a);
        //7
        for(int i = 1; i < 10; i++){
            for(int k = 1; k < 10; k++){
                System.out.print(k * i + "  ");
            }
            System.out.println("");
        }

        //8
        Red red= new Red();
        Orange orange= new Orange();
        Yellow yellow= new Yellow();
        Green green= new Green();
        Blue blue= new Blue();
        Indigo indigo= new Indigo();
        Violet violet= new Violet();
        System.out.print(red + "/n" + orange + "/n" + yellow + "/n" + green + "/n" + blue + "/n" + indigo + "/n" + violet);

        //9
        String a = "It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"";
        System.out.println(a);

        String b = "It's Java string: \\\"C:\\Program Files\\Java\\jdk1.7.0\\bin\"";
        System.out.println(b);

        //10
        System.out.println("\u65E5\u672C\u8A9E");
        Scanner scanner = new Scanner(System.in);
        //11
        String number = scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println(name + " захватит мир через " +number+" лет. Му-ха-ха!");

        //12
        String name = scanner.nextLine();
        String number1 = scanner.nextLine();
        String number2 = scanner.nextLine();
        System.out.println(name + " получает " +number1+" через "+number2);

        //13
        String name = scanner.nextLine();
        System.out.println(name+ " зарабатывает $5,000. Ха-ха-ха!");

        //14
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        System.out.println(name1 + " проспонсировал" +name2 + ", и она стала известной певицей.");

        //15
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String name3 = scanner.nextLine();
        System.out.println( name1 +" "+ name2 +" "+ name3 +" = Чистая любовь, да-да!");

    }
}
class Cat{}
class Dog{
    private String name;

    Dog(String name){
        this.name = name;
    }

}

class Printer{
    Printer(){
        System.out.println("Мне так плохо! Хочу, чтобы все умерли!");
    }
}