package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        if(monthNumber>12 || monthNumber<1){
            System.out.println( "Wrong month number");
        } else if (monthNumber>=3 && monthNumber<=5) {
            System.out.println("Spring");
        } else if (monthNumber>=6 && monthNumber<=8) {
            System.out.println("Summer");
        } else if (monthNumber>=9 && monthNumber<=11) {
            System.out.println("Autumn");
        }else {
            System.out.println("Winter");
        }
    }
}
