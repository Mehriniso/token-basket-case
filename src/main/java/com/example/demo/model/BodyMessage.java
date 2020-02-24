package com.example.demo.model;

import java.util.List;

public class BodyMessage
{
    private  String terminalid;
    private String id;
    List<Item> items;

    public String getTerminalid() {
        return terminalid;
    }

    public void setTerminalid(String terminalid) {
        this.terminalid = terminalid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }



}
