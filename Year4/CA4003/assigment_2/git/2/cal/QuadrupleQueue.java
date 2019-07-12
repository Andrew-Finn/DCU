package cal;

import java.util.ArrayList;
import java.util.List;

public class QuadrupleQueue {
    private int tmpCounter;
    private final List<Quadruple> quadQueue;

    public QuadrupleQueue() {
        this.tmpCounter = 0;
        this.quadQueue = new ArrayList<>();
    }

    public void add(String op, String arg1, String arg2, String result) {
        this.quadQueue.add(new Quadruple(op, arg1, arg2, result));
        this.tmpCounter++;
    }

    public void add(String op, String arg1, String result) {
        this.quadQueue.add(new Quadruple(op, arg1, result));
        this.tmpCounter++;
    }

    public void add(String op, String result) {
        this.quadQueue.add(0, new Quadruple(op, "t" + tmpCounter, result));
        this.tmpCounter++;
    }

    public void clear() {
        tmpCounter = 0;
        quadQueue.clear();
    }

    public String genIRCode() {
        StringBuilder codeBlock = new StringBuilder();
        for (Quadruple quadruple : quadQueue) {
            codeBlock.append(quadruple.toIRCode()).append("\n");
        }

        return codeBlock.toString();
    }

    public int getTmpCounter() {
        tmpCounter++;
        return this.tmpCounter;
    }

    @Override
    public String toString() {
        return "QuadrupleQueue{" +
                "tmpCounter=" + tmpCounter +
                ", quadQueue=" + quadQueue +
                '}';
    }

    public static void main(String[] args) {
        // from page 7 of notes on intermediate representation
        QuadrupleQueue q = new QuadrupleQueue();

        q.add("minus", "c", "t1");
        q.add("*", "b", "t1", "t2");
        q.add("minus", "c", "t3");
        q.add("*", "b", "t3", "t4");
        q.add("+", "t2", "t4", "t5");
        q.add("=", "t5","a");

        System.out.println(q.genIRCode());
        System.out.println(q.getTmpCounter());

    }
}
