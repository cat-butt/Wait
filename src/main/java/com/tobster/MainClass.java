package com.tobster;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by jackson on 11/22/2016.
 */
public class MainClass {

    public static Timer timer = new Timer();

    public static void main(String[] args) {

        MainClass mainClass = new MainClass();
//        for(int i = 0; i < 5; i++ ) {
//            MainClass.timer.schedule(new SimKeystroke(), 500000);
//        }
        MainClass.timer.scheduleAtFixedRate(new SimKeystroke(), 500000, 500000);
    }

    static class SimKeystroke extends TimerTask {
        public void run() {
            System.out.println(new Date());
            try {
                Robot robot = new Robot();
//                robot.keyPress(KeyEvent.VK_SHIFT);
                robot.mouseMove(MouseInfo.getPointerInfo().getLocation().x, MouseInfo.getPointerInfo().getLocation().y);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
    }
}


