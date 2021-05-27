# jogo-da-vida

Projeto realizado para a disciplina de Testes de Software (UFLA) durante o segundo semestre letivo de 2020 por Kellyson Santos e Rodrigo Herculano ([@rodherc](https://github.com/rodherc))

### Proposta

#### O  programa  a  ser  testado  será  o Jogo  da  Vida.

Com  base  na  especificação  do  programa, fornecido a seguir, gere casos de teste baseado nos critérios de teste funcionais (Particionamento em Classes Equivalência e Análise dos Valores Limite).

O jogo da vida corresponde a um tabuleiro plano 6x6, em que cada posição possui umvalor:

> 1: corresponde  a  uma célula  viva  
> 0: corresponde  a  uma célula morta.

O  jogo  começa  com  uma configuração inicial, gerada aleatoriamente. A partir dessa configuração, a cada passo uma nova geração é obtida, de acordo com as seguintes regras:

- Qualquer célula viva com menos de dois vizinhos vivos morre de solidão.
- Qualquer célula viva com mais de três vizinhos vivos morre de superpopulação.
- Qualquer célula morta com exatamente três vizinhos vivos se torna uma célula viva.
- Qualquer  célula  com  dois  vizinhos  vivos  continua  no  mesmo  estado  para  a  próxima geração.

O jogo não tem fim, assim, o usuário pode, a cada passo escolher uma nova geração ou finalizar o jogo.

A cada passo é mostrado ao usuário a geração anterior e a geração atual.
