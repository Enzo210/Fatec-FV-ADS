public class Sylveon extends Eevee{
    @Override
    public String ataque(){
        return "Bite";
    }
    @Override
    public String defesa(){
        return "Tail Whip";
    }
    @Override
    public String especial(){
        return "Moonblast";
    }
    public Sylveon(String nome, String tipo, int altura, int HP, double peso){
        super(nome,tipo,altura,HP,peso);
    }

}
