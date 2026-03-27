\# 📱 Cadastro de Usuários - Android



\## 📌 Descrição

Este é um aplicativo Android simples desenvolvido em Java que permite cadastrar e exibir usuários em uma lista.



O app possui duas telas principais:

\- Tela principal com lista de usuários

\- Tela de cadastro de novos usuários



Os dados são armazenados em memória enquanto o aplicativo está em execução.



\---



\## 🚀 Funcionalidades



✔️ Exibir lista de usuários  

✔️ Cadastrar novo usuário (nome + email)  

✔️ Atualizar lista automaticamente ao voltar para a tela principal  



\---



\## 🛠️ Tecnologias Utilizadas



\- Java  

\- Android Studio  

\- RecyclerView  

\- Material Design  



\---



\## 📂 Estrutura do Projeto



\### 🔹 MainActivity.java

Responsável pela tela principal.



Funções principais:

\- Exibir lista de usuários com `RecyclerView`

\- Inicializar lista

\- Abrir tela de cadastro

\- Atualizar lista ao retornar



\---



\### 🔹 CreateUser.java

Tela de cadastro de usuários.



Funções:

\- Capturar nome e email

\- Adicionar usuário na lista

\- Retornar para tela principal



\---



\### 🔹 UserAdapter.java

Adaptador do RecyclerView.



Responsável por:

\- Criar os itens da lista

\- Vincular dados na tela

\- Gerenciar exibição dos usuários



\---



\## 🧠 Funcionamento



\- A lista de usuários é armazenada em uma variável estática:

```java

public static List<String> listaNomes = new ArrayList<>();

