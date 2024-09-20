//declarando matriz vazia 
minha_matriz  = [[],[]] 
minha_matriz2 = []   

//declarando e inicializando a matriz 
let minha_matriz3 = [[1,2],[3,4],[5,6]] 
//3x2 -- numeros inteiros 
console.log(minha_matriz3)   
//matriz mista 
let obj = {"nome" : "Diego", "idade" : 30} 
let matriz_mista = [["Francisco", "25"],[1,10,5],[true,false],[null,obj]] 
//4x2 - mista //
console.log(matriz_mista)   
//acessando valores 
//[linha][coluna]
console.log(minha_matriz3[0][0]) 
//primeiro elemento 
console.log(minha_matriz3[2][1]) 
//ultimo elemento nesse exemplo   

//concatenando valores especificos de duas matizes diferentes em um console.log 
console.log(minha_matriz3[2][1] + " " + minha_matriz3[2][0])   

//matriz com quantidade de colunas diferentes 
let minha_matriz_tam_diff = [[1],[2,3,4,5,6],[7,8,9,10,11],[12,13],[14]] 
console.log(minha_matriz_tam_diff)  

//verificar o tamanho da matriz 
let qtd_linhas = minha_matriz_tam_diff.length 
console.log(qtd_linhas) 
let qtd_colunas = minha_matriz_tam_diff[1].length 
console.log(qtd_colunas) 

let minha_matriz4 = [[1,2], [3,4]]      //2x2

minha_matriz4.splice(1,0, [5]) //adicionando uma linha no meio da matriz

minha_matriz4.splice(3,0, [6,7,8]) //adicionando uma linha no fim da matriz

minha_matriz4.push([9,10]) // fim da matriz

console.log(minha_matriz4)


for(let l = 0; l < minha_matriz4.length;l++){
    for(let c = 0; c<minha_matriz4[l].length; c++){
        console.log(minha_matriz4[1][c]+"")
    }
}

