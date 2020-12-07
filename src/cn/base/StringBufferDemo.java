package cn.base;

/**
 * @ClassName：StringBufferDemo
 * @Description:StringBuffer添加规则
 * @Author: liusw
 * @Date: 2020/12/8 1:51
 */
public class StringBufferDemo {
    public static void main(String[] args) {
            StringBuffer a = new StringBuffer("A");
            StringBuffer b = new StringBuffer("B");
            opert(a, b);
            System.out.print(a + "," + b);//结果是 a="AB" ,b="B"

    }

    static void opert(StringBuffer a, StringBuffer b) {
        a.append("B");
        b = a;
    }

}
