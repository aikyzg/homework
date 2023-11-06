public class School {
    private String nameOfSchool;
    private String city;
    private String village;

    public School(){}

    public School(String nameOfSchool , String city, String village ){
        this.nameOfSchool  = nameOfSchool ;
        this.city = city;
        this.village  = village ;
    }

    public String getNameOfSchool (){
        return nameOfSchool  ;
    }

    public void setNameOfSchool (){
        this .nameOfSchool = nameOfSchool ;
    }

    public String getCity (){
        return city  ;
    }

    public void setCity   (){
        this .city   = city  ;
    }

    public String getVillage  (){
        return village   ;
    }

    public void setVillage  (){
        this .village = village   ;
    }
}
