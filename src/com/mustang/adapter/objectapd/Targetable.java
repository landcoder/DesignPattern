package com.mustang.adapter.objectapd;

/**
 * 目标接口Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 * Created by Mustang on 17/2/9.
 */
public interface Targetable {

    void sourceMethod();

    void targetMethod();

}
