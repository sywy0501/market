package com.cs.entity;

import java.util.Date;

/**
 * @author cs
 * @version V1.0
 * @Title: market
 * @Package com.cs.entity
 * @Description: TODO
 * @date 2017/10/26 上午 11:26
 */
public class User {
    //用户id
    private Long id;
    //账号
    private String account;
    //头像
    private String avatar;
    //充值总额
    private Long payMoney;
    //国家
    private String country;

    //用户创建时间
    private Date createTime;
    //积分
    private Long score;

    //所在纬度
    private Double latitude;
    //所在经度
    private Double longitudu;
    //省份
    private String province;
    //用户性别，F:女，M:男
    private String sex;
    //密码
    private String password;
//    //排名
//    private Integer rank;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Long getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitudu() {
        return longitudu;
    }

    public void setLongitudu(Double longitudu) {
        this.longitudu = longitudu;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", avatar='" + avatar + '\'' +
                ", payMoney=" + payMoney +
                ", country='" + country + '\'' +
                ", createTime=" + createTime +
                ", score=" + score +
                ", latitude=" + latitude +
                ", longitudu=" + longitudu +
                ", province='" + province + '\'' +
                ", sex='" + sex + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
