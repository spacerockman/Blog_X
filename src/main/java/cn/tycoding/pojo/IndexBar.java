package cn.tycoding.pojo;

import java.io.Serializable;

public class IndexBar implements Serializable {
    //bar的id
    private int id;
    //bar名
    private String listName;
    //权限
    private  int auth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public int getAuth() {
        return auth;
    }

    public void setAuth(int auth) {
        this.auth = auth;
    }
}
