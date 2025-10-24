package org.abb_tech.lesson4.enums;

public enum Month {
    JANUARY(1,31),FEBRUARY(2,30),MARCH(3,31),APRIL(4,30),MAY(5,31),JUNE(6,30),JULY(7,31);

    int monthOrder;
    int dayCount;
    Month(int monthOrder,int dayCount){
        this.monthOrder = monthOrder;
        this.dayCount = dayCount;
    }

    public int getMonthOrder(){
        return  monthOrder;
    }

    public int getDayCount(){
        return  dayCount;
    }
}
