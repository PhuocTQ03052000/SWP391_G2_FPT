/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author phant
 */
public class Setting {
    private int setting_id;
    private String name;
    private String value;
    private int type_id;
    private int order;
    private String note;
    private int status;

    public Setting() {
    }

    public Setting(String name, String value, int type_id, int order, String note, int status) {
        this.name = name;
        this.value = value;
        this.type_id = type_id;
        this.order = order;
        this.note = note;
        this.status = status;
    }

    public Setting(int setting_id, String name, String value, int type_id, int order, String note, int status) {
        this.setting_id = setting_id;
        this.name = name;
        this.value = value;
        this.type_id = type_id;
        this.order = order;
        this.note = note;
        this.status = status;
    }

    public int getSetting_id() {
        return setting_id;
    }

    public void setSetting_id(int setting_id) {
        this.setting_id = setting_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}