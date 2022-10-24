const somar = (...args) => {
    let result = 0;
    for(let cont=0;cont<args.length;cont++){
        result += args[cont]
    }
    return result;
}
console.log(somar(1,2,3,4))