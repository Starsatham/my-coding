import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;
class dateAndTime {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println(" enter the date in coorect format");
    String a=s.nextLine();
    DateTimeFormatter dt= DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate date=LocalDate.parse(a,dt);
    LocalDate cdate=LocalDate.now();
    if(date.isBefore(cdate)){
        System.out.println("before....");
    }else if(date.isAfter(cdate)){
        System.out.println("after.....");
    } else{
         System.out.println(" presnet....");
    }
    
}
}
