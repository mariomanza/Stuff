
public class CDLinklist
{
    public CDnode nc;
    
    public CDLinklist() {
        nc = new CDnode(null);
        nc.next = nc;
        nc.prev = nc;
    }
    
    public void print() {
         CDnode temp = nc;
         int i = 1;
         while (temp.next != nc) {
             System.out.println(i+"- "+temp.next.name);
             temp = temp.next;
             i++;
         }
    }
     
    public void add(String m) {
         CDnode in = new CDnode(m);
         CDnode temp = nc;
         while (temp.next != nc) {
             temp = temp.next;
         }
         in.next = nc;
         in.prev = temp;
         temp.next = in;
         System.out.println(m+" was added");
     }
     
     public void addfirst(String m) {
         CDnode in = new CDnode(m);
         CDnode temp = nc;
         in.next = temp.next;
         in.prev = nc;
         temp.next = in;
     }
     
     public void delete(int n) {
         CDnode temp = nc;
         for (int i=0; i<n-1;i++) {
             temp = temp.next;
         }
         String m = temp.next.name;
         temp.next = temp.next.next;
         temp.prev = temp.prev.prev;
         System.out.println(m+" was deleted");
     }
}
