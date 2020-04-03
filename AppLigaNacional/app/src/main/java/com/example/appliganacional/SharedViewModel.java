package com.example.appliganacional;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class SharedViewModel extends ViewModel{
    private final MutableLiveData message = new MutableLiveData();

    public void setMessage(String msg){
        message.setValue(msg);
    }

    public MutableLiveData getMessage() {
        return message;
    }
}
