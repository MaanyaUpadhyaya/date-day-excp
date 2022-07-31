import java.text.SimpleDateFormat; import java.util.*;
class InvalidDayException extends Exception{ InvalidDayException(){
super("Invalid Day"); }
}
class InvalidMonthException extends Exception{ InvalidMonthException(){
super("Invalid Month"); }
}
public class CurrentDate{ int day,month,year;
int a[]={31,28,31,30,31,30,31,31,30,31,30,31}; void createDate()throws Exception {
Scanner sc=new Scanner(System.in); System.out.print("Enter the date: "); day=sc.nextInt(); System.out.print("Enter the month: "); month=sc.nextInt(); System.out.print("Enter the year: "); year=sc.nextInt();
sc.close(); try {
if(month>12 || month<1)
throw new InvalidMonthException();
else if(day>a[month-1] || day<1)
throw new InvalidDayException();
else {
System.out.println("Entered date:
"+day+"/"+month+"/"+year+" is valid");
System.out.println("\nCurrent date is: "+new
SimpleDateFormat("dd/MM/yyyy").format(new Date())); }
}
catch(Exception e) {
System.out.println(e); }
}
public static void main(String[] args)throws Exception {
  
new CurrentDate().createDate(); }
}
