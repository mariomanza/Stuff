
public class CLinklist
{
    public Cnode nc;
    
    public CLinklist() {
        nc = new Cnode(null);
        nc.next = nc;
    }
    
     public void print() {
         Cnode temp = nc;
         int i = 1;
         while (temp.next != nc) {
             System.out.println(i+"- "+temp.next.name);
             temp = temp.next;
             i++;
         }
     }
     
     public void add(String m) {
         Cnode in = new Cnode(m);
         Cnode temp = nc;
         while (temp.next != nc) {
             temp = temp.next;
         }
         in.next = nc;
         temp.next = in;
         System.out.println(m+" was added");
     }
     
     public void addfirst(String m) {
         Cnode in = new Cnode(m);
         Cnode temp = nc;
         in.next = temp.next;
         temp.next = in;
     }
     
     public void delete(int n) {
         Cnode temp = nc;
         for (int i=0; i<n-1;i++) {
             temp = temp.next;
         }
         String m = temp.next.name;
         temp.next = temp.next.next;
         System.out.println(m+" was deleted");
     }
}
