package com.mustang.memento;

/**
 * Original类是原始类，里面有需要保存的属性value及创建一个备忘录类，用来保存value值。
 * Memento类是备忘录类，Storage类是存储备忘录的类，持有Memento类的实例.
 * Created by Mustang on 17/3/3.
 */
public class Test {

    public static void main(String[] args) {
        Original original = new Original("mustang");
        Storage storage = new Storage(original.createMemento());

        System.out.println("default:" + original.getValue());
        original.setValue("jerry");
        System.out.println("after:" + original.getValue());

        original.restoreMemento(storage.getMemento());
        System.out.println("restore:" + original.getValue());
    }

}
