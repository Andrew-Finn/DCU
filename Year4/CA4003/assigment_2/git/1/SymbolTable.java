package ccal;

import java.util.*;

public class SymbolTable {
    String marker = " $ ";
    HashMap<String, LinkedList<SymbolTableEntry>> hashMap;
    Stack<String> stack;

    public SymbolTable() {
        this.hashMap = new HashMap<>();
        this.stack = new Stack<>();
        this.stack.push(marker);
    }

    public SymbolTableEntry get(String id) {
        if (hashMap.containsKey(id)) {
            LinkedList<SymbolTableEntry> linkLst = hashMap.get(id);
            for (SymbolTableEntry entry : linkLst) {
                if (entry.id.equals(id)) {
                    return entry;
                }
            }
        }
        return new SymbolTableEntry(null, null, null);
    }

    public void put(String id, String type, String scope) {
        SymbolTableEntry entry = new SymbolTableEntry(id, type, scope);

        stack.add(id);

        if (!hashMap.containsKey(id)) {
            LinkedList<SymbolTableEntry> linkLst = new LinkedList<>(List.of(entry));
            hashMap.put(id, linkLst);
        } else {
            LinkedList<SymbolTableEntry> linkLst = hashMap.get(id);
            linkLst.addFirst(entry);
        }
    }

    public void openScope() {
        stack.add(marker);
    }

    public void printStack() {
        System.out.println(Arrays.toString(this.stack.toArray()));
    }

    public void printHashMap() {
        System.out.println(hashMap.toString());
    }
}