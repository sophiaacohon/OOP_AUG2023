/*Time Assignment
 * Made by: Sophia Ann Cohon
 * Date: September 9, 2023
 * Program Description: create a class that allows user to adjust and view the time in 12 and hour format
*/

public class Time {
    private int hour;
    private int minute;
    private int second;
    private boolean meridian; //false = AM, true = PM

    public Time(){

    }

    public Time(int hour, int minute, int second, boolean meridian) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.meridian = meridian;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public boolean isMeridian() {
        return meridian;
    }

    public void setMeridian(boolean meridian) {
        this.meridian = meridian;
    }

    public int advanceTime(int sec){
        //i didnt get to ask about the functionality for this one, sorry sir :(
        int hrToMin = this.hour * 60;
        int minToSec = hrToMin * 60;
        sec = minToSec;
        System.out.println("Time in seconds: " + sec);
        return sec;
    }

    public void tickByHour(){
        int tempHR = this.hour+1;
        if(tempHR >= 24){
            this.hour = 00;
            this.meridian = false; //change to AM
        }
        else if(tempHR == 12 && this.meridian == true){
            this.hour+=1;
            this.meridian = false;
        }
        else if(tempHR == 12 && this.meridian == false){
            this.hour+=1;
            this.meridian = true;
        }
        else{
            this.hour+=1;
        }
        System.out.println("Time increased by 1 hour.");
    }

    public void tickByMinute(){
        int tempMin = this.minute +1;
        if(tempMin >= 60){
            this.minute = 00;
            this.hour += 1;
            if(this.hour >= 24){
                tickByHour();
            }
        }
        else{
            this.minute += 1;
        }
        System.out.println("Time increased by 1 minute.");
    }

    public void tickBySecond(){
        int tempSec = this.second + 1;
        if(tempSec >= 60){
            this.second = 00;
            this.minute += 1;
            if(this.minute >= 60){
                tickByMinute();
                if(this.hour >= 24){
                    tickByHour();
                }
            }
        }
        else{
            this.second += 1;
        }
        System.out.println("Time increased by 1 second.");
    }

    public void display12Hour(){
        if(this.hour>= 13 && this.hour <= 23){
            this.meridian = true;
            this.hour -= 12;
            System.out.println("12 Hour Format: " + this.hour + ":" + this.minute + ":" + this.second + "PM");
        }
        else if(this.hour == 0){
            this.meridian = false;
            this.hour += 12;
            System.out.println("12 Hour Format: " + this.hour + ":" + this.minute + ":" + this.second + "AM");
        }
        else if(this.meridian == true){
            System.out.println("12 Hour Format: " + this.hour + ":" + this.minute + ":" + this.second + "PM");
        }
        else if(this.meridian == false && (this.hour < 12 && this.hour > 0)){
            System.out.println("12 Hour Format: " + this.hour + ":" + this.minute + ":" + this.second + "AM");
        }
        else if(this.meridian == false && this.hour == 12){
            System.out.println("12 Hour Format: " + this.hour + ":" + this.minute + ":" + this.second + "PM");
        }
        else if(this.meridian == true && this.hour ==  12){
            System.out.println("12 Hour Format: " + this.hour + ":" + this.minute + ":" + this.second + "PM");
        }
    }

    public void display24Hour(){
        if(this.hour>= 13 && this.hour <= 23){
            this.meridian = true; //PM
            System.out.println("24 Hour Format: " + this.hour + ":" + this.minute + ":" + this.second);
        }
        else if(this.meridian == false && this.hour == 12){ //if meridian is AM (ex:11am) and hour just became 12,
            this.hour = this.hour - 12;
            this.meridian = true;
            System.out.println("24 Hour Format: " + this.hour + ":" + this.minute + ":" + this.second);
        }
        else if(this.meridian == true && this.hour == 12){ //12PM becomes 00
            this.hour = 0;
            System.out.println("24 Hour Format: " + this.hour + ":" + this.minute + ":" + this.second);
        }
        else if(this.meridian == true && this.hour < 12){ //example: 1PM becomes 13, 11PM becomes 23
            this.hour += 12;
            System.out.println("24 Hour Format: " + this.hour + ":" + this.minute + ":" + this.second);
        }
        else if(this.meridian == false && this.hour < 12){ //1AM to 11AM
            System.out.println("24 Hour Format: " + this.hour + ":" + this.minute + ":" + this.second);
        }
    }

    

    @Override
    public String toString() {
        return "Time [" + hour + ":" + minute + ":" + second + " " + meridian + "]";
    }

    public static void main(String[] args) {
        Time myTime = new Time(3, 56, 59, true);
        System.out.print(myTime);
        if(myTime.meridian == true){
            System.out.println(" PM");
        }
        else{
            System.out.println(" AM");
        }

        myTime.tickBySecond();
        myTime.display12Hour();
        myTime.display24Hour();
        myTime.tickByMinute();
        myTime.display12Hour();
        myTime.display24Hour();
        myTime.tickByHour();
        myTime.display12Hour();
        myTime.display24Hour();
        myTime.tickByMinute();
        myTime.display12Hour();
        myTime.display24Hour();
        myTime.tickByMinute();
        myTime.display12Hour();
        myTime.display24Hour();
    }
}
