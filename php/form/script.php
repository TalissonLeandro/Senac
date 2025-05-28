<?php

$nome = $_POST['nome'];
$salario = (int) $_POST['salario'];
$salario_aumento = (((30*$salario)/100) + $salario);
$salario_com_vt = (6*($salario_aumento)/100);
$empresa = $_POST['empresa'];

if($salario_aumento > 1518){
    echo "Olá ".$nome." salário informado: ".$salario;
    echo "<br>"." Após o ajuste de 30%, o salário ficará em: ".$salario_aumento.", atualmente trabalha na empresa: ".$empresa;
    echo "<br>"." com o desconto de VT, ficará em: ".$salario_com_vt;
}

//echo "Olá, ".$nome." salário informado: ".$salario;
//echo "<br>"."Após o ajuste de 30%, o salário ficará em: ".$salario_aumento. " e atualmente trabalha na empresa ".$empresa;


?>