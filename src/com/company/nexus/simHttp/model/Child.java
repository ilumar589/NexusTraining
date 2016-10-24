package com.company.nexus.simHttp.model;

import com.company.nexus.util.FactoryCreation;

import java.io.Serializable;

/**
 * Created by WolframAlpha on 23/10/2016.
 */

/**
 *  Builder pattern for child model
 */

public class Child implements Serializable {

    private final Long id; //required

    private final String name; //required

    private final String parentName; //optional

    private Child(ChildBuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.parentName = builder.parentName;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getParentName() {
        return parentName;
    }

    // static fields are not serialized so there is no need for the transient keyword
    public static final class ChildBuilder {

        private final Long id;
        private final String name;
        private String parentName;

        public ChildBuilder(Long id, String name){
            this.id = id;
            this.name = name;
        }

        public ChildBuilder parentName(String parentName){
            this.parentName = parentName;
            return this;
        }

        public Child build(){
            return new Child(this);
        }
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

    @Override
    public String toString() {
        return id + "#"  + name + "#" + parentName;
    }
}
