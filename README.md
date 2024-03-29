# Relatório do Projeto

## Descrição do Projeto
Este relatório descreve o projeto desenvolvido, que consiste em um sistema Cliente-Servidor em Java, utilizando interação via Console, onde o Cliente solicita informações de um Produto ao Servidor pelo seu ID. O Servidor responde com as informações do Produto, que são recuperadas de um banco de dados Oracle.

### Classes do Projeto
O projeto é composto por três classes principais: `Cliente`, `Servidor` e `Produto`. As interações entre Cliente e Servidor são realizadas via Socket TCP, onde o Cliente envia o ID do Produto desejado e o Servidor responde com as informações correspondentes.

- **Cliente**: Responsável por solicitar informações de um Produto ao Servidor. O Cliente solicita o ID do Produto ao usuário e envia essa solicitação para o Servidor. Em seguida, recebe as informações do Produto do Servidor e exibe no Console.
- **Servidor**: Responsável por receber as solicitações do Cliente, buscar as informações do Produto no banco de dados Oracle e enviar de volta para o Cliente. O Servidor aguarda as solicitações do Cliente e responde conforme as requisições recebidas.
- **Produto**: Representa a entidade Produto do sistema. Contém atributos como ID, nome, preço, validade, tamanho e descrição.

## Configuração do Ambiente
O projeto foi desenvolvido utilizando Maven como gerenciador de dependências e o IDE Eclipse. O banco de dados utilizado é Oracle, configurado com o SQL Developer. A configuração do banco de dados é realizada através do arquivo `persistence.xml`, localizado na pasta `META-INF`.

## Utilização do Sistema
Para utilizar o sistema, é necessário executar o Servidor e o Cliente em instâncias separadas. O Cliente solicita as informações do Produto ao Servidor, informando o ID desejado. O Servidor recebe a solicitação, busca as informações no banco de dados e envia de volta para o Cliente, que as exibe no Console.

## Considerações Finais
O projeto demonstra uma implementação básica de um sistema Cliente-Servidor em Java, utilizando interação via Console e comunicação via Socket TCP. Esta implementação pode ser expandida e melhorada para atender a requisitos mais complexos e cenários de uso real.

