package Activities;

public class Wedding {
    private String localDate;
    private String venue;
    private Couple couple;

    public Wedding(Couple couple, String localDate, String venue){
        this.couple = couple;
        this.localDate = localDate;
        this.venue = venue;
    }

    public Couple getCouple(){
        return couple;
    }
    public String getLocalDate(){
        return localDate;
    }
    public String getVenue(){
        return venue;
    }
}
