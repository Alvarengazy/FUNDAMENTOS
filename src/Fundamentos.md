# Fundamentos de Java

Este documento reúne os conceitos iniciais estudados na biblioteca. Os exemplos são pequenos e podem ser executados separadamente. Em Java, se uma classe for `public`, o nome do arquivo deve corresponder exatamente ao nome da classe, incluindo maiúsculas e minúsculas.

## 1. Variáveis e tipos

Uma variável é um espaço nomeado usado para armazenar um valor. O tipo define quais valores ela pode representar e quais operações são apropriadas.

```java
int idade = 20;
double altura = 1.75;
boolean maiorDeIdade = idade >= 18;
char inicial = 'A';
String nome = "Atlas";
```

O tipo deve ser escolhido de acordo com a informação representada, os limites necessários e a precisão desejada. Nem todos os tipos são substitutos entre si.

## 2. Os oito tipos primitivos

Java possui oito tipos primitivos: quatro tipos inteiros, dois tipos de ponto flutuante, um tipo para caracteres e um tipo lógico.

| Tipo | O que representa | Faixa ou observação |
|---|---|---|
| `byte` | Inteiros | −128 a 127 |
| `short` | Inteiros | −32.768 a 32.767 |
| `int` | Inteiros | −2.147.483.648 a 2.147.483.647 |
| `long` | Inteiros | −2⁶³ a 2⁶³ − 1; literais grandes podem usar o sufixo `L` |
| `float` | Ponto flutuante | Precisão aproximada de 6 a 7 dígitos decimais; literal decimal usa `f` ou `F` para ser `float` |
| `double` | Ponto flutuante | Precisão aproximada de 15 a 16 dígitos decimais; tipo padrão para literais decimais |
| `char` | Um valor de caractere UTF-16 | Usa aspas simples, como `'A'` ou `'7'` |
| `boolean` | Valor lógico | `true` ou `false` |

### `byte`, `short`, `int` e `long`

Esses tipos representam números inteiros, mas têm faixas diferentes. Use `int` como escolha comum para inteiros; `byte`, `short` ou `long` podem ser adequados quando a faixa ou o contexto justificar.

```java
byte pequeno = -57;
short ano = 2057;
int quantidade = 1200;
long populacao = 2000000000000L;
```

O `L` no literal `2000000000000L` indica `long`. Prefira `L` maiúsculo porque o `l` minúsculo pode ser confundido com o número `1`.

### `float` e `double`

Ambos representam valores de ponto flutuante. `double` oferece maior precisão e costuma ser a escolha padrão para cálculos decimais comuns. Para `float`, use o sufixo `f` em literais decimais.

```java
float peso = 75.8f;
double altura = 1.75;
```

Tipos de ponto flutuante podem ter imprecisões de representação binária. Para cálculos financeiros que exigem representação decimal exata, normalmente é melhor estudar `BigDecimal` mais adiante.

### `char`

Armazena um único valor de caractere e usa aspas simples.

```java
char letra = 'a';
char digito = '1';
char simbolo = ',';
```

`'1'` é um caractere, não o número inteiro `1`.

### `boolean`

Representa apenas `true` ou `false`. É comum em verificações e condições.

```java
int idade = 20;
boolean maiorDeIdade = idade >= 18;
System.out.println(maiorDeIdade);
```

## 3. `String`: textos

`String` representa uma sequência de caracteres e usa aspas duplas. Embora seja fundamental no Java, não é um dos oito tipos primitivos.

```java
String nome = "Atlas";
System.out.println("Seu nome é: " + nome);
```

O operador `+` pode concatenar texto com o conteúdo de uma variável.

## 4. Literais

Um literal é um valor escrito diretamente no código. Por exemplo, em `int idade = 20;`, `20` é um literal inteiro; em `double altura = 1.75;`, `1.75` é um literal de ponto flutuante interpretado como `double` por padrão.

```java
int inteiro = 10;
long inteiroGrande = 9000000000L;
double decimal = 1.75;
float decimalMenor = 1.75f;
char caractere = 'A';
String texto = "Olá";
```

## 5. Métodos, parâmetros e retorno

Um método reúne uma operação que pode ser chamada pelo nome. Um parâmetro recebe um valor fornecido na chamada; `return` devolve um resultado ao local que chamou o método.

```java
public static String frase(String nome) {
    return "Seu nome é: " + nome;
}

public static void main(String[] args) {
    System.out.println(frase("John"));
}
```

Saída:

```text
Seu nome é: John
```

- `String` antes do nome do método indica o tipo de retorno.
- `String nome` é o parâmetro.
- `return` devolve o texto produzido.
- `frase("John")` chama o método com o argumento `"John"`.
- `void` indica que o método não retorna um valor.
- `static` permite chamar o método a partir do contexto estático de `main`, sem criar um objeto da classe.

## 6. Método 1 e Método 2

Na biblioteca, o **Método 1** costuma mostrar a versão explícita com variável. O **Método 2** é uma alternativa compacta quando ela demonstra uma ideia útil, como retornar um valor diretamente. Não é necessário criar Método 2 para todo conceito.

### Exemplo: valor armazenado em variável

```java
public static void main(String[] args) {
    float peso = 75.8f;
    System.out.println("Seu peso é " + peso + " kg");
}
```

### Exemplo: método que retorna um valor

```java
public static float peso() {
    return 75.8f;
}

public static void main(String[] args) {
    System.out.println("Seu peso é " + peso() + " kg");
}
```

O segundo exemplo não declara uma variável local para o valor fixo; chama um método que o retorna. Ele demonstra retorno e reutilização, mas, como o valor é fixo, não significa que um método seja sempre melhor do que uma variável.

## 7. Saída no console

`System.out.println()` imprime um valor e termina a linha. O operador `+` concatena textos e valores quando uma das partes é uma `String`.

```java
int idade = 20;
System.out.println("Idade: " + idade);
```

## 8. Boas práticas iniciais

- Use nomes que indiquem a intenção, como `peso` ou `calcularMedia`.
- Mantenha a indentação consistente e separe blocos para facilitar a leitura.
- Prefira `L` maiúsculo para literais `long`.
- Não crie métodos apenas para reduzir linhas: avalie clareza, reutilização e finalidade.
- Uma classe `public` deve estar em um arquivo com o mesmo nome, respeitando maiúsculas e minúsculas.
- Para testar duas versões que têm o mesmo `main`, mantenha apenas um `main` ativo por classe; comente corretamente o bloco inativo ou use arquivos/classes separados.

## Progresso

Conceitos documentados nesta etapa: oito tipos primitivos, `String`, variáveis, literais, impressão no console e introdução a métodos, parâmetros e retornos. A biblioteca continuará sendo ampliada conforme novos conteúdos forem estudados.
