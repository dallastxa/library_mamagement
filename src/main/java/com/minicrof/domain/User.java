package com.minicrof.domain;

import lombok.Data;

@Data
public class User {
    private int uid;
    private long card_num;
    private String password;
    private int cardState;
    private String name;
    private String username;
    private String phoneNum;
    private int bid;
}
