public class Mensalista extends Empregado{
    public String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Mensalista(String nome, String endereco, double salario, String cargo){
            super(nome, endereco, salario); // serve para informar que os tres atributos pertencem a classe empregado
            this.cargo = cargo;
    }

    public void calcularSalario(){
        if(cargo.equals("junior")){
            salario = 2500;
        }else if(cargo.equals("Pleno")){
            salario=3500;
        }else {
            salario = 5500;
        }
    }
}

