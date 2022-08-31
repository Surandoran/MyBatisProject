package com.mybatisproject.domain;

import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class UserAccount {

    private String userid;
    private String password;
    private String email;
    private String username;
    private String phone;
    private String addr;

}
