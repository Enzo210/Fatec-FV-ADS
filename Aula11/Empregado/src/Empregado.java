public class Empregado {
    protected String nome;
    protected String endereco;
    protected double salario;


    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empregado(String nome, String endereco, double salario){
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }
    public void Imprimir(){
// não entendi essa parte skksksksk
    }
  
//calcula o irpf
    public double calcularIRPF() {
        double aux = 0;
        if (salario >= 1903.98 && salario <= 2826.65) {
            aux = salario * 0.075;
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            aux = salario * 0.15;
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            aux = salario * 0.225;
        } else if (salario > 4664.68) {
            aux = salario * 0.275;
        }
        return aux;
    }

    // calcula o inss
    public double calcINSS(){
        double aux =0;
        if (salario<=1302.00){
            aux = salario *0.075;
        }else if (salario>1302.01 && salario<2571.29){
            aux = salario *0.09;
        }else if (salario>2571.30 && salario<3856.94){
            aux = salario *0.12;
        }else if (salario>3856.95){
            aux = salario *0.14;
        }
        return aux;
    }


}
