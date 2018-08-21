package com.gw.learn.generic.tuple;
/**
 * 类名:
 * 参数:
 * 描述: 二元组
 * 作者: gongwang
 * 日期: 2018/7/28
 * 时间: 下午9:03
 **/
public class TwoTuple<A,B> {
    public final A first;
    public final B second;

    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "("+first+","+second+")";
    }
}
