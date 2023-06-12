package Day5;

public class HeapStack {
    int instanceVariable; // inside a heap

    // First, there is allocated RAM memory for Stack and Heap
    // Heap -> String pool
    // Stack -> Inside a stack we store names for variables
    // using variable name we point to address in Heap


    public static void main(String[] args) {
        int localVariable = 1; // are stored inside a Stack

        // The same value pointed for both from String pool
        String string1 = "word"; // literal way, inside String pool
        String string2 = "word"; // literal way, inside String pool
        //
        String string3 = new String("word"); //

    }


}
