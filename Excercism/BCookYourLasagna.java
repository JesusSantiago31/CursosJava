 //Second program i made on the plataform
public class Lasagna {    
    
    public int expectedMinutesInOven(){
        return 40;
    }
    
    public int remainingMinutesInOven(int x){
        return expectedMinutesInOven() - x;
    }
    
    public int preparationTimeInMinutes(int can){
        return can * 2;
    }
        
    public int totalTimeInMinutes(int la, int ov){
        return preparationTimeInMinutes(la) + ov;
    }
}
