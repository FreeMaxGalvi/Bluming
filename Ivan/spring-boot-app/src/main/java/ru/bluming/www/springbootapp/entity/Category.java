package ru.bluming.www.springbootapp.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;

@Entity
public class Category {
    private int id;
//    private byte[] photo;
    private String title;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    @Basic
//    @Column(name = "photo")
//    public byte[] getPhoto() {
//        return photo;
//    }

//    public void setPhoto(byte[] photo) {
//        this.photo = photo;
//    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (id != category.id) return false;
//        if (!Arrays.equals(photo, category.photo)) return false;
        if (title != null ? !title.equals(category.title) : category.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
//        result = 31 * result + Arrays.hashCode(photo);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }
}
