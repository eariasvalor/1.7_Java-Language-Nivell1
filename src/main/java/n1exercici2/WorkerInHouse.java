package n1exercici2;

public class WorkerInHouse extends Worker {
    private static final double GASOLINE_MONTHLY_EXPENSE = 45.0;

    public WorkerInHouse(String name, String surname, double priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public double calculateSalary(double hours) {
        double result = (hours * super.getPriceHour()) + GASOLINE_MONTHLY_EXPENSE;

        return result;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
