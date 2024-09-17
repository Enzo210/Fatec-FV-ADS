public class Aluno {
    private String nome;
    private String CPF; 
    private int ra;
    private String data_nascimento;
    private String sexo;

    public Aluno(String nome, String CPF, int ra, String data_nascimento, String Sexo){
        this.nome = nome;
        this.CPF = CPF;
        this. ra = ra;
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;

    }

    public Aluno(){
        
    }
    public void setNome(String new_nome){
        this.nome= new_nome;
    }
    public void setra(int new_ra){
        this.ra = new_ra; // this não necessariamente funciona, mais pra n confundir com a outra q recebe
    }

    public String getNome(){
        return this.nome;
    }
    public int getra(){
        return this.ra;
    }
}