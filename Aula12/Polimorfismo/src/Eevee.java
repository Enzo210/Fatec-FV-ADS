public class Eevee {
    private String nome; 
    private String tipo;
    private int altura, HP;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Eevee(String nome, String tipo, int altura, int HP, double peso) {
        this.nome = nome;
        this.tipo = tipo;
        this.altura = altura;
        this.HP = HP;
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int hP) {
        HP = hP;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String ataque(){
        return "Ataque rapido";
    }

    public String defesa(){
        return "Desvio";
    }
    public String especial(){
        return "Tri-ataque";
    }
public void Imprimir(){
    System.out.println("Meu Nome é: "+getNome());
    System.out.println("Meu Tipo é: "+getTipo());
    System.out.println("Minha altura é(em centímetros): "+getAltura());
    System.out.println("Minha Vida atual é: "+getHP());
    System.out.println("Meu Peso é: "+getPeso());
    System.out.println("Meu Ataque é: "+ataque());
    System.out.println("Minha Defesa é: "+defesa());
    System.out.println("Meu especial é: "+especial());
    System.out.println("---------------------------");
}

}
