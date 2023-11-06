import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        University university1 = new University("Ala-Too", "Kyrgyzstan", "Bishkek" );
        University university2 = new University("Manas ", "Kyrgyzstan" ,"Bishkek");
        University university3 = new University("Oshmu" , " Kyrgyzstan", "Osh");
        University [] universities = {university1 , university2, university3 };
        System.out.println( Arrays.toString(universities )  );



        School school1 = new School("Ch.Aitmatov", "Bishkek","jashtyk");
        School school2 = new School("Ch.Aitmatov", "Bishkek","jashtyk");
        School school3 = new School("Ch.Aitmatov", "Bishkek","jashtyk");
        School [] schools = {school1, school2 , school3 };
        System.out.println( Arrays.toString(schools  )  );

        Car car1 = new Car("BMW", 2018, 30000) ;
        Car car2 = new Car("LEXUS", 2015, 250000) ;
        Car car3 = new Car("Toyota", 2018, 30000) ;
        Car  [] cars = {car1, car2, car3};
        System.out.println( Arrays.toString(cars  )  );


    }
}