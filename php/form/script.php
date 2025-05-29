<?php

$nome = $_POST['nome'];
$salario = (int) $_POST['salario'];
$empresa = $_POST['empresa'];
$salario_aumento = (((30*$salario)/100) + $salario);


echo "Olá ".$nome." salário informado: ".$salario;
echo "<br>"." Após o ajuste de 30%, o salário ficará em: ".$salario_aumento.", atualmente trabalha na empresa: ".$empresa;




?>