package com.example.sendmessage.pojo;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by usuario on 29/09/17.
 */

public class Message implements Serializable{
    private String message;
    private String user;

    @Override
    public boolean equals(Object o) {
        boolean result;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message1 = (Message) o;

        result = ((message.equals(message1.message)) &&
        (user.equals(message1.user)));
        return result;
    }


    @Override
    public String toString() {
        return "Message:" +
                "message='" + message + '\'' +
                ", user='" + user + '\'';
    }

    public Message(String message, String user) {
        this.message = message;
        this.user = user;
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
