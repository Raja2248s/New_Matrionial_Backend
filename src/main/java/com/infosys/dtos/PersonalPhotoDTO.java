package com.infosys.dtos;

public class PersonalPhotoDTO {
    private int rid;
    private String photograph;

    public PersonalPhotoDTO(int rid, String photograph) {
        this.rid = rid;
        this.photograph = photograph;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getPhotograph() {
        return photograph;
    }
    
   
    
    public void setPhotograph(String photograph) {
        this.photograph = photograph;
    }
}
