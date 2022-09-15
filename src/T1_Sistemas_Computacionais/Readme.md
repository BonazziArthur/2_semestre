<h2>PONTIFÍCIA UNIVERSIDADE CATÓLICA DO RIO GRANDE DO SUL<h6>

<h3>Arthur Bonazzi, Rodrigo Renck, Guilherme Guimarães<h6>


Configurações Iniciais <br /> 
Primeiramente o usuário deve colocar os operandos desejados (em 8 bits) nos registradores (cada registrador é composto de 8 FFD). <br /> Cada Flip Flop do tipo D armazena um Bit. Os valores devem ser representados em complemento de dois.

Exemplo: <br />
Operando A: 00000101 <br />
Operando B: 00000001


 


<br />Feito isso, basta escolher a operação desejada: <br />
- para A and B (bitwise) basta colocar o valor do Seletor1 = 0 e o Seletor2 = 0<br /> 
- para A or B (bitwise) basta colocar o valor do Seletor1 = 0 e o Seletor2 = 1 <br />
- para A xor B (bitwise) basta colocar o valor do Seletor1 = 1 e o Seletor2 = 0 <br />
- para A + B (soma) ou A + (-B) (subtração) basta colocar o valor Seletor1 = 1 e o Seletor2 = 1 <br />
- para not A basta colocar todos os bits do operando B em 1 (11111111) e realizar uma operação xor (bitwise) <br />
  <br />

Depois disso, basta realizar os pulsos de clock. 
Serão necessários oito pulsos <br /> para que o resultado seja apresentado no display Hex do operando A, ou seja o usuário deve apertar 16 vezes no clock. 
Note que é um clock de subida. 


<br />Exemplos de uso: <br />
Para provar o funcionamento completo da ULA escolhemos diversos cenários com operandos distintos para testar cada uma das operações.
Neste documento os valores estão em decimal para fins didáticos, contudo, para utilizar a ULA é necessário colocá-los em binário e o resultado virá em hexadecimal.

<br /><h3>Positivos: 5 e 1 <br />
Negativos: -6 e -7<br />
Um positivo e um negativo: 5 e - 3<br />
Maiores: 21 e 30 <h6>


<br />Exemplo de not A:<br />
Operando A: 5 (00000101)<br />
Operando B:  (11111111)<br />
Configurando o seletor 1 e 2 para 1 e 0, respectivamente, obtém-se a porta lógica XOR. Depois de 8 pulsos de clock vamos obter o not A (11111010).


<br /><h3>Cenário 1:  
Operando A: 5 (00000101)<br />
Operando B: 1 (00000001) <h6>

AND<br />
Configurando o seletor 1 e 2 para 0 e 0, respectivamente, obtém-se a porta lógica AND. Por meio dela, é possível conseguir, através de uma operação bitwise, o valor 00000001 em binário (1 em Hexadecimal). Dessa forma, concluímos que a porta lógica especificada está funcionando corretamente.

OR <br />
Configurando o seletor 1 e 2 para 0 e 1, respectivamente, obtém-se a porta lógica OR. Por meio dela, é possível conseguir, através de uma operação bitwise, o valor 00000101 em binário (5 em Hexadecimal). Dessa forma, concluímos que a porta lógica especificada está funcionando corretamente.

XOR<br />
Configurando o seletor 1 e 2 para 1 e 0, respectivamente, obtém-se a porta lógica XOR. Por meio dela, é possível conseguir, através de uma operação bitwise, o valor 00000100 em binário (4 em Hexadecimal). Dessa forma, concluímos que a porta lógica especificada está funcionando corretamente.

SOMA <br />
Configurando o seletor 1 e 2 para 1 e 1, respectivamente, obtém-se a porta lógica SOMA. Por meio dela, é possível conseguir, através de uma operação bitwise, o valor 00000110 em binário (6 em Hexadecimal). Dessa forma, concluímos que a porta lógica especificada está funcionando corretamente.


<br /><h3>Cenário 2:<br />
Operando A: -6 (11111010) <br />
Operando B: -7 (11111001)  <h6>

