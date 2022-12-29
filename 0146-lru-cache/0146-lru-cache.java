class LRUCache {

    
    class Node{
        Node prev;
        Node next;
        int val;
        int key;
        Node(int _key,int _val){
            key = _key;
            val = _val;
        }
    }
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    int cap ;
    Map<Integer,Node> mp = new HashMap<>();
    private void remove(Node node){
        mp.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    private void insert(Node node){
        mp.put(node.key,node);
        Node headNext = head.next;
        head.next = node;
        node.prev = head;        
        headNext.prev = node;
        node.next = headNext;
    }
    
    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(mp.containsKey(key)){
            Node node = mp.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){
            remove(mp.get(key));
        }
        if(mp.size()==cap){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */