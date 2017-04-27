package com.glideupload;

/**
 * Created by TixseeUser on 4/28/2017.
 */

public class EntityObject {
    private String image;
    private String name;
    public EntityObject(String image, String name) {
        this.image = image;
        this.name = name;
    }
    public String getImage() {
        return image;
    }
    public String getName() {
        return name;
    }
}