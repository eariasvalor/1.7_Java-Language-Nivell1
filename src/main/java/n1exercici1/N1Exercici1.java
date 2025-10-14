package n1exercici1;

public class N1Exercici1 {
    public static void main(String[] args){
        Worker worker1 = new Worker("John", "Wayne", 45);
        WorkerOnline worker2 = new WorkerOnline("Clint", "Eastwood", 30);
        WorkerInHouse worker3 = new WorkerInHouse("Henry", "Fonda", 50);

        int monthHours = 78;

        System.out.println("Base worker: " + worker1.calculateSalary(monthHours));
        System.out.println("Online worker: " + worker2.calculateSalary(monthHours));
        System.out.println("In house worker: " + worker3.calculateSalary(monthHours));



    }
}
