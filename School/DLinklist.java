
public class DLinklist
{
    public Dnode start;
    public Dnode ultimo;
    String name;
    int count = 0;
    
    public DLinklist() {
        this.start = null;
        count = 1;
    }
    
    public void print() {
        Dnode temp = start;
        int n = 1;
        while (temp != null) {
            System.out.println(n+"- "+temp.name);
            temp = temp.next; n++;
        }
    }
    public void printrv() {
        Dnode temp = start;
        int n = 1;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp.next != null) {
            System.out.println(n+"- "+temp.name);
            temp = temp.prev; n++;
        }
        System.out.println(n+"- "+temp.name);
    }
    
    public void add(String m) {
        Dnode end = new Dnode(m);
        end.index = count;
        
        if(start == null)
        {
            start = end;
            ultimo = end;
        }else
        {
            Dnode temp = start;
            
            ultimo = end;
            
            temp.next = end;
            count++;
            System.out.println(m+" was added");
        }
    }
}