AND<br />
Configurando o seletor 1 e 2 para 0 e 0, respectivamente, obtém-se a porta lógica AND. Por meio dela é possível conseguir o valor 11111000 em binário (F8 em Hexadecimal). Dessa forma, concluímos que a porta lógica especificada está funcionando corretamente.

OR<br />
Configurando o seletor 1 e 2 para 0 e 1, respectivamente, obtém-se a porta lógica OR. Por meio dela é possível conseguir o valor 11111011 em binário (F3 em Hexadecimal). Dessa forma, concluímos que a porta lógica especificada está funcionando corretamente.


XOR<br />
Configurando o seletor 1 e 2 para 1 e 0, respectivamente, obtém-se a porta lógica XOR. Por meio dela, é possível conseguir, através de uma operação bitwise, o valor 00000011 em binário (03 em Hexadecimal). Dessa forma, concluímos que a porta lógica especificada está funcionando corretamente.



SOMA<br />
Configurando o seletor 1 e 2 para 1 e 1, respectivamente, obtém-se a porta lógica SOMA. Por meio dela é possível conseguir o valor 11110011 (overflow) em binário (F4 em Hexadecimal). Dessa forma, concluímos que a porta lógica especificada está funcionando corretamente.

<h3>Cenário 3:<br />
Operando A: 5 (00000101)<br />
Operando B: -3 (11111011)<h6>


AND<br />
Configurando o seletor 1 e 2 para 0 e 0, respectivamente, obtém-se a porta lógica AND. Por meio dela é possível conseguir o valor 00000001 em binário (01 em Hexadecimal). Dessa forma, concluímos que a porta lógica especificada está funcionando corretamente.

OR <br />
Configurando o seletor 1 e 2 para 0 e 1, respectivamente, obtém-se a porta lógica OR. Por meio dela é possível conseguir o valor 10000000 em binário (40 em Hexadecimal). Dessa forma, concluímos que a porta lógica especificada está funcionando corretamente.


XOR<br />
Configurando o seletor 1 e 2 para 1 e 0, respectivamente, obtém-se a porta lógica XOR. Por meio dela, é possível conseguir, através de uma operação bitwise, o valor 11111110 em binário (FE em Hexadecimal). Dessa forma, concluímos que a porta lógica especificada está funcionando corretamente.



SOMA<br />
Configurando o seletor 1 e 2 para 1 e 1, respectivamente, obtém-se a porta lógica SOMA. Por meio dela é possível conseguir o valor  00000010 em binário (02 em Hexadecimal). Dessa forma, concluímos que a porta lógica especificada está funcionando corretamente

<h3>Cenário 4:<br />
Operando A: 21 (00010101)<br />
Operando B: 30 (00011110)<h6>

AND<br />
Configurando o seletor 1 e 2 para 0 e 0, respectivamente, obtém-se a porta lógica AND. Por meio dela é possível conseguir o valor 00010100 em binário (14 em Hexadecimal). Dessa forma, concluímos que a porta lógica especificada está funcionando corretamente.

OR<br />
Configurando o seletor 1 e 2 para 0 e 1, respectivamente, obtém-se a porta lógica OR. Por meio dela é possível conseguir o valor 00110011 em binário (33 em Hexadecimal). Dessa forma, concluímos que a porta lógica especificada está funcionando corretamente


XOR<br />
Configurando o seletor 1 e 2 para 1 e 0, respectivamente, obtém-se a porta lógica XOR. Por meio dela, é possível conseguir, através de uma operação bitwise, o valor 00001011 em binário (B em Hexadecimal). Dessa forma, concluímos que a porta lógica especificada está funcionando corretamente.



SOMA<br />
Configurando o seletor 1 e 2 para 1 e 1, respectivamente, obtém-se a porta lógica SOMA. Por meio dela é possível conseguir o valor 00110011 em binário (33 em Hexadecimal). Dessa forma, concluímos que a porta lógica especificada está funcionando corretamente. 
