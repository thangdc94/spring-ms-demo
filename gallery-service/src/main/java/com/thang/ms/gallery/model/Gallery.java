package com.thang.ms.gallery.model;

import java.util.List;

public class Gallery {
    private long id;

    private List<Image> images;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
