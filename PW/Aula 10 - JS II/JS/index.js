//selecionamos os elementos do HTML
const titulo = document.getElementById('titulo')
const texto = document.querySelector('.texto')
const botao = document.getElementById('botao')
console.log(titulo,texto,botao)

//selecionando elementos que não existe
const texto1 = document.querySelector('texto1')
const botao1 = document.getElementById('botao1')
console.log(texto1,botao1)

botao.addEventListener( 'click',()=>{
    alert('Sou um evento externo')
})

//manipulando conteudos e Estilos

//alterar o conteudo textual
titulo.textContent = 'Aula com DOM em JS'
texto.innerHTML = "<strong> Texto adicionando pelosdfgsdfgsdfgsdfgsdfg o JS</strong>"

//alterando estilos

titulo.style.color = "red"

texto.style.fontSize = "20px"


//MANIPULANDO ELEMENTOs
//criando um elemento
const novoParagrafo = document.createElement('p')
//adicionando conteudo ao novo elemento
novoParagrafo.textContent = "Meu novo paasdfasdfragrafo"
//adicionando um novo elemento no body
document.body.appendChild(novoParagrafo)

const div = document.getElementsByClassName('textoinicio')
console.log(div)
div.appendChild(novoParagrafo)
//alterado um elemento
//removendo um elemento