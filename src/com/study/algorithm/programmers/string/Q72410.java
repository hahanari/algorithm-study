package com.algorithm.string;

public class Q72410 {

    // https://programmers.co.kr/learn/courses/30/lessons/72410

    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        new_id = new_id.replaceAll("[.]{2,}", ".");
        if (new_id.startsWith(".")) {
            new_id = new_id.substring(1);
        }
        if (new_id.endsWith(".")) {
            new_id = new_id.substring(0, new_id.length() - 1);
        }
        if ("".equals(new_id)) {
            new_id = "a";
        }
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        }
        if (new_id.endsWith(".")) {
            new_id = new_id.substring(0, new_id.length() - 1);
        }
        if (new_id.length() <= 2) {
            new_id = new_id + new_id.substring(new_id.length() - 1);
        }
        if (new_id.length() <= 2) {
            new_id = new_id + new_id.substring(new_id.length() - 1);
        }
        if (new_id.length() <= 2) {
            new_id = new_id + new_id.substring(new_id.length() - 1);
        }

        return new_id;
    }
}
