public class Jolteon extends Eevee{
    
    
    
    @Override
    public String ataque(){
        return "Trovoada - Thunder-Shock";
    }
    @Override
    public String defesa(){
        return "Carga - Wild Charge";
    }
    @Override
    public String especial(){
        return "Raio- Thunder";
    }
    public Jolteon(String nome, String tipo, int altura, int HP, double peso){
        super(nome,tipo,altura,HP,peso);
    }
}
