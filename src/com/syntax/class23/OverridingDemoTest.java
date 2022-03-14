package com.syntax.class23;

public class OverridingDemoTest {
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.start();
        Suzuki suzuki=new Suzuki();
        suzuki.park();
        suzuki.start();
    }
}
