import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName StringTest.java
 * @Description TODO
 * @createTime 2020年07月31日 16:03:00
 */
public class StringTest {


    /**
     * 字符串常量池中不会存储相同内容的字符串**
     *
     * 直接使用双引号声明的String对象会直接放入字符串常量池** String name = "zwj"
     */
    @Test
    public void test1(){

        String str1 = "zwj";
        String str2 = "zwj";
        System.out.println(str1 == str2);//true
    }

    @Test
    public void test2(){

        String a = "hello";
        String b = "world";
        String c = "hello" + "world";
        String e = "helloworld";
        String d = (a + b).intern();
        System.out.println(c == d);//false
        System.out.println(c == e);//true
        System.out.println(d == e);//false


    }

    @Test
    public void test3(){

        String s1 = new String("a");
//        s1 = s1.intern();
        s1.intern();
        String s2 = "a";
        System.out.println(s1 == s2);//false



//        String s5 = new String("22");
//        s5.intern();
//        String s6 = "22";
//        System.out.println(s5 == s6);
    }

    @Test
    public void test4(){
        Test1 a = new Test1("A");
        Test1 b = new Test1("B");
        Test1 c = new Test1("C");
        Test1 test1;
        test1 = a = b = c;
        System.out.println(test1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}


class Test1 {
    private String name;

    public Test1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "name='" + name + '\'' +
                '}';
    }
}