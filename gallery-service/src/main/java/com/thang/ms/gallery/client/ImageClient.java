package com.thang.ms.gallery.client;

import com.thang.ms.gallery.model.Image;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("image-service")
public interface ImageClient {
    @RequestMapping(value = "/images", method = RequestMethod.GET)
    public List<Image> getImages();
}
