package com.zq.proxy;

import java.math.BigInteger;

public class Producer implements IProducer{
    public void saleProduce(float money){
        System.out.println("卖出产品，拿到钱"+money);
    }
    public void afterSaleProduce(float money){
        System.out.println("售后，拿到钱"+money);

    }
}
