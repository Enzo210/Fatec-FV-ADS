public class Floreon extends Eevee{
    @Override
    public String ataque(){
        return "Tackle";
    }
    @Override
    public String defesa(){
        return "Growl";
    }
    @Override
    public String especial(){
        return "Last Resort";
    }
    public Floreon(String nome, String tipo, int altura, int HP, double peso){
        super(nome,tipo,altura,HP,peso);
    }
}
