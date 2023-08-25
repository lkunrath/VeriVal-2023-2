## Questão 1 - Projetar um diagrama de estados para reconhecer os literais de ponto flutuante da linguagem de programação Java

### a) Melhorar o diagrama proposto. Criar o diagrama no Jflap também.

#### Resolução:

| Transição | Leitura    |
| --------- | ---------- |
| q0 -> q0  | [0-9], (,) |
| q0 -> q1  | (.)        |
| q1 -> q1  | [0-9], (,) |

![849e84a4-21a5-4c38-ae16-c86aa68a2bb2](file:///C:/Users/lkunr/OneDrive/Imagens/Typedown/849e84a4-21a5-4c38-ae16-c86aa68a2bb2.png)

### b) Agora temos uma sugestão de código em java que representa o diagrama de estados. Se você propôs o seu diagrama de estados, espera-se o seu código.

#### Resolução:

src/arquivo ReconhecedorLiteralPontoFlutuante.java

## Questão 2 – Com base no exercício anterior:

### a) Projetar um diagrama de estados para reconhecer uma das formas de comentários das linguagens de programação mais conhecidas. Sugestão: inicia com /* e terminacom */.

| Transição | Leitura                         |
| --------- | ------------------------------- |
| q0 -> q1  | (/)                             |
| q1 -> q2  | (*)                             |
| q2 -> q2  | [A-Z], [a-z], [0-9], caracteres |
| q2 -> q3  | (*)                             |
| q3 -> q2  | [A-Z], [a-z], [0-9], caracteres |
| q3 -> q4  | (/)                             |

![](file:///C:/Users/lkunr/Downloads/WhatsApp%20Image%202023-08-24%20at%2019.37.31.jpeg)

src/ReconhecedorLiteralComentarios.java

### b) Projetar um diagrama de estados para reconhecer identificadores de linguagem de programação java.

| Transição | Leitura                    |
| --------- | -------------------------- |
| q0 -> q1  | [A-Z], [a-z], ( _ ), ("$") |
| q1 -> q1  | [A-Z], [a-z], ( _ ), ("$") |
| q1 -> q2  | palavras reservadas        |

![e71fa56e-d6b0-4d82-8b42-6a8616f20413](file:///C:/Users/lkunr/OneDrive/Imagens/Typedown/e71fa56e-d6b0-4d82-8b42-6a8616f20413.png)

src/ReconheceLiteralIdentificador.java


