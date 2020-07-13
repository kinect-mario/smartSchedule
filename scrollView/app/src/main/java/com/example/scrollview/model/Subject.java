package com.example.scrollview.modal;

public class Subject {
    private String code;
    private String name;
    private  String profName;
    private String number;
    private String emailID;
    private String profileURL;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getProfName() {
        return profName;
    }

    public String getNumber() {
        return number;
    }

    public String getEmailID() {
        return emailID;
    }

    public String getProfileURL() {
        return profileURL;
    }
    public Subject()
    {
        code = "MIN 106";
        name="Engineering Thermodynamics";
        profName = "Dhananshri M joglekar";


    }



    public Subject(String code, String name, String profName, String number, String emailID, String profileURL) {
        this.code = code;
        this.name = name;
        this.profName = profName;
        this.number = number;
        this.emailID = emailID;
        this.profileURL = profileURL;
    }

}
