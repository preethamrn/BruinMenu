package zhou.allen.bruinmenu;

public class Hall {
    private String mealTime;
    private String item;
    private int id;

    public Hall(String mt, String n, int i) {
        mealTime = mt;
        item = n;
        id = i;
    }

    public String getItem() {
        return item;
    }

    public String getMealTime() {
        return mealTime;
    }

    public int getId() {
        return id;
    }
}
