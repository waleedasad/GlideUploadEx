package com.glideupload;

/**
 * Created by TixseeUser on 4/28/2017.
 */

import com.google.gson.annotations.SerializedName;
public class ServerImageObject {
    @SerializedName("success")
    private String success;
    public ServerImageObject(String success){
        this.success = success;
    }
    public String getSuccess() {
        return success;
    }
    public void setSuccess(String success) {
        this.success = success;
    }
}