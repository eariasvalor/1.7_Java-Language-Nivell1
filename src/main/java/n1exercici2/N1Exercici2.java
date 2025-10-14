package n1exercici2;

public class N1Exercici2 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args){
        Worker worker1 = new Worker("Meryl", "Streep", 150);
        WorkerInHouse worker2 = new WorkerInHouse("Audrey", "Hepburn", 450);
        WorkerOnline worker3 = new WorkerOnline("Rita", "Hayworth", 521);

        worker1.oldMethod();
        worker2.unusedMethod();
        worker3.absurdMethod();

    }

}
