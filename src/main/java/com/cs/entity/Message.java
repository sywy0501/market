package com.cs.entity;

/**
 * @author cs
 * @version V1.0
 * @Title: market
 * @Package com.cs.entity
 * @Description: TODO
 * @date 2017/10/27 下午 04:38
 */
public class Message {

    private int state;
    private String stateInfo;
    private Object data;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Message{" +
                "state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", data=" + data +
                '}';
    }
}
