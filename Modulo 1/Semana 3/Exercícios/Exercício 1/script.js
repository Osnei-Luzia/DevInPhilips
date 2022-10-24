/*function procuraMinMax(valores) {
   if(valores!=null){
      valores.sort((a, b) => a - b)
      const result = [(valores[0]), (valores[valores.length - 1])]
      if (!isNaN(result[0]) && !isNaN(result[1])) {
         console.log(`O maior número é: ${result[0]} \nO menor número é: ${result[1]}`);
      } else {
         console.log("Não é possível encontrar");
      }
   }else{
      console.log("Não é possível encontrar");
   }
}
*/

const procuraMinMax = (valores) => {
   if (valores != null && Array.isArray(valores)) {
      valores.sort((a, b) => a - b)
      const result = [(valores[0]), (valores[valores.length - 1])]
      if (!isNaN(result[0]) && result[0] != null && !isNaN(result[1]) && result[1] != null) {
         console.log(`O maior número é: ${result[0]} \nO menor número é: ${result[1]}\n`);
      } else {
         console.log("Não é possível encontrar\n");
      }
   } else {
      console.log("Não é possível encontrar\n");
   }
}

let entrada = [56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47]
procuraMinMax(entrada);
entrada = []
procuraMinMax(entrada);
entrada = [1]
procuraMinMax(entrada);
entrada = [1, -1]
procuraMinMax(entrada);
entrada = null
procuraMinMax(entrada);
entrada = [-2, -2, -2, -2]
procuraMinMax(entrada);
entrada = [20, 10, 30]
procuraMinMax(entrada);
