package com.company;

public class Country {
    private int id;
    private String code;
    private String name;

    public Country(String str) {
        String[] strArr = str.split(",");
        this.id = Integer.parseInt(strArr[0]);
        this.code = strArr[1];
        this.name = strArr[2];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
