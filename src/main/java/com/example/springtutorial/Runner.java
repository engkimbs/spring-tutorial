package com.example.springtutorial;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) {
        Power110V power110V = new Cleaner();
        power110V.powerOn();

        power110V = new Power110VAdapter(new HairDryer());
        power110V.powerOn();
        power110V.powerOn();
        power110V.powerOn();
    }

    static class Power110VAdapter implements Power110V {

        private final Power220V power220V;

        public Power110VAdapter(Power220V power220V) {
            this.power220V = power220V;
        }

        @Override
        public void powerOn() {
            power220V.powerOn();
        }
    }

    static interface Power110V {
        public void powerOn();
    }

    static interface Power220V {
        public void powerOn();
    }

    static class HairDryer implements Power220V {

        @Override
        public void powerOn() {
            System.out.println("220 power on");
        }
    }

    static class Cleaner implements Power110V {

        @Override
        public void powerOn() {
            System.out.println("110 power on");
        }
    }
}
