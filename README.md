# Simbora-Turistar
Este repositório tem como objetivo principal o desenvolvimento de um programa em Java voltado para a composição da avaliação das disciplinas de Programação 2 e Laboratório de Programação 2, pertencentes ao curso de Licenciatura em Computação da UFRPE.

**Descrição Inicial**

O programa “Simbora Turistar” tem como público alvo pessoas que desejam fazer turismo em Pernambuco. O objetivo do sistema é permitir que os usuários façam o seu cadastro e possam cadastrar informações sobre os lugares que visitaram e os lugares que desejam visitar. 

**Especificação**

- Descrição textual das entidades do sistema

Local: Refere-se a um destino turístico, abrangendo pontos de interesse, monumentos, museus e outros locais visitáveis. Inclui dados essenciais como o nome do local, sua localização urbana, uma breve descrição do sítio, bem como informações sobre horários de funcionamento. A entidade "Local" encapsula as informações essenciais relacionadas a um destino de interesse para turistas.

Pago: Diz respeito aos locais que requerem pagamento para acesso. Essa entidade herda as características do "Local" e, adicionalmente, disponibiliza detalhes sobre o custo da entrada.

Gratuito: Engloba os locais de acesso livre. A entidade também herda as características do "Local", acrescentando informações relevantes sobre a necessidade de reservas prévias, quando aplicável.

Usuario: Representa os indivíduos que interagem com o sistema. Armazena dados pessoais, como o nome do utilizador e o endereço de email. Adicionalmente, a entidade "Usuario" mantém registros dos locais turísticos visitados pelo utilizador e dos locais que este planeia visitar no futuro. Possibilita aos utilizadores interagir com o sistema, registrando preferências e experiências de viagem.

- Listagem das funcionalidades do sistema

Cadastro de Usuários: Os usuários podem se cadastrar no sistema fornecendo seu nome e email.

Cadastro de Lugares: Os usuários podem cadastrar informações sobre lugares turísticos, incluindo nome, descrição, horário de funcionamento, valor de entrada e reserva.
As informações são armazenadas no sistema para referência futura.

Visualização de Informações Turísticas: Os usuários podem visualizar informações sobre os lugares turísticos cadastrados, como nome, descrição, horário de funcionamento e valor de entrada e reserva.
Registro de Lugares Visitados: Os usuários podem registrar os lugares turísticos que já visitaram e aqueles que desejam visitar no futuro.
Essas informações são armazenadas para referência do usuário.

Feedback para o Usuário: O sistema fornece feedback ao usuário sobre a conclusão bem-sucedida das ações, como o cadastro de um lugar turístico ou o registro de um usuário.

Validação de Entradas do Usuário: O sistema realiza validações de entrada para garantir que os dados inseridos pelos usuários estejam no formato correto e sejam adequados.

Exibição de Mensagens de Erro: O sistema exibe mensagens de erro quando ocorrem situações inesperadas ou inválidas, fornecendo orientações para o usuário.

- Descrever as opções da interface do sistema (linha de comando ou GUI)

1. Cadastro de Usuário:

Campos para inserir nome e email.
Botão "Cadastrar" para adicionar o usuário ao sistema.

2. Cadastro de Lugares:

Campo para selecionar se o lugar é pago ou gratuito.
Campos para inserir nome, descrição, horário de funcionamento, valor de entrada e reserva.
Botão "Cadastrar Lugar" para adicionar o lugar turístico ao sistema.

3. Visualização de Lugares:

Lista ou painel exibindo os lugares turísticos cadastrados.
Ao selecionar um lugar, exibe detalhes como nome, descrição, horário de funcionamento e valor de entrada.
Registro de Lugares Visitados.


4. Exibição de Informações Detalhadas:

Ao selecionar um lugar desejado, exibe informações detalhadas, como horário de funcionamento e valor de entrada.

5. Feedback e Mensagens:

Exibição de mensagens de sucesso após cada ação bem-sucedida.
Mensagens de erro caso ocorra algum problema.

