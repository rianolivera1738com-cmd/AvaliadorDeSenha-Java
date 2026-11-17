# Avaliador de Senhas em Java

Projeto acadêmico de Análise e Desenvolvimento de Sistemas (ADS). O programa lê uma senha fictícia no terminal e informa quais critérios ainda precisam ser atendidos.

## Critérios

- Mínimo de 8 caracteres
- Pelo menos um número e uma letra maiúscula
- Sem espaços

## Como executar

Com um JDK instalado, abra o terminal na raiz do projeto e execute:

```bash
javac -encoding UTF-8 -d out src/App.java
java -cp out App
```

## Exemplos

Com a senha fictícia `Senha123`, o programa exibe:

```text
Senha aprovada
```

Com a senha fictícia `teste`, o programa exibe:

```text
Senha reprovada
Use pelo menos 8 caracteres.
Inclua pelo menos um número.
Inclua pelo menos uma letra maiúscula.
```

O projeto pratica leitura com `Scanner`, manipulação de strings, condições e métodos com parâmetro e retorno.
