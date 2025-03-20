public abstract class Title {

    private String title;
    private String literatureType;
    protected int copies;
    protected double rate;

    public Title(String title, String literatureType, int copies) {

        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;

        this.rate = convertLiteratureType();
    }

    public double calculateRoyalty() {

        return calculatePoints() * 0.067574;
    }

    protected abstract double calculatePoints();

    protected double convertLiteratureType() {

        switch(literatureType) {
            case "BI", "TE":
                rate = 3;
                break;

            case "LYRIK":
                rate = 6;

            case "SKØN":
                rate = 1.7;
                break;

            case "FAG":
                rate = 1;

            default:
                return 0;

        }
        return rate;
    }
}
