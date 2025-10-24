package org.abb_tech.lesson4.enums;

public enum DayOfWeek {
    SUNDAY(7,false),MONDAY(1,false),TUESDAY(2,false)
    ,WEDNESDAY(3,false),THURSDAY(4,false)
    ,FRIDAY(5,false),SATURDAY(6,true);
    int indexOfDay;
    boolean isWeekend;

    DayOfWeek(int indexOfDay,boolean isWeekend){
        this.indexOfDay = indexOfDay;
        this.isWeekend = isWeekend;
    }

    public int getIndexOfDay(){
        return  indexOfDay;
    }

    public boolean getIsWeekend(){
        return isWeekend;
    }
}
