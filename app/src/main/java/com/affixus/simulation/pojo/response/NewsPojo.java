package com.affixus.simulation.pojo.response;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by santosh on 10/23/16.
 */
public class NewsPojo implements Serializable {
    private String _id;
    private Date createdAt;
    private String newsType;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType;
    }
}
