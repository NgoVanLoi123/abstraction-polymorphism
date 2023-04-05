import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Mời bạn nhập tên hàng nhập kho: ");
        String name  =sc.nextLine();
        System.out.println("Tên kho:"+name);
        System.out.println("Mời bạn nhập ngày tháng năm :");
        String a =sc.nextLine();
        LocalDate localDate =LocalDate.parse(a, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println("Ngày tháng năm nhập kho: "+localDate);
        System.out.println("Mời bạn nhập thời gian nhập hàng: ");
        String b=sc.nextLine();
        LocalDateTime dateTime =LocalDateTime.parse(b,DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println("Thời gian nhập hàng là: "+dateTime);
        System.out.println("Mời bạn nhập thời gian: ");
        String c=sc.nextLine();
        LocalTime localtime =LocalTime.parse(c,DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Thời gian:"+localtime);
    }
}