# 🧪 Demo API – Testes de Software com Spring Boot

Este projeto foi desenvolvido para **exercícios práticos de Teste de Software**, utilizando uma **API simples em Java (Spring Boot)**.  
Os testes contemplam **funcionais, exploratórios, de regressão, não funcionais e de carga.**

---

## ⚙️ Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.x**
- **Maven**
- **Postman** (para testes manuais)

---

## 🧩 Dependências (Spring Initializr)

Selecione no [start.spring.io](https://start.spring.io/):

- ✅ **Spring Web**
- ✅ **Validation**

---

## 🚀 Como Executar o Projeto

1. Clone ou baixe o projeto.
2. No terminal, na raiz do projeto, execute:

```bash
mvn spring-boot:run
```

3. A aplicação estará disponível em:
```bash
http://localhost:8080
```

## 📁 Estrutura Básica
src/main/java/com/example/demoapi/
├── DemoApiApplication.java
├── controller/
│   ├── CalculadoraController.java
│   ├── UsuarioController.java
│   ├── ProdutoController.java
│   ├── StatusController.java
│   └── LentoController.java
└── model/
└── Usuario.java

## 🧮 1. Teste Funcional
### 🎯 Objetivo

Verificar o comportamento correto dos endpoints /calculadora em operações válidas e inválidas.

### 🔹 Endpoint: /calculadora/multiplicar

Método: GET
Parâmetros: a, b
URL: http://localhost:8080/alculadora/multiplicar?a=&b=


**Exemplo:**

```bash
GET http://localhost:8080/calculadora/multiplicar?a=5&b=3
```
![img_2.png](img/img_2.png)


### 🔹 Endpoint: /calculadora/dividir

Método: GET
Parâmetros: a, b
URL: http://localhost:8080/alculadora/dividir?a=&b=

**Exemplo 1:**
```bash
GET http://localhost:8080/calculadora/dividir?a=10&b=2
```
![img.png](img/img.png)

**Exemplo 2:**
```bash
GET http://localhost:8080/calculadora/dividir?a=10&b=0
```
![img_1.png](img/img_1.png)

## 🧭 2. Teste Exploratório
### 🎯 Objetivo

Observar como a API reage a entradas inválidas e métodos incorretos.

### 🔹 Endpoint: /usuario

Método: POST
URL: http://localhost:8080/usuario

**Exemplo de corpo válido:**
```bash
{
  "nome": "Giovanna Tomacelli",
  "email": "gioTomacelli@gmail.com",
  "idade": 20
}
```
![img_3.png](img/img_3.png)

**Exemplo de corpo malformado (erro proposital):**
```bash
{
  "nome": "Giovanna Tomacelli",
  "email": "gioTomacelli@gmail.com",
}
```
![img_4.png](img/img_4.png)
Comportamento esperado:
➡️ 400 Bad Request — o Spring rejeita o JSON inválido automaticamente.

## 🔁 3. Teste de Regressão
### 🎯 Objetivo
Verificar se funcionalidades previamente implementadas continuam funcionando corretamente após alterações no sistema.

### 🔹 Endpoint: /produtos

Método: GET
URL: http://localhost:8080/produtos

**Exemplo:**
![img_5.png](img/img_5.png)
Validação: Verifique se todos os produtos estão sendo listados corretamente.

## 📊 4. Teste Não Funcional
### 🎯 Objetivo
Avaliar o tempo de resposta da API em chamadas repetidas ao endpoint /status, observando variações que possam indicar gargalos ou instabilidade.

### 🔹 Endpoint: /status

Método: GET
URL: http://localhost:8080/status

**Exemplos:**
![img_6.png](img/img_6.png)
![img_7.png](img/img_7.png)
![img_8.png](img/img_8.png)
### 📈 Análise esperada
- Variações pequenas (ex: 45ms a 70ms) são normais.
- Oscilações maiores podem indicar problemas de desempenho ou sobrecarga no servidor.

## 🧱 5. Teste de Carga (Simples)
### 🎯 Objetivo
Simular uma operação demorada para observar como a API responde a requisições com atraso, avaliando estabilidade e comportamento sob espera prolongada.

### 🔹 Endpoint: /lento

Método: GET
Parâmetro: delay = (em segundos)
URL: http://localhost:8080/lento?delay=5

**Exemplo:**
![img_9.png](img/img_9.png)