package whatnot;

public class KStacks {
    public static void main(String[] args) {

        KStacks kStacks = new KStacks();

        kStacks.implementKStacks();
    }

    private void implementKStacks() {
        push(1, 1);
        push(1, 1);
        push(1, 1);
        pop(2);


    }

    private int nextIndex[] = new int[10];
    private int top[] = new int[3];
    private int dataStack[] = new int[10];
    private int nextAvailable = 0;

    private void push(int element, int stack) {

        for (int i = 0; i <= nextAvailable; i++) {
            dataStack[i] = element;
        }



    }

    private void pop(int stack) {
    }
}
