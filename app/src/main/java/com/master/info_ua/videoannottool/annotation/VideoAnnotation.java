package com.master.info_ua.videoannottool.annotation;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import com.master.info_ua.videoannottool.MainActivity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Date;
import java.util.List;

public class VideoAnnotation{
    private String creationDate;
    private String lastModified;
    private List<Annotation> annotationList;



    public VideoAnnotation() {

    }

    public VideoAnnotation(String creationDate, String lastModified, List<Annotation> annotationList) {
        this.creationDate = creationDate;
        this.lastModified = lastModified;
        this.annotationList = annotationList;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public List<Annotation> getAnnotationList() {
        return annotationList;
    }

    public void setAnnotationList(List<Annotation> annotationList) {
        this.annotationList = annotationList;
    }



}
