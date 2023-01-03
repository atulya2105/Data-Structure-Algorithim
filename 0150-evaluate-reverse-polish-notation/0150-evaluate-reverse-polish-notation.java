class Solution {
    public int evalRPN(String[] tokens) {
       /* int a ,b;
        Stack<Integer> st = new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                st.add(st.pop()+st.pop());
            }else if(s.equals("/")){
                 a = st.pop();
                b = st.pop();
                st.add(a/b);
            }else if(s.equals("*")){
                a = st.pop();
                 b = st.pop();
                st.add(a*b);
            }else if(s.equals("-")){
                a = st.pop();
                b = st.pop();
                st.add(a-b);
            }else{
                st.add(Integer.parseInt(s));
            }
        }
        return st.pop();*/
         int a,b;
		Stack<Integer> S = new Stack<Integer>();
		for (String s : tokens) {
			if(s.equals("+")) {
				S.add(S.pop()+S.pop());
			}
			else if(s.equals("/")) {
				b = S.pop();
				a = S.pop();
				S.add(a / b);
			}
			else if(s.equals("*")) {
				S.add(S.pop() * S.pop());
			}
			else if(s.equals("-")) {
				b = S.pop();
				a = S.pop();
				S.add(a - b);
			}
			else {
				S.add(Integer.parseInt(s));
			}
		}	
		return S.pop();
    }
}