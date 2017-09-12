package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Lenovo on 2017/9/12.
 */

public class Province extends DataSupport {

    private int id;

    private String provinceName;

    private int provienceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvienceCode() {
        return provienceCode;
    }

    public void setProvienceCode(int provienceCode) {
        this.provienceCode = provienceCode;
    }
}
