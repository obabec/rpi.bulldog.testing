package com.redhat;

import io.silverspoon.bulldog.core.gpio.DigitalOutput;
import io.silverspoon.bulldog.core.platform.Board;
import io.silverspoon.bulldog.core.platform.Platform;
import io.silverspoon.bulldog.core.util.BulldogUtil;
import io.silverspoon.bulldog.raspberrypi.RaspiNames;

public class BulldogLED {

    public static void main(String[] args) {

        Board board = Platform.createBoard();

        DigitalOutput digitalOutput = board.getPin(RaspiNames.P1_11).as(DigitalOutput.class);


        for (int i = 0; i< 15; i++) {
            digitalOutput.high();
            BulldogUtil.sleepMs(1000);
            digitalOutput.low();
        }
    }
}