# Employee Payment System

Este projeto é uma aplicação Java simples que simula um sistema de pagamento para funcionários, incluindo funcionários terceirizados. O programa permite que o usuário insira os dados de diversos funcionários e calcule o valor a ser pago a cada um, com base nas horas trabalhadas e no valor por hora. Para funcionários terceirizados, há um adicional de taxa extra.

## Estrutura do Projeto

O projeto é composto pelos seguintes componentes:

1. **`Employee` (Classe)**: Representa um funcionário comum, com os atributos:
    - `name`: Nome do funcionário.
    - `hours`: Número de horas trabalhadas.
    - `valuePerHour`: Valor por hora de trabalho.

2. **`OutsourcedEmployee` (Classe)**: Herda de `Employee` e representa um funcionário terceirizado. Além dos atributos herdados, possui:
    - `additionalCharge`: Uma taxa adicional para funcionários terceirizados.

3. **`Program` (Classe principal)**: Contém o método `main` que realiza as seguintes funcionalidades:
    - Solicita ao usuário o número de funcionários.
    - Para cada funcionário, coleta as informações necessárias, como nome, horas trabalhadas e valor por hora.
    - Se o funcionário for terceirizado, solicita a taxa adicional.
    - Calcula o pagamento para cada funcionário com base nas horas trabalhadas e, se aplicável, adiciona a taxa extra para funcionários terceirizados.

## Funcionalidades

- Entrada de dados dos funcionários (nome, horas trabalhadas, valor por hora).
- Opção de especificar se o funcionário é terceirizado, com inclusão de uma taxa adicional para cálculo do pagamento.
- Cálculo do pagamento com base nas horas trabalhadas e valor por hora.
- Exibição da lista de pagamentos para cada funcionário.