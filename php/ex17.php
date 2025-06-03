<?php

$nome = ['nome'];
$pressao = ['pressao'];


if($pressao < 90){
    echo "Pressão: X mmHg - Risco: Hipotensão (pressão baixa)";
}else if($pressao >= 90 && $pressao < 120){
    echo "Pressão: X mmHg - Situação: Pressão ideal";
}else if($pressao >= 120 && $pressao < 130){
    echo "Pressão: X mmHg - Situação: Pressão normal alta";
}else if($pressao >= 130 && $pressao < 140){
    echo "Pressão: X mmHg - Situação: Pré-hipertensão (atenção necessária)";
}else if($pressao >= 140 && $pressao < 160){
    echo "Pressão: X mmHg - Situação: Hipertensão Estágio 1";
}else if($pressao >= 160 && $pressao < 180){
    echo "Pressão: X mmHg - Situação: Hipertensão Estágio 2";
}else if($pressao >= 180){
    echo "Pressão: X mmHg - Situação: Crise hipertensiva – risco de vida!";
}else if($pressao < 0){
    echo "Valor negativo ou não numérico";
}else {
    echo "Digite um valor válido";
}
?>