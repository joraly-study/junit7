package ru.joraly;

import ru.joraly.service.impl.DemoServiceImpl;

public class Main {
    public static void main(String[] args) {
        var demoService = new DemoServiceImpl();
        System.out.println(demoService.findMaxI("Ифыв ыфовф ифлмтдлтф идлтф"));
    }
}