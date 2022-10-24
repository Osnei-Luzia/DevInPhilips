const uneDobraRetorna = (array,...args) =>{
    for(let cont=0;cont<args.length;cont++){
        args[cont] *= 2 
    }
    return [...array,...args]
}

const array = [1,2,3,4,5]
console.log(uneDobraRetorna(array,1,2,3,4))