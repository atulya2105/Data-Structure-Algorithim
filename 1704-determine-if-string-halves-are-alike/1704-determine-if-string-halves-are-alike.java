class Solution {
    public boolean halvesAreAlike(String s) {
        String str = s.toLowerCase();
        int cnt = 0;
        int n = str.length();
        if(n==0) return true;
        String a = "";
        String b = "";
        for(int i = 0;i<str.length();i++){
            if(cnt<n/2){
                a += str.charAt(i);
                cnt++;
            }else{
                b += str.charAt(i);
            }
        }
        System.out.print(a +" "+b);
        int x = 0;
        int y = 0;
        for(int i = 0;i<a.length();i++){
            char ch = b.charAt(i);
            if(ch=='a' ||ch=='e'|| ch == 'i' || ch=='o' || ch=='u'||ch=='A'||ch=='E'||ch=='O' || ch=='I' || ch=='U'){
                x++;
            }
             ch = a.charAt(i);
            if(ch=='a'||ch=='e'|| ch == 'i' || ch=='o' || ch=='u'||ch=='A'||ch=='E'||ch=='O' || ch=='I' || ch=='U'){
                y++;
            }
        }
        if(x==y) return true;
        
        return false;
    }
}