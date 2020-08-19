myColor = ["Red", "Green", "White", "Black"];
myColor.join(',');
let getNumber = parseInt(prompt("Number: "));
let str = getNumber.toString();
let result = [str[0]];
for (let x = 1; x < str.length; x++) {
    if ((str[x - 1] % 2 === 0) && (str[x] % 2 === 0)) {
        result.push('-', str[x]);
    } else {
        result.push(str[x]);
    }
}
console.log(result.join(''));


let str1 = 'Tran Hoang Viet';
let UPPER = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
let LOWER = 'abcdefghijklmnopqrstuvwxyz';
let result1 = [];

for(let x=0; x<str1.length; x++)
{
    if(UPPER.indexOf(str1[x]) !== -1)
    {
        result1.push(str1[x].toLowerCase());
    }
    else if(LOWER.indexOf(str1[x]) !== -1)
    {
        result1.push(str1[x].toUpperCase());
    }
    else
    {
        result1.push(str1[x]);
    }
}
console.log(result1.join(''));