import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName SortDemo.java
 * @Description TODO
 * @createTime 2020年07月28日 11:24:00
 */

public class SortDemo {


    /**
     * 对两个有序列表(都是升序)进行合并排序
     */
    public List<Integer> sort1(List<Integer> aList,List<Integer> bList){

        int aSize = aList.size();
        int bSize = bList.size();

        if(aList.get(0) > bList.get(bSize - 1)){
            aList.addAll(0,bList);
            return aList;
        }else if(bList.get(0) > aList.get(aSize -1)){
            bList.addAll(0,aList);
            return bList;
        }

        List<Integer> result = new ArrayList<>(aSize + bSize);
        int i = 0,j = 0;
        for (; i < aSize && j < bSize;) {
            if(aList.get(i) > bList.get(j)){
                result.add(bList.get(j));
                j++;
            }else{
                result.add(aList.get(i));
                i++;
            }
        }

        //bList已排好序，aList还有剩余
        if(i < aSize ){
            result.addAll(i + j,aList.subList(i,aSize));
        }
        //aList已排好序，bList还有剩余
        if(j < bSize){
            result.addAll(i + j,bList.subList(j,bSize));
        }

        return result;
    }

    public List<Integer> sort2(List<Integer> aList,List<Integer> bList){

        int aSize = aList.size();
        int bSize = bList.size();
        List<Integer> result = new ArrayList<>(aSize + bSize);


        //aList下标（指针）
        int a = 0;
        //bList下标（指针）
        int b = 0;

        while (a < aSize && b < bSize){
            result.add(aList.get(a) > bList.get(b) ? bList.get(b++) : aList.get(a++));

//            if(aList.get(a) > bList.get(b)){
//                result.add(bList.get(b));
//                b++;
//            }else {
//                result.add(aList.get(a));
//                a++;
//            }
        }

        if(a < aSize){
            result.addAll(a + b , aList.subList(a,aSize));
        }
        if (b < bSize){
            result.addAll(a + b, bList.subList(b,bSize));
        }
        return result;

    }

    @Test
    public void test1(){
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(7);

        List<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        list2.add(11);

        List<Integer> list = sort1(list1, list2);
        list.forEach(System.out::println);

//
//        int a = 0;
//        int b = 0;
//
//        System.out.println(a++);
//        System.out.println(++b);



    }




}
