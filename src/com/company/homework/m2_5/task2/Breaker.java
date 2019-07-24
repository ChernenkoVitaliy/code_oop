package com.company.homework.m2_5.task2;

/*класс который запускается в отдельном потоке и ждет из консоли нажатия кнопки enter,
* после чего он прерывает поток который ему передали в конструкторе*/

import java.util.Scanner;

public class Breaker extends Thread{
    private Thread thread;
    private IBreakEvent event;

    public Breaker(Thread thread, IBreakEvent event) {
        this.thread = thread;
        this.event = event;
    }


    @Override
    public void run() {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("For exit press ENTER");
            sc.nextLine();

            if (thread != null) {
                thread.interrupt();
                if (event != null)
                    event.breaked();
            }
        }
    }
}
