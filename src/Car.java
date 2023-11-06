public class Car {
    private String nameOfCar;
    private int yearOf ;
    private int price;

    public Car(){}

    public Car (String nameOfCar, int yearOf, int price){
        this.nameOfCar  = nameOfCar  ;
        this.yearOf  = yearOf ;
        this.price = price ;
    }

    public String getNameOfUniversity (){
        return nameOfCar  ;
    }

    public void setNameOfUniversity(){
        this .nameOfCar  = nameOfCar  ;
    }

    public int  getYearOf   (){
        return yearOf  ;
    }

    public void setYearOf   (){
        this .yearOf = yearOf ;
    }

    public int getPrice  (){
        return price   ;
    }

    public void setPrice  (){
        this .price  = price   ;
    }

}
