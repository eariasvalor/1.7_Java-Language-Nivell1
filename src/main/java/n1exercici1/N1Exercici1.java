package n1exercici1;

import java.util.Arrays;
import java.util.List;

public class N1Exercici1 {
    public static void main(String[] args){
        Worker worker1 = new Worker("John", "Wayne", 45);
        WorkerOnline worker2 = new WorkerOnline("Clint", "Eastwood", 30);
        WorkerInHouse worker3 = new WorkerInHouse("Henry", "Fonda", 50);

        int monthHours = 78;

        List<Worker> workers = Arrays.asList(worker1, worker2, worker3);
        for (Worker w : workers) {
            double salary = w.calculateSalary(monthHours);
            System.out.printf(w.getName() + " " + w.getSurname() + " -> " + salary +"\n");
        }

    }
}
