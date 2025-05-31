<?php

$nota1 = 5;
$nota2 = 8;
$nota3 = 4;
$soma = $nota1 + $nota2 + $nota3;
$nome = 'João';
$idade = 15;

$media = $soma / 3;

if ($media < 4) {
    echo $nome . " você tem " . $idade . " anos. Situação: Reprovado por desempenho insuficiente. A soma de suas notas é: " . $soma;
} else if ($media >= 4 && $media < 6) {
    echo $nome . " você tem " . $idade . " anos. Situação: Recuperação. A soma de suas notas é: " . $soma;
} else if ($media >= 6 && $media < 8) {
    echo $nome . " você tem " . $idade . " anos. Situação: Aprovado com desempenho regular. A soma de suas notas é: " . $soma;
} else if ($media >= 8 && $media < 9.5) {
    echo $nome . " você tem " . $idade . " anos. Situação: Aprovado com bom desempenho! A soma de suas notas é: " . $soma;
} else if ($media >= 9.5 && $media <= 10) {
    echo $nome . " você tem " . $idade . " anos. Situação: Aprovado com excelência! A soma de suas notas é: " . $soma;
} else {
    echo "Nota inválida.";
}

?>