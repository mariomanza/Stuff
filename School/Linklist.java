
 public class Linklist
{
    public Node first;
    public int count;
    
    public Linklist() {
        first = new Node(null);
        count = 1;
    }
    
    public void print() {
        Node temp = first;
        while(temp.next != null) {
            temp = temp.next;
            System.out.println(temp.index +"- "+temp.name);
        }
    }
    
    public void addfirst(String m) {
        Node end = new Node(m);
        Node temp = first;
        temp.next = end;
        count++; ckindex();
        System.out.println(m+" was added at the beginning");
    }
    
    public void add(String m) {
        Node end = new Node(m);
        end.index = count;
        Node temp = first;
        
         while(temp.next !=null){
             temp = temp.next;
        }
        temp.next = end;
        count++;
        System.out.println(m+" was added");
    }
    
    public void add(String m, int index) {
        Node end = new Node(m);
        end.index = index;
        Node temp = first;
        int step;
        if (index>count || index<1) {
            System.out.println("ERR-Index out of bounds");
        } else {
            step = 1;
            while(step<index) {
                temp = temp.next;
                step++;
            }
            end.next = temp.next;
            temp.next = end;
            count++; ckindex();
            System.out.println(m+" was added at "+index);
        }
    }
    
    public void delete(String m) {
        Node temp = first;
          while(temp.next != null) {
              if (temp.next.name != m) {
                  temp = temp.next;
              } else {
                  temp.next = temp.next.next;
              }
          }
        ckindex();
    }
    
    public void delete(int index) {
        Node temp = first;
        int step;
        if(index>count || index<1){
            System.out.println("ERR-Index out of bounds");
        } else {
            step = 0;
            while(step<index-1){
                temp = temp.next;
                step++;
            }
            temp.next = temp.next.next;
            System.out.println("Student "+index+" was removed");
            count--;
        }
        ckindex();
    }
    
    public void ckindex() {
        Node temp = first;
        for (int i=1;i<count;i++) {
            temp = temp.next;
            temp.index = i;
        }
    }
}