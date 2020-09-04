package com.dyzwj.atomic;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName AtomicTicketsSalesTest.java
 * @Description TODO
 * @createTime 2020年08月13日 09:39:00
 */
public class AtomicTicketsSalesTest {

    public static void main(String[] args) {
        AtomicTicketsSales ticketsSales=new AtomicTicketsSales();
        Thread t1=new Thread(ticketsSales,"窗口1");
        Thread t2=new Thread(ticketsSales,"窗口2");
        Thread t3=new Thread(ticketsSales,"窗口3");
        Thread t4=new Thread(ticketsSales,"窗口4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }


}
