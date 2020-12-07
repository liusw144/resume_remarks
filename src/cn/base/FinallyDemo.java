package cn.base;

/**
 * @ClassName：FinallyDemo
 * @Description: 测试finally关键字执行结果
 * @Author: liusw
 * @Date: 2020/12/8 1:41
 */
public class FinallyDemo {
    private int funs() {
        int i=0;

        try{
            ++i;
        }catch (Exception e){

        }finally {
           i++;
        }
        return i++;//针对 return ++i是先加在返回，i++是先返回再加，故不会加直接返回
    }
    public static void main(String[] args) {

        FinallyDemo finallyDemo = new FinallyDemo();
        System.out.println(finallyDemo.funs());
    }
}
