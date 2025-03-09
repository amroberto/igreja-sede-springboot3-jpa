# API da Igreja - Gestão de Igreja

Este projeto tem como objetivo fornecer uma API para gerenciar as entidades da igreja, como sede, sínodos, comunidades e paróquias, além de gerenciar lideranças, cargos e membros da igreja. A API será consumida em outros projetos da igreja, como o app da paróquia e o app de gestão sinodal.

## Estrutura do Projeto

A estrutura do projeto organiza os dados em torno de três entidades principais:

- **Igreja Sede**: Representa a sede central da igreja.
- **Sínodos**: Entidades que representam as divisões da igreja, cada uma com suas próprias comunidades e lideranças.
- **Comunidades**: Subdivisões que podem ser paróquias ou pontos de pregação, cada uma com suas respectivas lideranças.

Além disso, cada comunidade possui um **presbitério** ou **conselho paroquial**, que são grupos de liderança com cargos específicos. As lideranças são compostas por membros da igreja.

## Funcionalidades Principais

### 1. **Igreja Sede**
A Igreja Sede é a entidade central, responsável pela coordenação dos sínodos e das comunidades.

### 2. **Sínodos**
Cada sínodo pode ter várias comunidades associadas a ele. O sínodo coordena as comunidades em sua área de abrangência.

### 3. **Comunidades**
As comunidades podem ser de dois tipos:
- **Paróquia**: Quando a comunidade é uma paróquia, ela terá um conselho paroquial com suas respectivas lideranças e cargos.
- **Ponto de Pregação**: Quando a comunidade for apenas um ponto de pregação, ela não terá conselho paroquial, mas terá lideranças associadas.

### 4. **Lideranças**
Cada comunidade tem uma **liderança**, que é composta por membros da igreja. A liderança pode ser subdividida em cargos específicos, como presbítero, diácono, etc.

### 5. **Membros**
Os membros da igreja são as pessoas que ocupam os cargos de liderança nas comunidades e sínodos. Cada membro possui dados como nome, contato e outros detalhes relevantes.

## Endpoints da API

A API proporciona os seguintes endpoints para realizar as operações de CRUD (Create, Read, Update, Delete) para as entidades da igreja:

### **Igreja Sede**
- `GET /mainchurch` - Obtém todas as sedes da igreja.
- `POST /mainchurch` - Cria uma nova sede.

### **Sínodos**
- `GET /synods` - Obtém todos os sínodos.
- `POST /synods` - Cria um novo sínodo.

### **Comunidades**
- `GET /communities` - Obtém todas as comunidades.
- `POST /communities` - Cria uma nova comunidade (pode ser uma paróquia ou ponto de pregação).
  
### **Lideranças**
- `GET /leaderships` - Obtém todas as lideranças de uma comunidade ou sínodo.
- `POST /leaderships` - Cria uma nova liderança.

### **Membros**
- `GET /members` - Obtém todos os membros da igreja.
- `POST /members` - Cria um novo membro.

## Tecnologias Utilizadas

- **Spring Boot**: Framework principal para construção da API.
- **JPA (Java Persistence API)**: Para persistência dos dados no banco de dados relacional.
- **H2 Database**: Banco de dados em memória para testes (configurável para produção).
- **Validation API**: Para validação dos dados inseridos (como e-mail e CNPJ).
- **Lombok**: Para reduzir o boilerplate de código (getter, setter, construtores, etc.).

## Como Rodar o Projeto

### Requisitos
- Java 17 ou superior
- Maven ou Gradle

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/igreja-api.git
   cd igreja-api
# igreja-sede-springboot3-jpa
