public class Horista extends Empregado {
    private double horas;
    private double v1_horas;

    // contrutor method tlgd ne
    public Horista(String nome, String endereco, double salario, double horas){
        super(nome, endereco, salario);
        this.horas = horas;
        this.v1_horas = v1_horas;
    }

    //metodos para acessar

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
  public void calcularSalario(){
    salario = horas * v1_horas;
  }
}
