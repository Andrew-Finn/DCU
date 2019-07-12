package cal;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SymbolTable {

    private final Map<String, String> st;
    private final Stack<String> undoStack;

    public SymbolTable() {
        st = new HashMap<>();
        undoStack = new Stack<>();
    }

    /**
     * This method handles adding identifiers to the symbol table, st
     * and to the undo stack.
     *
     * This method will also call the `purgeScope` method when the visitor leaves scope.
     *
     * @param id String identifier
     * @param type String type of above identifier
     */
    public void put(String id, String type) {
        if (id.equals("ENDBLOCK")) {
            purgeStack();
        } else {
            st.put(id, type);
            undoStack.push(id);
        }
    }

    public String pop() {
        return undoStack.pop();
    }

    public String get(String id) {
        return st.get(id);
    }

    public boolean contains(String id) {
        return st.containsKey(id);
    }

    public void set(String id, String type) {
        st.replace(id, type);
    }

    private void purgeStack() throws EmptyStackException {
        String stackHead;
        do {
            stackHead = undoStack.pop();
            st.remove(stackHead);
            if (undoStack.isEmpty())
                return;
        } while (!stackHead.equals("BEGINBLOCK"));
    }

    @Override
    public String toString() {
        return "SymbolTable{" +
                "\nst=" + st +
                "\nundoStack=" + undoStack +
                "}\n";
    }
}
