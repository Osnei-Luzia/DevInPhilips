/*function concatenador(...args) {
    return args.flat();
    console.log(args)
    return args;
}*/

const a = [1, 2, 3]
const b = [4, 5, 6]
const novoArray = (...args) => {
    let result = []
    args.forEach(item => result.push(...item))
    return result;
}
console.log(novoArray(a,b))