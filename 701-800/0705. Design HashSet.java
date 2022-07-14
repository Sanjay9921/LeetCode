class Node{
    int val;
    Node next;
    
    public Node(int key){
        this.val = key;
        this.next = null;
    }
}

class MyHashSet {
    Node head;
    public MyHashSet() {
        head = null;
    }
    
    public void add(int key) {
        if(head==null){
            head = new Node(key);
            return;
        }
        
        boolean containsKey = contains(key);
        if(!containsKey){
            Node p = head;
            while(p.next!=null)
                p = p.next;
            
            p.next = new Node(key);
        }
        
        
    }
    
    public void remove(int key) {
        if(head == null)
            return;
        
        if(head.val == key){
            head = head.next;
            return;
        }
        
        Node p = head;
        while(p.next!=null){
            if(p.next.val == key){
                p.next = p.next.next;
            }
            else{
                p = p.next;
            }
        }
    }
    
    public boolean contains(int key) {
        if(head == null)
            return false;
        
        if(head.val == key)
            return true;
        
        Node p = head;
        while(p.next!=null){
            if(p.next.val == key){
                return true;
            }
            p = p.next;
        }
        
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */