package com.example.demo;

import com.google.common.base.Joiner;

import java.util.StringJoiner;

public class HomeWorks {
    public static void main(String[] args) {
        StringJoiner testJoin= new StringJoiner("fgz","--","]");
        System.out.println(testJoin.add("aaa").add("bbb").add("ccc").toString());
        Joiner joiner=Joiner.on("fgz");
        String str[] = {"aaa", "bbb", "ccc", "ddd"};
        System.out.println(joiner.join(str));
    }
}
