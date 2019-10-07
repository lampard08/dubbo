package com.lampard.spi.dubbo;

/**
 * @author lampard
 */
public class DubboSpiServiceImpl implements DubboSpiService {

    @Override
    public void printInfo() {
        System.out.println("hello world dubbo spi 1 ");
    }
}
