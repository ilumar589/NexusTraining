package com.company.nexus.simHttp.model;

import com.company.nexus.util.FactoryCreation;

import java.io.Serializable;

/**
 * Created by WolframAlpha on 23/10/2016.
 */
public class Child implements Serializable {

    private Long id;

    private String name;

    private String parentName;

    public Child(){}

    public Child(Long id,
                 String name,
                 String parentName){

        this.id = id;
        this.name = name;
        this.parentName = parentName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Child child = (Child) o;

        if (id != null ? !id.equals(child.id) : child.id != null) return false;
        if (name != null ? !name.equals(child.name) : child.name != null) return false;
        return parentName != null ? parentName.equals(child.parentName) : child.parentName == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (parentName != null ? parentName.hashCode() : 0);
        return result;
    }
}
