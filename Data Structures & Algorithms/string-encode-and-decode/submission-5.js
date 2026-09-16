class Solution {
    encode(strs) {
        let res = "";

        for (let s of strs) {
            res += s.length + "#" + s;
        }

        return res;
    }

    decode(str) {
        let res = [];
        let i = 0;

        while (i < str.length) {
            let j = i;

            // find '#'
            while (str[j] !== '#') j++;

            let length = parseInt(str.substring(i, j));
            let start = j + 1;
            let end = start + length;

            let word = str.substring(start, end);
            res.push(word);

            i = end;
        }

        return res;
    }
}