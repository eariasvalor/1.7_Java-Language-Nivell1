package n1exercici2;

public class WorkerOnline extends Worker {
    private static final double INTERNET_MONTHLY_RATE = 30.5;

    public WorkerOnline(String name, String surname, double priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public double calculateSalary(double hours) {
        double result = (hours * super.getPriceHour()) + INTERNET_MONTHLY_RATE;

        return result;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
