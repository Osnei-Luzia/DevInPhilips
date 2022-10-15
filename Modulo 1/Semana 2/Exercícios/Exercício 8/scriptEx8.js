let primos = "";
let quantidade = 0;
for (let cont1 = 0; cont1 < 1001; cont1++) {
    let check = 0;
    for (let cont2 = 0; cont2 <= cont1; cont2++) {
        cont1 % cont2 == 0?
            check++ : ""
    }
    if (check == 2) {
        primos += `${cont1} `
        quantidade++
    }
}
console.log(`${primos}\nExistem ${quantidade} números primos entre 0 e 1000`)
alert(`${primos}\nExistem ${quantidade} números primos entre 0 e 1000`)