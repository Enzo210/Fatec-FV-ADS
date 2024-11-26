<?php

    namespace App\DAO;

    use App\Models\Aluno;
    use Config\connection;
    use PDO;

    class AlunoDAO{
        private $conn;

        public function __construct(){
            $database = new connection();
            $this->conn = $database->getConnection();

        }
        public function save(Aluno $aluno){
            $query = "INSERT INTO aluno (nome, genero) VALUES (:nome,:genero)";
            $stmt = $this->conn->prepare($query);
            $stmt->bindParam(":nome",$aluno->getNome());
            $stmt->bindParam(":genero",$aluno->getGenero());
            $stmt->execute();


        }
    }
?>