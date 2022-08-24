package exs_Internet.exercicios_OOP.the_time;

public class Time {
    private int hour; //hour = [0, 23]? -> como implementar?
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString(){ //posso fazer validaçoes no toString?
        return "0"+hour+ ":"+ "0"+minute+ ":" +"0"+second; //como faço pro 0 preceder cada variavel?
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){ //estrutura correta? -> como faço pra formatar o 0 antes dos horarios?
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int nextSecond(){ //melhorar -> tentar desenvolver
        return second++;
    }
    public int previousSecond(){ //melhorar
        return second--;
    }
    // - hour = [0, 23] nos atributos
    // - toString -> ver como formatar o 0 antes das variaveis
    // - setTime -> revisar e reformular
    // - next/previousSecond -> desenvolver e revisar
}
