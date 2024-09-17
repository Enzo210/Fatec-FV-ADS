public class Espeon extends Eevee {

    public Espeon(String nome, String tipo, int altura, int HP, double peso){
        super(nome,tipo,altura,HP,peso);
    }
    @Override
    public String ataque(){
        return "Bite";
    }
    @Override
    public String defesa(){
        return "Growl";
    }
    @Override
    public String especial(){
        return "Psychic";
    }
}
