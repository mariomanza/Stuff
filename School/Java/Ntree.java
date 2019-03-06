import java.util.*;

public class Ntree
{
    Nnode root;
    Nnode pointparent;
    Nnode point;
    Nnode temp;
    public Ntree() {
        root = new Nnode(50);
        pointparent = root;
        point = root;
        temp = root;
    }
    
    public void inorder(Nnode root) {
        if (root != null) {
            inorder(root.sonl);
            System.out.print(" " + root.data);
            inorder(root.sonr);
        }
    }
    
    public void preorder(Nnode root) {
        if (root != null) {
            System.out.print(" " + root.data);
            preorder(root.sonl);
            preorder(root.sonr);
        }
    }
    
    public void posorder(Nnode root) {
        if (root != null) {
            posorder(root.sonl);
            posorder(root.sonr);
            System.out.print(" " + root.data);
        }
    }
    
    public void lvlorder() {
        if (root == null) {
            return;
        }
        Queue<Nnode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            Nnode node = nodes.remove();
            System.out.print(" " + node.data);
            if (node.sonl != null) {
                nodes.add(node.sonl);
            }
            if (node.sonr!= null) {
                nodes.add(node.sonr);
            }
        }
    }
    
    public Nnode add(Nnode temp, int d) {
        if (temp == null) {
            return new Nnode(d);
        }
 
        if (d < temp.data) {
            temp.sonl = add(temp.sonl, d);
        } else if (d > temp.data) {
            temp.sonr = add(temp.sonr, d);
        } else {
            return temp;
        }
        return temp;
    }
    
    public Nnode delete(Nnode temp, int d) {
        if (temp == null) {
            return null;
        }
 
        if (d == temp.data) {
            if (temp.sonl == null && temp.sonr == null) {
                return null;
            }
            
            if (temp.sonr == null) {
                return temp.sonl;
            }
            if (temp.sonl == null) {
                return temp.sonr;
            }
            
            int smallest = findsmallest(temp.sonr);
            temp.data = smallest;
            temp.sonr = delete(temp.sonr, smallest);
            return temp;
        } 
        if (d < temp.data) {
            temp.sonl = delete(temp.sonl, d);
            return temp;
        }
        temp.sonr = delete(temp.sonr, d);
        return temp;
    }
    
    private int findsmallest(Nnode temp) {
        return temp.sonl == null ? temp.data : findsmallest(temp.sonl);
    }
    
    public void movel() {
        if(point.sonl != null) {
            pointparent = point;
            point = point.sonl;
        }
        System.out.println(point.data);
    }
    
    public void mover() {
        if(point.sonr != null) {
            pointparent = point;
            point = point.sonr;
        }
        System.out.println(point.data);
    }
    
    public void curr() {
        System.out.println(point.data);
    }
    
    public void reset() {
        point = root;
        pointparent = root;
    }
    
    public boolean contains(Nnode temp, int d) {
        if (temp == null) {
            return false;
        }
        if (d == temp.data) {
            return true;
        }
        return d < temp.data
            ? contains(temp.sonl, d)
            : contains(temp.sonr, d);
    }
}
