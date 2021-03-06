package com.halzhang.android.examples.accessibilityexample.models;

/**
 * Created by Hal on 16/12/23.
 */

public class SettingModel {

    public String mQGroupName;
    public int mSendCount;

    public SettingModel(String QGroupName, int sendCount) {
        mQGroupName = QGroupName;
        mSendCount = sendCount;
    }

    public int getSendCount() {
        return mSendCount;
    }

    public String getQGroupName() {
        return mQGroupName;
    }

    public void setQGroupName(String QGroupName) {
        mQGroupName = QGroupName;
    }

    public void setSendCount(int sendCount) {
        mSendCount = sendCount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SettingModel{");
        sb.append("mQGroupName='").append(mQGroupName).append('\'');
        sb.append(", mSendCount=").append(mSendCount);
        sb.append('}');
        return sb.toString();
    }
}
