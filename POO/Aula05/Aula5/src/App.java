public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
        Aluno larissa = new Aluno("Larissa","123456",2321043,"21122004","Masc");
        larissa.setNome("Lariça");
        System.out.println(larissa.getNome());
        System.out.println(larissa.getra());

        
        Aluno a = new Aluno();
        a.setNome("Francis");
        a.setra(292048);
        System.out.println(a.getNome());
        System.out.println("Ola mundo");
    }
}