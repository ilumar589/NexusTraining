package com.company.nexus.simHttp.model;

import com.company.nexus.util.FactoryCreation;

import java.io.Serializable;

/**
 * Created by WolframAlpha on 23/10/2016.
 */
public class PlayRoom implements Serializable {

    private Long id;

    private String roomName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayRoom playRoom = (PlayRoom) o;

        if (id != null ? !id.equals(playRoom.id) : playRoom.id != null) return false;
        return roomName != null ? roomName.equals(playRoom.roomName) : playRoom.roomName == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (roomName != null ? roomName.hashCode() : 0);
        return result;
    }
}
