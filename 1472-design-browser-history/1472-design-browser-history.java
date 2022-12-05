class BrowserHistory {
    String[] arr;
    int pre,right;
    public BrowserHistory(String homepage) {
        arr = new String[5000];
        int pre = 0;
        int right = 0;
        arr[pre] = homepage;
    }
    
    public void visit(String url) {
        pre++;
        arr[pre] = url;
        right = pre;
    }
    
    public String back(int steps) {
        pre = Math.max(0,pre-steps);
        return arr[pre];
    }
    
    public String forward(int steps) {
        pre = Math.min(right,pre+steps);
        return arr[pre];
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */