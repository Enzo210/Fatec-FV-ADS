public class Leafeon extends Eevee{
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
        return "Leaf Blade";
    }
    public Leafeon(String nome, String tipo, int altura, int HP, double peso){
        super(nome,tipo,altura,HP,peso);
    }
}
