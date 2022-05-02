package com.syntax.class25;

public abstract class SmartWatch {
    //we can have instance variables in an abstract class
    private int RAM;
    protected int ROM;
    double displaySize;
    public String make;
    static boolean showTime=true;
    public SmartWatch(int RAM, int ROM, double displaySize,String make){
        this.RAM=RAM;
        this.ROM=ROM;
        this.displaySize=displaySize;
        this.make=make;
    }
    //access modifiers then non-access modifiers then return type then method name
    public abstract void showHealthTips ();
    private void updateOS(){
        checkOSUpdate();


        System.out.println("Updating the OS");
    }
    private void checkOSUpdate (){
        System.out.println("checking the update");
    }
    private void downloadUpdate (){
        System.out.println("downloading the update");
    }
    private void installUpdate (){
        System.out.println("installing the update");
    }
    static void displayTime (){
        System.out.println("displaying time");
    }

}
class AppleWatch extends SmartWatch {

    public AppleWatch(int RAM, int ROM, double displaySize, String make) {
        super(RAM, ROM, displaySize, make);
    }

    @Override
    public void showHealthTips() {
        System.out.println("use the Health App");
    }
}
