const palindrome = (string) => {
    let check = true
    for(let cont1 = 0, cont2 = string.length-1;cont1<string.length;cont1++,cont2--){
        string[cont1]==string[cont2]?
        "":check = false;
    }
    return check
}
const frase = "osso"
console.log(palindrome(frase))