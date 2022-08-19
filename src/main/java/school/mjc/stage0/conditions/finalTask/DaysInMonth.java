package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if ((year%4 == 0 && year%100!=0) ||(year%4==0 && year%400==0)){
            if (month>12 ||  month<1){
                System.out.println("invalid date");
            } else if (month==9 || month==11 || month==4 || month==6) {
                System.out.println("30");
            } else if (month==2) {
                System.out.println("29");
            }else {
                System.out.println("31");
            }
        }else {
            if (month>12 ||  month<1){
                System.out.println("invalid date");
            } else if (month==9 || month==11 || month==4 || month==6) {
                System.out.println("30");
            } else if (month==2) {
                System.out.println("28");
            }else {
                System.out.println("31");
            }
        }
    }
}
