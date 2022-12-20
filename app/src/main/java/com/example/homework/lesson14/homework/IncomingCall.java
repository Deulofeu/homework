package com.example.homework.lesson14.homework;

public class IncomingCall {
    private int idCall;
    private String purposeCall;

    IncomingCall(int idCall, String purposeCall) {
        this.idCall = idCall;
        this.purposeCall = purposeCall;
    }

    public int getIdCall() {
        return idCall;
    }

    public String getPurposeCall() {
        return purposeCall;
    }
}
