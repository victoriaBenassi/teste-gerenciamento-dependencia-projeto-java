### criar um projeto maven

- mvn archetype:generate -DgroupId=one.digitalinnovation -DartifactId=quick-start-maven -Darchetype=maven-quick-start -DinteractiveMode=false

### criar projeto maven multi-modulo
- projeto agregrador : mvn archetype:generate -DgroupId=com.exemple -DartifactId=project-parent -Darchetype=maven-quick-start

- alterar o pom.xml do projeto e adicionar <packaging>pom<packaging> 

- criar projeto core - entrar no projeto agregador e rodar : mvn archetype:generate -DgroupId=com.exemple -DartefactId=core -Darchetype=maven-quick-start -DinteractiveMode=false

- criar projeto service : mvn archetype:generate -DgroupId=com.exemple -DartefactId=service -Darchetype=maven-quick-start -DinteractiveMode=false

### Comandos uteis no dia a dia

- Compilar: compile
- Testar: test
- mvn package - valida o projeto, compila o codigo fonte, executa testes Unitarios e empacotar o projeto

- clean - Limpar diretório de trabalho
- mvn dependency:tree - ver a arvore de dependencias do projeto
- mvn install - publica localmente o projeto 

### Build Lifecycle do Maven

O **Build Lifecycle** (ou Ciclo de Vida de Construção) do Maven é um conjunto de fases que definem a ordem e o processo de construção de um projeto. O Maven usa esse ciclo de vida para gerenciar e executar as várias etapas necessárias para compilar, testar, empacotar e implantar uma aplicação.

## Estrutura do Build Lifecycle

O ciclo de vida de construção padrão do Maven é composto por várias fases, e cada fase corresponde a uma tarefa específica no processo de construção. O ciclo de vida mais comum é o **"default"**, que inclui as seguintes fases:

### 1. `validate`

- **Descrição:** Valida o projeto e verifica se a configuração é correta e todos os recursos necessários estão disponíveis.
- **Objetivo:** Garantir que o projeto está pronto para a construção.

### 2. `compile`

- **Descrição:** Compila o código-fonte do projeto. O código Java é transformado em arquivos `.class` no diretório `target/classes`.
- **Objetivo:** Converter o código-fonte em bytecode que pode ser executado pela JVM.

### 3. `test`

- **Descrição:** Executa os testes unitários do projeto. Os testes são escritos no código-fonte de teste e executados para verificar a funcionalidade do código.
- **Objetivo:** Garantir que o código funciona como esperado e não quebra funcionalidades existentes.

### 4. `package`

- **Descrição:** Empacota o código compilado e outros recursos em um formato distribuível, como JAR, WAR, ou EAR, dependendo da configuração do projeto.
- **Objetivo:** Criar o artefato final que será entregue ou implantado.

### 5. `verify`

- **Descrição:** Realiza verificações adicionais para garantir que o artefato está adequado para implantação. Isso pode incluir validação de relatórios de teste e outros critérios de qualidade.
- **Objetivo:** Assegurar a qualidade e integridade do artefato.

### 6. `install`

- **Descrição:** Instala o artefato no repositório local Maven. Isso permite que outros projetos em sua máquina acessem a versão construída do projeto.
- **Objetivo:** Disponibilizar o artefato para uso em projetos locais.

### 7. `deploy`

- **Descrição:** Copia o artefato final para um repositório remoto, tornando-o disponível para outros desenvolvedores e sistemas. Isso é geralmente feito em um ambiente de integração contínua ou de produção.
- **Objetivo:** Disponibilizar o artefato para consumo por outros projetos ou usuários.

## Ciclos de Vida Alternativos

Além do ciclo de vida **"default"**, o Maven também possui outros ciclos de vida padrão:

### `clean`

Foca em limpar os artefatos antigos gerados durante builds anteriores. As fases incluem:
- `pre-clean`: Tarefas a serem realizadas antes da limpeza.
- `clean`: Remove os arquivos gerados (como a pasta `target`).
- `post-clean`: Tarefas a serem realizadas após a limpeza.

### `site`

Cria o site de documentação do projeto. As fases incluem:
- `pre-site`: Tarefas a serem realizadas antes da geração do site.
- `site`: Gera o site de documentação.
- `post-site`: Tarefas a serem realizadas após a geração do site.
- `site-deploy`: Implanta o site gerado em um servidor.

## Exemplo de Execução do Ciclo de Vida

Quando você executa um comando Maven como `mvn package`, o Maven automaticamente executa todas as fases anteriores a essa fase. Por exemplo:

```bash
mvn package

## Plugins - mais utilizados
