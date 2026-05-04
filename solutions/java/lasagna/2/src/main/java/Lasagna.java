public class Lasagna {
    private int minutesInOven = 40;
    private int preparationTimeInMinutes;
    private int totalTimeInMinutes;

    public int expectedMinutesInOven(){
        return minutesInOven;
    }

    public int remainingMinutesInOven (int minutesTaken){
        return minutesInOven - minutesTaken;
    }

    public int preparationTimeInMinutes (int numberOfLayers){
        return numberOfLayers * 2;
    }

    public int totalTimeInMinutes (int numberOfLayers, int minutesTaken){
        return numberOfLayers*2 + minutesTaken;
    }
}
