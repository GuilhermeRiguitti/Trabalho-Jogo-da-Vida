Como Compilar o codigo através do jGrasp

Com o arquivo Main.java aberto, clique no icone ![image](https://user-images.githubusercontent.com/71913845/224567424-428449a7-e0e3-4503-8f14-760883b042eb.png)

Logo em seguida no terminal do jGrasp, o codigo pede para que o usuario informe o tamanho da matriz, deverá ser um numero inteiro.
Exemplo: 7

Logo apos escolher o tamanho da matriz, o codigo imprime a matriz completa entre 0 e 1 atribuindo 1 para vivo e 0 para morto de modo aleatório na primeira vez que o código é iniciado. Após isso voce pode digitar 'f' para sair, ou ENTER para continuar:

Ao continuar, o codigo vai verificar todos os vizinhos (vizinho da parte de cima, baixo, direita e esquerda). 
Caso a coluna seja 0 onde o vetor se encontra, o vizinho da esquerda será a coluna = a tamanho - 1.
Caso a coluna seja tamanho - 1 onde o vetor se encontra , o vizinho da direita será a coluna = 0. 
Caso a linha seja 0 onde o vetor se encontra, o vizinho da esquerda será a linha = a tamanho - 1. 
Caso a linha seja tamanho - 1 onde o vetor se encontra , o vizinho da direita será a linha = 0.

1. Qualquer célula viva com menos de dois vizinhos vivos morre de solidão.
2. Qualquer célula viva com mais de três vizinhos vivos morre de superpopulação.
3. Qualquer célula morta com exatamente três vizinhos vivos se torna uma célula
viva.
4. Qualquer célula viva com dois ou três vizinhos vivos continua no mesmo estado
para a próxima geração.

Com isso ele imprime a nova geração e você é direcionado novamente para a mensagem 
"Digite 'f' para sair ou 'ENTER' para continuar. Levando ao looping até conseguir a vizinhaça perfeita, caso o usuario decida ir até o Final .
