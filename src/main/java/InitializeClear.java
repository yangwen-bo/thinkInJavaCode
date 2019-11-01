/**
 * @Author yangwen-bo
 * @Date 2019/10/31.
 * @Version 1.0
 *
 * 第五章 初始化与清理
 *
 * 方法的重载 如果传入的数据类型（小于）方法中声明的参数类型，在调用方法时会自动向上提升该参数数据类型
 * char略有不同，如果无法找到恰好接受char参数的方法，就会把char直接提升至int类型
 * 如果（大于）参数类型（而且没有其他适合的方法），则会报错
 */
public class InitializeClear {
    String str;
    InitializeClear(){
        System.out.println("InitializeClear 构造方法");
        str = new String(  );
    }

    //内部类
    static class Dog{

        Dog(){
            System.out.println("Dog 构造方法执行");
        }

        Dog(int i){
            this();//这样使用必须放在最开始的地方，否则报错
            // 而且不能调用两个构造方法，即使是重载的不同构造器也不可以
            // 除构造器外，禁止在其他方法中这样调用构造器
            System.out.println(i+"岁的dog");

        }


    }

    public static void main(String[] args) {
//        InitializeClear init = new InitializeClear();
//        System.out.println(init.str);

        Dog dog = new Dog();
    }
}
