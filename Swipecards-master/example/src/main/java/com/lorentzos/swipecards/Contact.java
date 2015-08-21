package com.lorentzos.swipecards;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 7/6/2015.
 */
public class Contact {

    private String _name, _phone, _email,_address;
    private Uri _imageURI;
    private int _id;
    List<Contact> Contacts = new ArrayList<Contact>();

    public Contact(int id, String name, String phone, String email, Uri imageURI){
        _id = id;
        _name = name;
        _phone = phone;
        _email = email;
        _imageURI = imageURI;

    }
    public int getId(){ return _id;}
    public String getName(){return _name;}
    public String getPhone(){
        return _phone;
    }
    public String getEmail(){
        return _email;
    }
    public Uri getImageURI() { return _imageURI;}




}
