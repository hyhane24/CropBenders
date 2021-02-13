package hi;

import java.util.Random;

public class Plot {

    private String[] plot;
    private int[] waterLevels;
    private int day;
    private int waterToday;
    private int waterLimit = 6;
    private int additionalLandRows;
    private final int landRowLimit = 5;
    private int[] fertilizerlLevels = new int[100];
<<<<<<< HEAD
    private int plotNumber;

    private String[] types = {"Mature plant", "Seed", "Immature plant", "carrot", "flower", "watermelon", "cabbage", "strawberry"};
=======
    private String[] types = {"Mature plant", "Seed", "Immature plant"};
>>>>>>> 6e9a3e6893b6b0366225dd640b4310ee4b48c5aa

    public Plot() {
        this.plot = this.randomizePlot();
        this.day = 0;
        this.waterLevels = this.createWaterLevels();
        this.waterToday = 0;
        this.additionalLandRows = 0;
<<<<<<< HEAD
        this.plotNumber = 50;
=======
>>>>>>> 6e9a3e6893b6b0366225dd640b4310ee4b48c5aa
    }

    public String[] randomizePlot() {
        String[] newone = new String[100];
        for (int i = 0; i < newone.length; i++) {
            Random rand = new Random();
            newone[i] = this.types[rand.nextInt(3)];
        }
        for (int j = 0; j < fertilizerlLevels.length; j++) {
            fertilizerlLevels[j] = 0;
        }
        return newone;
    }

    public int[] createWaterLevels() {
        int[] waterLevels = new int[100];
        for (int j = 0; j < waterLevels.length; j++) {
            waterLevels[j] = 0;
        }
        return waterLevels;
    }


    public void waterPlot(int index, int amt, String type) {
        if (type == "water") {
            this.waterLevels[index] = this.waterLevels[index] + amt;
            if (this.waterLevels[index] == 10) {
                this.plot[index] = "Dead Plant";
                this.waterLevels[index] = 10;
                return;
            }
        } else if (type == "drought") {
            this.waterLevels[index] = this.waterLevels[index] - amt;
            if (this.waterLevels[index] <  0) {
                this.plot[index] = "Dead Plant";
                this.waterLevels[index] = 0;
                return;
            }
        } else {
            if (waterToday >= waterLimit) {
                AlertBox.displayAlert("Error",
                        "You have exceeded the amount you can water today. Wait until tomorrow.");
                return;
            }
            this.waterLevels[index] = this.waterLevels[index] + amt;
            waterToday++;
        }
    }

    public void advanceADay() {
        this.day += 1;
        this.waterToday = 0;
        for (int j = 0; j < fertilizerlLevels.length; j++) {
<<<<<<< HEAD
            if (this.plot[j].contains("Seed") || this.plot[j].equals("Seed+P")) {
                if (this.plot[j].contains("+P") && getFertilizerLevel(j) == 0) {
=======
            if (this.plot[j].equals("Seed") || this.plot[j].equals("Seed+P")) {
                if (this.plot[j].equals("Seed+P") && getFertilizerLevel(j) == 0) {
>>>>>>> 6e9a3e6893b6b0366225dd640b4310ee4b48c5aa
                    this.plot[j] = "Immature plant+P";
                } else if (this.plot[j].contains("Seed") && getFertilizerLevel(j) == 0){
                    this.plot[j] = "Immature plant";
                }
                if (this.plot[j].contains("+P") && getFertilizerLevel(j) > 0) {
                    this.plot[j] = "Mature plant+P";
                } else if (this.plot[j].contains("Seed") && getFertilizerLevel(j) > 0){
                    this.plot[j] = "Mature plant";
                }
            } else if (this.plot[j].equals("Immature plant") || this.plot[j].equals("Immature plant+P")) {
                if (this.plot[j].equals("Immature plant+P")) {
                    this.plot[j] = "Mature plant+P";
                } else if (this.plot[j].equals("Immature plant")){
                    this.plot[j] = "Mature plant";
                }
            }
            if (getFertilizerLevel(j) > 0) {
                fertilizerlLevels[j]--;
            }
        }
    }

    public void addLand() {
        if (additionalLandRows >= landRowLimit) {
            AlertBox.displayAlert("Error",
                    "You have maxed out the amount of plots you can have in this farm.");
            return;
        }
        additionalLandRows++;
<<<<<<< HEAD
        plotNumber += 10;

=======
>>>>>>> 6e9a3e6893b6b0366225dd640b4310ee4b48c5aa
    }

    public void fertilize(int index) {
        if (fertilizerlLevels[index] < 3) {
            fertilizerlLevels[index]++;
        }
    }
    public int getFertilizerLevel(int index) {
        return fertilizerlLevels[index];
    }

    public int[] getWaterLevels() {
        return this.waterLevels;
    }

    public String[] getPlot() {
        return plot;
    }

    public void setPlot(String[] plot, int index, String plant) {
        this.plot[index] = plant;
<<<<<<< HEAD

=======
>>>>>>> 6e9a3e6893b6b0366225dd640b4310ee4b48c5aa
    }

    public void setWaterLimit(int n) {
        waterLimit = n;
    }

    public int getAdditionalLandRows() {
        return this.additionalLandRows;
    }

    public int getDay() {
        return this.day;
<<<<<<< HEAD
    }
    public int getPlotNumber() {
        return plotNumber;
    }

}
=======
    }

}
>>>>>>> 6e9a3e6893b6b0366225dd640b4310ee4b48c5aa
