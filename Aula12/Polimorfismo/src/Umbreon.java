public class Umbreon extends Eevee{
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
        return "Dark Pulse";
    }
    public Umbreon(String nome, String tipo, int altura, int HP, double peso){
        super(nome,tipo,altura,HP,peso);
    }
}
