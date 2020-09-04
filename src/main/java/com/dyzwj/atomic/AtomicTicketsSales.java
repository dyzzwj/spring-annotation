package com.dyzwj.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName AtomicTicketsSales.java
 * @Description TODO
 * @createTime 2020年08月13日 09:38:00
 */
public class AtomicTicketsSales implements Runnable{

    private static volatile AtomicInteger tickets = new AtomicInteger(100);

    @Override
    public void run() {
        while(true){
            if(tickets.get()>0){
                System.out.println(Thread.currentThread().getName()+"正在销售第"+tickets.getAndDecrement()+"张票");
            }else{
                System.out.println(Thread.currentThread().getName()+"票已卖完");
                break;
            }
        }
    }

}
