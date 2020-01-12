package com.berkanaslan.simpsonbook;

import java.io.Serializable;
import java.util.ArrayList;

public class Simpson implements Serializable {

    private String name;
    private String job;
    private int picId;

    public Simpson(String name, String job, int picId) {
        this.name = name;
        this.job = job;
        this.picId = picId;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getPicId() {
        return picId;
    }
}
