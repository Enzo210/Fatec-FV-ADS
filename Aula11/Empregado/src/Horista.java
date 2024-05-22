public class Horista extends Empregado {
    private double horas;

    // contrutor method tlgd ne
    public Horista(String nome, String endereco, double salario, double horas){
        super(nome, endereco, salario);
        this.horas = horas;
    }

    //metodos para acessar

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
  public void calcularSalario(){
    salario = horas * 50;
  }
}
