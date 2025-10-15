package n1exercici2;

public class WorkerInHouse extends Worker {
    private static final double GASOLINE_MONTHLY_EXPENSE = 45.0;

    public WorkerInHouse(String name, String surname, double priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public double calculateSalary(double hours) {
        if(hours <= 0) {
            throw new IllegalArgumentException("Invalid data: number must be greater than 0.");
        }
        double result = (hours * super.getPriceHour()) + GASOLINE_MONTHLY_EXPENSE;

        return result;
    }

    @Deprecated
    public void unusedMethod(){
        System.out.println("This method is not used.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
