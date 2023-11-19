package com.mycompany.app;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {
    }

    public static void main(String[] args) throws InterruptedException, UnknownHostException {
        System.out.println(MESSAGE);
        Thread.sleep(60 * 1000L);
        System.out.println(MESSAGE + " end" + "------>" + InetAddress.getLocalHost().getHostAddress());
    }

    public String getMessage() {
        return MESSAGE;
    }
}
