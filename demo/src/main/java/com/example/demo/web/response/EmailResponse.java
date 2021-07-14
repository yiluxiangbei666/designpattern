package com.example.demo.web.response;


public class EmailResponse {
    private Boolean isName;
    private String isEmail;

    public EmailResponse(Boolean isName, String isEmail) {
        this.isName = isName;
        this.isEmail = isEmail;
    }

    public Boolean getIsName() {
        return isName;
    }

    public void setIsName(Boolean isName) {
        this.isName = isName;
    }

    public String getIsEmail() {
        return isEmail;
    }

    public void setIsEmail(String isEmail) {
        this.isEmail = isEmail;
    }
}
