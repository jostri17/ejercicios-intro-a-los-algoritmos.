
/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha
{
  private int day;
  private int month;
  private int year;

 public Fecha( int day, int month, int year){
  assert fechaValida( day, month, year): " la fecha es invalida";
 this.day = day;
 this.month = month;
 this.year = year;
}
 private boolean  fechaValida(int day, int month, int year){
 return true;
}
 public int getDay(){
    return day;
    }
 public int getMonth(){
    return month;
    }
 public int getYear(){
    return year;
    }
 public void setDay(int day){
    this.day = day;
    }
    public void setMonth(int month){
    this.month = month;
}
public void setYear(int year){
    this.year = year;
}
public String toString(){
return this.day + "/" + this.month + "/" + this.year;
}
}