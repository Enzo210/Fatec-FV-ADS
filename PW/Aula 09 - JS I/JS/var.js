// teste de variaveis  


let idade = 25
console.log(idade)

idade = 32
console.log(idade)

idade = idade +1
console.log(idade)

// var ou let

function exemploVAR(){
    var x = 5
    if(true){
        let x = 10
        console.log(x)
    }
    console.log(x)
}

function exemploLET(){
    let x = 5
    if(true){
        let x = 10
        console.log(x)
    }
    console.log(x)
}

exemploLET()
exemploVAR()

