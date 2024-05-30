public class Glaceon extends Eevee{
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
        return "Blizzard";
    }
    public Glaceon(String nome, String tipo, int altura, int HP, double peso){
        super(nome,tipo,altura,HP,peso);
    }
}
