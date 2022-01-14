package com.gec.test;

import com.spring.boot.SpringBootApplicationCustom;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@ExtendWith({SpringExtension.class})
@SpringJUnitConfig(SpringBootApplicationCustom.class)
public class TimerTest {

    static class MyTask extends Thread{
        @SneakyThrows
        @Override
        public void run() {
            this.wait(1000);
            System.out.println("run");
        }
    }

    @Test
    @Scheduled(cron = "")
    public void test(){
//        Timer timer = new Timer();
//        timer.schedule(new MyTask(), 1000);
    }

    public static void main(String[] args) {
        /**
         * Timer：是一个定时器工具，用来执行指定任务
         * TimerTask：是一个抽象类，他的子类可以代表一个被Timer计划的任务
         */
//        TimerTask task = new TimerTask() {
//            @Override
//            public void run() {
//                // task to run goes here
//                // 执行的输出的内容
//                System.out.println("Hello, stranger");
//            }
//        };
//        Timer timer = new Timer();
//        // 定义开始等待时间  --- 等待 5 秒
//        // 1000ms = 1s
//        long delay = 5000;
//        // 定义每次执行的间隔时间
//        long intevalPeriod = 5 * 1000;
//        // schedules the task to be run in an interval
//        // 安排任务在一段时间内运行
//        timer.scheduleAtFixedRate(task, delay, intevalPeriod);

   
    }
}
