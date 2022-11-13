const retornoEmpresa1 = new Promise((resolve, reject) =>
    setTimeout(resolve, Math.random()*5000, "Empresa 1")); // 5 segundos
const retornoEmpresa2 = new Promise((resolve, reject) =>
    setTimeout(resolve, Math.random()*5000, "Empresa 2")); // 3 segundos

Promise.race([retornoEmpresa1, retornoEmpresa2])
    .then((teste) => console.log(teste))
    .catch(() => console.log("Falha"));