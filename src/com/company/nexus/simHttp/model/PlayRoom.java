package com.company.nexus.simHttp.model;

import com.company.nexus.util.FactoryCreation;

import java.io.Serializable;

/**
 * Created by WolframAlpha on 23/10/2016.
 */
public class PlayRoom implements Serializable {

    private final Long id; //required

    private final String roomName; //required

    private PlayRoom(PlayRoomBuilder builder){
        this.id = builder.id;
        this.roomName = builder.roomName;
    }

    public static final class PlayRoomBuilder{

        private final Long id;

        private final String roomName;

        public PlayRoomBuilder(Long id,String roomName){
            this.id = id;
            this.roomName = roomName;
        }

        public PlayRoom build(){
            return new PlayRoom(this);
        }
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

    @Override
    public String toString() {
        return "PlayRoom{" +
                "id=" + id +
                ", roomName='" + roomName + '\'' +
                '}';
    }
}
