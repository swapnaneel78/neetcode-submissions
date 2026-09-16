class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s) {
        let stack=[];
        let map={
            ')':'(',
            '}':"{",
            ']':'['
        }
        
        for(let i=0;i<s.length;i++){
            let char=s.charAt(i)
            if(map[char]){
               let number= stack.pop()
               if(map[char]!=number) return false
                
            }else{
                stack.push(char)
            }
        }
        return stack.length==0;
    }
}
