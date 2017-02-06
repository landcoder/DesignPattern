package com.mustang.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式
 * Created by Mustang on 17/2/6.
 */
public class Builder {

    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }

    public List<Sender> getList() {
        return list;
    }

    public void setList(List<Sender> list) {
        this.list = list;
    }
}
