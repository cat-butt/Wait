package com.tobster;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;

/**
 * Created by jackson on 3/7/2017.
 */
public class TryHardClass {
    private final static int DELAY = 60000;
    private final static int COUNT = 30;
    private static final Timer timer = new Timer();
    private static final TimerTask task = new TimerTask() {
        private int counter = 0;

        @Override
        public void run() {
            System.out.println(new Date());
            Robot robot = null;
            try {
                robot = new Robot();
            } catch (AWTException e) {
                e.printStackTrace();
            }
            robot.mouseMove(    MouseInfo.getPointerInfo().getLocation().x,
                                MouseInfo.getPointerInfo().getLocation().y);
//            if( ++counter == COUNT ) {
//                timer.cancel();
//            }

        }
    };
    private TryHardClass() {}

    public static void main(String[] args) {
        if( args.length > 0 ) {
            int numMinutes = Integer.getInteger(args[0]);
            System.out.println("args = " + args[0]);
        }
        timer.schedule(task, DELAY, DELAY);
    }
}
