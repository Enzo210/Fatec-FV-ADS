<?php
namespace App\Services;
use App\DAO\AlunoDAO;
use app\Models;
use app\DAO;
class AlunoService
{  private $dao;

    public function __construct(){
        $this->dao = new AlunoDAO();
    }
    public function criar($nome, $genero)
    {
        $aluno = new Aluno($nome, $genero);
        
    }
}


?>