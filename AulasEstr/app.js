// Vetores - Declarando e Inicializando uma Array
 
let modelos = ['Gol', 'Corsa', 'Fusca'];
 
let marcas = ['Chevrolet', 'Ford', 'Fiat'];
 
let acessorios = new Array(5);
 
let cores = [];
 
let categoria = [];
 
console.log(modelos);
console.log(marcas);
console.log(acessorios);
console.log(cores);
console.log(categoria);
 
console.log(modelos[0]);
console.log(modelos[1]);
console.log(modelos[2]);
 
let nome_modelos = modelos[0];
console.log(nome_modelos);
 
// Adicionando elementos no fim da array
modelos.push('HB20');
 
// Adicionando elementos no início da array
modelos.unshift('Logan');
console.log(modelos);
 
// Removendo elementos no início da array
modelos.shift();
console.log(modelos);
 
// Removendo elementos no fim da array
modelos.pop();
console.log(modelos);
 
// Juntando arrays
let frutas = ['Laranja', 'Melancia', 'Morango'];
let vegetais = ['Batata Doce', 'Cenoura', 'Milho'];
let feira = frutas.concat(vegetais);
 
console.log(feira);
 
// Selecionando e copiando arrays
let frutas_ = ['Laranja', 'Melancia', 'Morango', 'Uva', 'Caju'];
let frutas_sel = frutas_.slice(1, 4);
console.log(frutas_sel);
 
// Alterando ou removendo elemento
frutas_.splice(1, 1, 'Manga');
console.log(frutas_);
 
// Convertendo array em string
let frutas123 = ['Laranja', 'Melancia', 'Morango', 'Uva', 'Caju'];
let texto = frutas123.join(',');
// Exibindo o valor
console.log(texto);
 
let numeros = [1,2,3,4,5,6]
let dobra = numeros.map(x=> x*2)
 
console.log(dobra)
 
 
//exemplo de funçao
function teste(t){
    console.log(t)
}
 
teste('Francisco')
 
//filter
let pares = numeros.filter(x => x % 2 == 0);
 
console.log(pares);
 
 
// Usando operador ternário
let nota = 7; // Defina um valor para nota
let res = nota >= 6 ? "Aprovado" : "Reprovado";
console.log(res);
 
// Usando if-else
let rest1 = 60;
if (rest1 >= 60) {
    console.log("Aprovado");
} else {
    console.log("Reprovado");
}

let numeross = [1,2,3,4,5,6];
let localizado = numeross.find(x => x > 2);
let localizado_index = numeros.findIndex(x=> x>12)
console.log("Foi localizado o elemento: " + localizado);
console.log("Foi localizado o index: " + localizado_index);

let maior = numeros.some(x=> x>2)

console.log(maior)

let numerosss =[1,2,3,4,5,6];

let maiorr = numerosss.every(x=> x>0);

console.log(maiorr);




////////////// organizar os elementos
let n_aleatorio = [10,12,3,01,0,06,02,08,07]
console.log(n_aleatorio);
n_aleatorio.sort()
console.log(n_aleatorio);
n_aleatorio.reverse()