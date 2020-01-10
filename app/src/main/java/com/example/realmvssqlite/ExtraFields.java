package com.example.realmvssqlite;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

import io.realm.RealmList;
import io.realm.RealmObject;

public class ExtraFields extends RealmObject implements Serializable {

    @SerializedName("phone_number")
    @Expose
    private RealmList<String> phoneNumber = null;
    @SerializedName("email")
    @Expose
    private RealmList<String> email = null;

    public ExtraFields() {

    }

    public RealmList<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(RealmList<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public RealmList<String> getEmail() {
        return email;
    }

    public void setEmail(RealmList<String> email) {
        this.email = email;
    }
}