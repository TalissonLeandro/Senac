<?php

$nome = 'João';
$idade = '18';

if($idade <= 5){
    echo $nome. ", você tem: ".$idade." anos de idade e não pode praticar natação.";
}else if($idade >= 5 && $idade < 8){
    echo $nome." você tem: ".$idade." anos de idade, categoria: Infantil A";
}else if($idade >= 8 && $idade < 11){
    echo $nome. " você tem: ".$idade." anos de idade, categoria: Infantil B";
}else if($idade >= 11 && $idade < 14){
    echo $nome. " você tem: ".$idade." anos de idade, categoria: Juvenil A";
}else if($idade >= 14 && $idade < 18){
    echo $nome." você tem: ".$idade." anos de idade, categoria: Juvenil B";
}else if($idade >= 18){
    echo $nome. " você tem: ".$idade." anos de idade, categoria: Adulto";
}else {
    echo "Idade inválida";
}


?>