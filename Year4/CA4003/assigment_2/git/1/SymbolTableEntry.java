package ccal;

public class SymbolTableEntry
{
    public String id;
    public String type;
    public String scope;

    public SymbolTableEntry(String id, String type, String scope) {
        this.id = id;
        this.type = type;
        this.scope = scope;
    }

    public String toString()
    {
        return this.id + ": " + this.type + "|" + this.scope;
    }
}