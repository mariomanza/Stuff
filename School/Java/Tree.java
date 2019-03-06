
public class Tree
{
    Tnode root;
    Tnode pointparent;
    Tnode point;
    Tnode temp;
    public Tree() {
        root = new Tnode(null);
        pointparent = root;
        point = root;
        temp = root;
    }
    
    public void print(Tnode temp) {
        System.out.println(temp.name);
        if(temp.sonl != null) {
            print(temp.sonl);
        }
        if(temp.sonr != null) {
            print(temp.sonr);
        }
    }
    
    public void addl(String m) {
        Tnode in = new Tnode(m);
        temp = point;
        if(temp.sonl == null) {
            temp.sonl = in;
        } else System.out.println("NO disponible");
    }
    
    public void addr(String m) {
        Tnode in = new Tnode(m);
        temp = point;
        if(temp.sonr == null) {
            temp.sonr = in;
        } else System.out.println("NO disponible");
    }
    
    public void change(String m) {
        String old = point.name;
        point.name = m;
        System.out.println("Name changed "+old+" to "+point.name);
    }
    
    public void movel() {
        if(point.sonl != null) {
            pointparent = point;
            point = point.sonl;
        }
        System.out.println(point.name);
    }
    
    public void mover() {
        if(point.sonr != null) {
            pointparent = point;
            point = point.sonr;
        }
        System.out.println(point.name);
    }
    
    public void moveup() {
        point = pointparent;
        pointparent = root;
        System.out.println(point.name);
    }
    
    public void curr() {
        System.out.println(point.name);
    }
    
    public void sons() {
        if(point.sonl != null) {
           System.out.print(point.sonl.name);
        }
        if (point.sonr != null) {
            System.out.print("    "+point.sonr.name);
        }
        System.out.print("\n");
    }
    
    public void parent() {
        System.out.println(pointparent.name);
    }
}
