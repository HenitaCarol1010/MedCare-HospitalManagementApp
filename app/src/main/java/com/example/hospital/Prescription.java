package com.example.hospital;


public class Prescription  {

    String medname,pudate, pid, presid, runsout;
    int perDay, days;
    String pickedUp;

    public Prescription(String medname, int perDay, int days, String pid, String presid,String pickedUp, String runsout, String pudate) {
        this.medname = medname;
        this.perDay = perDay;
        this.days = days;
        this.pickedUp = pickedUp;
        this.pid = pid;
        this.runsout = runsout;
        this.pudate = pudate;
        this.presid = presid;
    }



}
