public class University {
    private String nameOfUniversity;
    private String country;
    private String region;

    public University(){}

    public University(String nameOfUniversity, String country, String region){
        this.nameOfUniversity = nameOfUniversity ;
        this.country = country;
        this.region = region;
    }

    public String getNameOfUniversity (){
        return nameOfUniversity ;
    }

    public void setNameOfUniversity(){
        this .nameOfUniversity = nameOfUniversity ;
    }

    public String getCountry  (){
        return country ;
    }

    public void setCountry  (){
        this .country  = country  ;
    }

    public String getRegion (){
        return region  ;
    }

    public void setRegion (){
        this .region = region  ;
    }


}
