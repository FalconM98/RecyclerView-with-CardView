package com.example.recyclerview;

public class List_Element {
    public String color;
    public String name;
    public String city;
    public String Status;

    public List_Element(String color, String name, String city, String status) {
        this.color = color;
        this.name = name;
        this.city = city;
        this.Status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
