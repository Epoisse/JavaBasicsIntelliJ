package com.syntax.class25;

import javax.sound.midi.Soundbank;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class FirefoxDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("opening the Firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the Firefox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximizing window the Firefox browser");
    }

    @Override
    public void findElement() {
        System.out.println("finding elements in the Firefox browser");
    }
}
class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("opening the Chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the Chrome browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximizing window the Chrome browser");
    }

    @Override
    public void findElement() {
        System.out.println("finding elements in the Chrome browser");
    }
}
