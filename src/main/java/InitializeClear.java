import com.sun.deploy.net.proxy.RemoveCommentReader;
import com.sun.deploy.panel.DeleteFilesDialog;

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

    public void main(String[] args) {
//        InitializeClear init = new InitializeClear();
//        System.out.println(init.str);

//        Dog dog = new Dog();

//        try {
//            //垃圾回收只和内存有关（finalize也是）
//            //注意和finally不同，finalize不能在静态方法中
//            //不能直接调用finalize
//            //垃圾回收只知道回收new分配的内存，所以其他并非new出来的对象的内存空间，可以使用finalize方法清理
//            //finalize中加入自定义的清除对象的方法
//            //一旦垃圾回收器准备好要释放对象占用的存储空间，将首先调用finalize方法，
//            // 并且在下一次垃圾回收动作发生的时候才会真正释放对象占用的内存
//            finalize(
////              free() //自己的对应清除的方法
//            );
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }finally {
//
//        }

        //这里举例的是：所有的book对象都应该被签入checkIn，但如果因为疏忽，有一个没有被checkIn
        //就调用finalize检查，检查到这个问题
        Book novel = new Book( true );
        novel.checkIn();
        new Book( true );
        System.gc();//用来强制的进行终结操作


    }

    //内部类，用来示范finalize可能用到的情况
    class Book{
        boolean checkOut = false;
        Book(boolean checkOut){
            this.checkOut = checkOut;
        }

        void checkIn(){
            checkOut = false;
        }

        protected void finalize(){
            if(checkOut){
//                String.format( "", )//string的一个格式化方法
                System.out.println("error : checked out");
            }
        }
    }

}
