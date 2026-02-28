# 💳 Sistema de Aprovação de Crédito

## 📌 Sobre o projeto

Esse projeto foi desenvolvido como prática do padrão de projeto **Chain of Responsibility** em Java.
A ideia foi simular um processo simples de análise de crédito, onde um cliente passa por uma sequência de validações até que o crédito seja aprovado ou negado.

As validações consideradas são:

- Verificação de renda mínima  
- Análise de score de crédito  
- Consulta de restrições financeiras  

Cada regra foi separada em uma classe própria, formando uma cadeia de validações.

---

## 🎯 Objetivo

O objetivo foi entender melhor como aplicar um padrão de projeto na prática e perceber como ele ajuda a organizar regras de negócio de forma mais limpa e escalável.

Ao invés de usar vários `if` encadeados, cada validação ficou responsável apenas pela sua própria regra, tornando o código mais modular e fácil de manter.

---

## 🧠 Padrão Utilizado

### Chain of Responsibility

Nesse padrão, cada objeto decide se resolve a requisição ou se passa para o próximo da cadeia.

No projeto, o fluxo ficou assim:

ValidadorRenda → ValidadorScore → ValidadorRestricao → AprovadorFinal

Se alguma regra falhar, o processo é interrompido.  
Se todas passarem, o crédito é aprovado.

---

## ⚙️ Regras de Negócio

O crédito será:

❌ Negado se:
- A renda for inferior ao valor mínimo definido
- O score estiver abaixo do esperado
- O cliente possuir restrições financeiras

✅ Aprovado se passar por todas as validações.

---

## ▶️ Como executar

1. Clone o repositório: git clone https://github.com/joaomoraist/Aprovacaoo-de-Credito_Estudo.git
2. Compile e execute a classe `Main`.
