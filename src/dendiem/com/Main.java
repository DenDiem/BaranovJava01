package dendiem.com;
/**
 * @author Baranov Denys
 * @date 02/02/2019
 */



import java.util.ArrayList;

/**@TODO
 * Об’єкт-одинак
 * Написати клас, організований за шаблоном Singleton.
 * Написати програму, яка:
 * - ілюструє звернення до методів екземпляру цього класу;
 * - створює колекцію з кількома різними екземплярами цього класу
 * та виводить її вміст на екран (обмежитися однопотоковим варіантом).
 */


public class Main {

    static void test1(){
        SingletonPoint singletonPoint = SingletonPoint.getInstance();
        System.out.println("First create: " + singletonPoint);

        SingletonPoint tryCreateNewInstance = SingletonPoint.getInstance();
        System.out.println("Second create: " +tryCreateNewInstance);

        System.out.println("getX : " + singletonPoint.getX());
        System.out.println("getY : " + singletonPoint.getY());

        singletonPoint.setX(100);
        tryCreateNewInstance.setY(200);
        System.out.println("setX for singletonPoint = 100");
        System.out.println("setY for tryClone = 200");


        System.out.println("First create: " + singletonPoint);
        System.out.println("Second create: " +tryCreateNewInstance);

    }

    static void test2()throws Exception{
        SingletonPoint singletonPoint = SingletonPoint.getInstance();
        System.out.println("create clone");
        SingletonPoint tryClone = (SingletonPoint) singletonPoint.clone();
        singletonPoint.setX(2);
        tryClone.setY(3);
        System.out.println("setX for singletonPoint = 2");
        System.out.println("setY for tryClone = 3");

        System.out.println("create colections");
        ArrayList<SingletonPoint> listSingleton = new ArrayList<>();
        listSingleton.add(singletonPoint);
        listSingleton.add(tryClone);

        System.out.println("Print colections: ");
        for (SingletonPoint item: listSingleton)
        {
            System.out.println(item);

        }



    }

    public static void main(String[] args)throws Exception {
        System.out.println("TASK1 *** \nTestring method for Singleton class");
        test1();
        System.out.println("TASK2 *** \nBreak Singleton and create colections");
        test2();


    }
}
