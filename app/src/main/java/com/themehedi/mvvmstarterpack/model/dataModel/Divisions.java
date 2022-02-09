package com.themehedi.mvvmstarterpack.model.dataModel;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Divisions {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "value")
    public int value;

    @ColumnInfo(name = "text_en")
    public String text_en;

    @ColumnInfo(name = "text_bn")
    public String text_bn;

    @ColumnInfo(name = "status")
    public int status;

    public Divisions(int value, String text_en, String text_bn, int status) {
        this.value = value;
        this.text_en = text_en;
        this.text_bn = text_bn;
        this.status = status;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getText_en() {
        return text_en;
    }

    public void setText_en(String text_en) {
        this.text_en = text_en;
    }

    public String getText_bn() {
        return text_bn;
    }

    public void setText_bn(String text_bn) {
        this.text_bn = text_bn;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
