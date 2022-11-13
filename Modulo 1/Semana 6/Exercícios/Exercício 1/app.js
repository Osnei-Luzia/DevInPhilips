function sleep(arg){
    return new Promise((resolve) =>{
        setTimeout(() => resolve(arg),3000)
    })
}
const result = sleep(`teste`).then(function(resultado){
    console.log(result)
})


function sleep(valor) {
    return new Promise((resolve, reject) => {
        if(valor){
            resolve(
                setTimeout(()=>{
                    console.log(valor)
                },3000)
            )
        }else{
            reject(
                console.log("Falha")
            )
        }
    })
}
sleep(prompt())