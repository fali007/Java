public class motherBoard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bins;

    public motherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bins){
        this.model=model;
        this.manufacturer=manufacturer;
        this.ramSlots=ramSlots;
        this.cardSlots=cardSlots;
        this.bins=bins;
    }
    public void loadProgramme(String programmeName){
        System.out.println("Programme " + programmeName + " is now loading");
    }

    public String getModel() { return model; }
    public void setModel(String model){this.model=model;}
    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer){this.manufacturer=manufacturer;}
    public int getRamSlots() { return ramSlots; }
    public void setRamSlots(int ramSlots){this.ramSlots=ramSlots;}
    public int getCardSlots() { return cardSlots; }
    public void setCardSlots(int cardSlots){this.cardSlots=cardSlots;}
    public String getBins() { return bins; }
    public void setBins(String bins){this.bins=bins;}
}
