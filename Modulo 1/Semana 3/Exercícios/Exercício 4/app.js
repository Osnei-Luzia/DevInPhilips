const mesclaObjeto = (objA,objB) =>{
    const novo = {...objA,...objB}
    return novo;
}
const objetoA = {a: 1, b: 2}
const objetoB = {c: 3, d: 4}
console.log(mesclaObjeto(objetoA,objetoB))


// /*function mesclaObjetos(...args){
//     const {a,b,c,d} = args
//     console.log(args)
// }*/

// const mesclaObjetos = (...args) =>{
//     /*const novo = {
//         a: objA.a,
//         b: objA.b,
//         c: objB.c,
//         d: objB.d
//     }
//     return novo*/
//     console.log(args)
//     // for(let item in args){
//     //     result = {...result,...item}
//     // }

// }

// const objetoA = { a: 1, b: 2 };
// const objetoB = { c: 3, d: 4 };

// let result = {}
// result.forEach(mesclaObjetos(objetoA,objetoB))
// console.log(result)

// //console.log(mesclaObjetos(objetoA, objetoB))
