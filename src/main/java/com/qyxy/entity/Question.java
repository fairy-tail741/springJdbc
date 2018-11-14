package com.qyxy.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Administrator on 2018/7/24 0024.
 */
@Entity
public class Question {
    private Integer id;
    private String title;
    private String type;
    private String imageurl;
    private Date createTime;
    private String checkStatus;
    private Date checkTime;
    private String checkUser;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 128)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 255)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "imageurl", nullable = true, length = 255)
    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    @Basic
    @Column(name = "createTime", nullable = true)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "checkStatus", nullable = true, length = 1)
    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    @Basic
    @Column(name = "checkTime", nullable = true)
    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    @Basic
    @Column(name = "checkUser", nullable = true, length = 32)
    public String getCheckUser() {
        return checkUser;
    }

    public void setCheckUser(String checkUser) {
        this.checkUser = checkUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Question question = (Question) o;

        if (id != null ? !id.equals(question.id) : question.id != null) return false;
        if (title != null ? !title.equals(question.title) : question.title != null) return false;
        if (type != null ? !type.equals(question.type) : question.type != null) return false;
        if (imageurl != null ? !imageurl.equals(question.imageurl) : question.imageurl != null) return false;
        if (createTime != null ? !createTime.equals(question.createTime) : question.createTime != null) return false;
        if (checkStatus != null ? !checkStatus.equals(question.checkStatus) : question.checkStatus != null)
            return false;
        if (checkTime != null ? !checkTime.equals(question.checkTime) : question.checkTime != null) return false;
        if (checkUser != null ? !checkUser.equals(question.checkUser) : question.checkUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (imageurl != null ? imageurl.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (checkStatus != null ? checkStatus.hashCode() : 0);
        result = 31 * result + (checkTime != null ? checkTime.hashCode() : 0);
        result = 31 * result + (checkUser != null ? checkUser.hashCode() : 0);
        return result;
    }
}
