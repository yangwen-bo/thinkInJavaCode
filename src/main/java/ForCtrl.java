/**
 * @Author yangwen-bo
 * @Date 2019/10/29.
 * @Version 1.0
 *
 * 程序控制流程 练习
 */
public class ForCtrl {
    public static void main(String[] args) {
//        randomSort();
//        division();
        binaryString();
    }

    //练习2 产生25个int类型的随机数，对每一个随机数，将其分为大于小于等于紧随它产生的下一个数
    public static void randomSort(){
        int[] arr =new  int[25];
        for(int i=0;i<25;i++){
            arr[i]=(int) (Math.random()*100);
        }
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                System.out.println("第"+i+"个数"+arr[i]+"大于"+arr[i+1]);
            }else if(arr[i]<arr[i+1]){
                System.out.println("第"+i+"个数"+arr[i]+"小于"+arr[i+1]);
            }else{
                System.out.println("第"+i+"个数"+arr[i]+"等于"+arr[i+1]);
            }
        }
    }

    //练习4 写一个程序用两个嵌套的for循环和取余操作符%来探测和打印素数（只能被自身和1整除）
    public static void division(){
        int flag =0;
        for (int i = 1; i <= 100; i++) {
            for (int j =1;j<i;j++){
                if(i%j == 0 && j!=1){
                    flag=0;
                    break;
                }else{
                    flag=i;
                }
            }
            if(flag!=0){
                System.out.println(flag+"是素数");
            }
        }
    }

    //练习5 不用Interger.toBbinaryString()用三元操作显示二进制
    public static void binaryString(){
        int i = 0x2aa;
        int j = 0x555;
        System.out.println("i:"+toBinaryString(i));
        System.out.println("j:"+toBinaryString(j));
        System.out.println("~i:"+toBinaryString(~i));
        System.out.println("~j:"+toBinaryString(~j));
        System.out.println("(i|j):"+toBinaryString(i|j));
        System.out.println("(i&j):"+toBinaryString(i&j));
        System.out.println("(i^i):"+toBinaryString(i^i));
        System.out.println("(i|j):"+toBinaryString(~(i|j)));
        System.out.println("~(i&j):"+toBinaryString(~(i&j)));
        System.out.println("(i^j):"+toBinaryString(i^j));


    }

    private static String toBinaryString(int i)
    {
        int INT_HIGH_BIT = 1 << 31;
        String result = "";
        int j = 1;
        do {
            if (j == INT_HIGH_BIT) {
                result = ((i & j) > 0 ? "0" : "1") + result;
            } else {
                result = ((i & j) > 0 ? "1" : "0") + result;
            }
            i = i - (i & j);
            j <<= 1;
        } while (i != 0);

        return result;
    }

    //net.mindview.util.Range 的range方法可以将指定范围的数字 用foreach遍历
    public static void range(){
//        for (int i : range(10))//0-9
//        for (int i : range(5,10))//5-9
//        for (int i : range(5,20,3))//5-20 step3

    }

}
