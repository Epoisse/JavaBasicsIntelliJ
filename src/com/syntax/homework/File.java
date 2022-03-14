package com.syntax.homework;

abstract public class File {
    abstract void open();

    void edit() {
        System.out.println("Editing the files");
    }

    void close() {
        System.out.println("Closing the files");
    }
}

class JavaFile extends File {
    @Override
    void open() {
        System.out.println("To open Java files we need IntelliJ");
    }
}

class WordFile extends File {
    @Override
    void open() {
        System.out.println("To open Word files we need Microsoft Office");
    }
}

class PdfFile extends File {
    @Override
    void open() {
        System.out.println("To open Pdf files we need to use Adobe reader");
    }
}

class FileTest {
    public static void main(String[] args) {
        File[] files = {new JavaFile(), new WordFile(), new PdfFile()};
        for (File file : files) {
            file.open();
            file.edit();
            file.close();
        }
        for (int i = 0; i < files.length; i++) {
            files[i].open();
            files[i].edit();
            files[i].close();
        }
        int i = 0;
        while (i < files.length) {
            files[i].edit();
            files[i].open();
            files[i].close();
            i++;
        }
    }
}
