package com.syntax.homework;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class InsuranceTask {
    public static void main(String[] args) {
        ArrayList<Insurance> listOfInsurance = new ArrayList<>();
        listOfInsurance.add(new Car("Liability", "Ford"));
        listOfInsurance.add(new Pet("Accident-only", "Dog"));
        listOfInsurance.add(new Health("Bronze"));

        for (int i = 0; i < listOfInsurance.size(); i++) {
            listOfInsurance.get(i).getQuote();
            listOfInsurance.get(i).cancelInsurance();
        }
        System.out.println("------------------------------------");

        for (Insurance list : listOfInsurance
        ) {
            list.getQuote();
            list.cancelInsurance();
        }
        System.out.println("------------------------------------");
        Iterator<Insurance> iterator = listOfInsurance.iterator();
        while (iterator.hasNext()) {
            Insurance i= iterator.next();
            i.getQuote();
            i.cancelInsurance();
        }
    }
}

class Car extends Insurance {
    String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    void getQuote() {
        System.out.println("Getting quote for " + carModel + " with a " + insuranceName + " coverage");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Cancelling insurance for " + carModel);
    }
}

class Pet extends Insurance {
    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    void getQuote() {
        System.out.println("Getting quote for " + petType + " with a " + insuranceName + " coverage");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Cancelling insurance for " + petType);
    }
}

class Health extends Insurance {
    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("Getting quote for " + insuranceName + " coverage");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Cancelling " + insuranceName + " insurance");
    }
}

abstract class Insurance {
    String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    abstract void getQuote();

    abstract void cancelInsurance();
}