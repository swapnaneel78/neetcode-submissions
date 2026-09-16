class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        let map=new Map();
        let result=[];
       for(let i=0;i<strs.length;i++){
        let univer=strs[i].split("").sort().join("")
        if(map.has(univer)){
            map.set(univer,[...map.get(univer),strs[i]])
        }else{
            map.set(univer,[strs[i]])
        }
       }

       for(let [key,value] of map){
         result.push(value)
       }

       return result;

    }
}
