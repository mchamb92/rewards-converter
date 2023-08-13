public class RewardValue {

    private double cashValue;
    private double milesValue;

    // Cash constructor
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035; // Convert cash to miles
    }

    // Miles constructor
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035; // Convert miles to cash
    }

    // Getter for cash value
    public double getCashValue() {
        return this.cashValue;
    }

    // Getter for miles value
    public double getMilesValue() {
        return this.milesValue;
    }

    public static void main(String[] args) {
        // Testing the class
        RewardValue rewardFromCash = new RewardValue(10.0);
        System.out.println("From $10: " + rewardFromCash.getMilesValue() + " miles");
        System.out.println("From $10: $" + rewardFromCash.getCashValue());

        RewardValue rewardFromMiles = new RewardValue(5000);
        System.out.println("From 5000 miles: $" + rewardFromMiles.getCashValue());
        System.out.println("From 5000 miles: " + rewardFromMiles.getMilesValue() + " miles");
    }
}

