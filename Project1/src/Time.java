public class Time {
    //Default = 0
    private int second = 0;
    private int minute = 0;
    private int hour = 0;

    public Time(){}

    //Constructor that ini
    public Time(int hour, int minute, int second){
        setTime(hour, minute, second);
    }

    //GET
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    //SET with validation
    public void setHour(int hour) {
        if(hour < 0 || hour > 24){
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if(minute < 0 || minute > 59){
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if(second < 0 || second > 59){
            throw new IllegalArgumentException("Second must be between 0 and 59.");
        }
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }



    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

    /* Advance the tiem by one second 
     * Returns the current object to allow for method changing
     * Return the current time object
    */
    
    public Time nextSecond(){
        this.second++;
        if(this.second == 60){
            this.second=0;
            this.minute++;

            if(minute==60){
                this.minute=0;
                this.hour++;

                if(hour==24){
                    this.hour=0;
                }
            }
        }
        return this;

    }
}
