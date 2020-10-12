package cn.qianfeng.proj;

import java.io.Serializable;

public class User implements Serializable {
    //成员属性
    private static final long serialVersionUID =1L;
    private String username;
    private String location;

    //全参构造
    public User(String username, String location) {
        this.username = username;
        this.location = location;
    }
    //空参构造

    public User() {
    }
    //构造函数

   /* public static long getSerialVersionUID() {
        return serialVersionUID;
    }*/

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
