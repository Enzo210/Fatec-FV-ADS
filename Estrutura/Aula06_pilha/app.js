//criando uma pilha vazia

pilha_prato = [];

pilha_prato.push('Prato Laranja')
pilha_prato.push('Prato Verde')
pilha_prato.push('Prato Azul')
pilha_prato.push('Prato Vermelho')

console.log("imprimir a pilha")
// tamanho da pilha
let tam = pilha_prato.length;
console.log('O tamanho da pilha é: '+ tam)

//verificando se a pilha esta vazia
let vazia = pilha_prato.length == 0;
console.log('Apilha esta vazia: '+vazia)

//acessando o topo da pilha
let topo = pilha_prato[pilha_prato.length-1]
console.log('Oelemento que esta no topo é: '+topo)


let rem = pilha_prato.pop()
console.log('O elemento removido é: '+rem)
// percorrendo a pilha 
for(let i = pilha_prato.length -1 ; i>=0; i--){
    console.log(pilha_prato[i]);
}
