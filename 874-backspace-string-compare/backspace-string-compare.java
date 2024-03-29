class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) != '#'){
                stack1.push(s.charAt(i));
            }else{
                if(!stack1.empty())
                stack1.pop();
            }
        }
        for(int i = 0; i< t.length(); i++){
            if(t.charAt(i) != '#'){
                stack2.push(t.charAt(i));
            }else{
                if(!stack2.empty())

                stack2.pop();
            }
        }

        if(stack1.size() != stack2.size()){
            return false;
        }else {
            while(!stack1.empty() && !stack2.empty()){


                if(stack1.pop() != stack2.pop())
                    return false;                
            }
        }
          return true;  
    }
}