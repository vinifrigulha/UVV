# 1 - Requisitos Funcionais (RF):

## RF001: Carrinho de Compras
- **Cenário de Teste 01: Campo de Quantidade**
  - CT 01: [Dígitos numéricos], [Quantidade alterada com sucesso]
  - CT 02: [Dígitos alfabéticos], [Erro: Não reconhece entrada alfabética]
  - CT 03: [Ponto flutuante], [Erro: Não reconhece ponto flutuante]
  - CT 04: [Caracteres especiais], [Erro: Não reconhece caracteres especiais]


- **Cenário de Teste 02: Valores aceitos**
  - CT 01: [Números entre 1 e 999.999.999, incluindo-os], [Quantidade aceita]
  - CT 02: [Valor igual a zero], [Erro: O sistema retorna automaticamente para 1]
  - CT 03: [Número maior que 999.999.999], Erro: [O sistema altera automaticamente para 999.999.999 e bloqueia novos dígitos]
  - CT 04: [Números negativos], [Erro: O sistema não reconhece o símbolo '-' que indica valores negativos]
  - CT 05: [Deixar em branco], [Erro: Não acontece nada a princípio, mas ao minimizar o carrinho, ele retorna o valor antes de apagar tudo]

- **Cenário de Teste 03: Botões de '+' e '-'**
  - CT 01: [Valor atual igual a 1], [Botão '-' fica desabilitado e o botão '+' fica habilitado]
  - CT 02: [Valor atual igual a 999.999.999], [O botão '+' fica desabilitado e o botão '-' fica habilitado]
  - CT 03: [Valor entre 1 e 999.999.999, excluindo-os], [A quantidade é adicionada de 1 em 1 pelo botão '+' e subtraída de 1 em 1 pelo botão '-']
  - CT 04: [Clicar no botão desabilitado], [Erro: Nada acontece com a quantidade]
  - CT 05: [Digitar uma quantidade válida e apertar um dos botões], [É adicionada/subtraída de 1 em 1 a partir da quantidade digitada]


## RF002: Personalizar Tela de Login
- **Cenário de Teste 01: Formatos de imagem**
  - CT 01: [Formato PNG], [Formato aceito]
  - CT 02: [Formato JPG], [Formato aceito]
  - CT 03: [Formato GIF], [Formato aceito]
  - CT 04: [Formato SVG], [Erro: Formato não aceito]
  - CT 05: [Formato WEBP], [Erro: Formato não aceito]
  - CT 06: [Formatos de texto como PDF, DOCX, XLSX, PPTX, etc.], [Erro: Formatos não aceitos]
  - CT 07: [Formatos de vídeo como MP4, MOV, WMV, etc.], [Erro: Formatos não aceitos]
  - CT 08: [Formatos de áudio como MP3, WMA, WAV, etc.], [Erro: Formatos não aceitos]

- **Cenário de Teste 02: Tamanhos de imagem**
  - CT 01: [O sistema suportou todos os tamanhos, desde 1x1 até 9.000x9.000], [Tamanho aceito]
  - **OBS: Não foram encontrados exemplos os suficiente para realizar os testes, mas para tamanhos usuais o sistema se mostrou capaz de suportá-los.** 


# 2 - Requisitos Não Funcionais (RNF):

## RNF001: Compatibilidade de Navegadores
- **Cenário de Teste 01: Acessar o portal**
  - CT 01: [Acessar o portal via Google Chrome], [Acesso feito com sucesso]
  - CT 02: [Acessar o portal via Microsoft Edge], [Acesso feito com sucesso]
  - CT 03: [Acessar o portal via Mozilla Firefox], [Acesso feito com sucesso]
  - CT 04: [Acessar o portal via Safari], [Acesso feito com sucesso]
  - CT 05: [Acessar o portal via Opera GX], [Acesso feito com sucesso]
  - **OBS: Não foi realizado em todos os navegadores existente, mas os citados acima são os mais comuns e funcionaram.**

- **Cenário de Teste 02: Uso de diferentes guias**
  - CT 01: [Abrir uma tela interna em uma nova guia], [Mantém o login atual]
  - CT 02: [Duplicar a guia], [Mantém a mesma tela e progresso de um determinado processo na guiaque foi duplicada]
  - CT 03: [Abrir uma tela interna em uma guia anônima], [A opção fica desabilitada]
  - CT 04: [Abrir outro cliente em uma nova guia], [A sessão anterior é desconectada, mantêm-se a nova]
  - CT 05: [Abrir o mesmo cliente ou outro cliente em uma guia anônima], [Não interrompe nem atrapalha a navegação que não é anônima]

- **Cenário de Teste 03: Navegadores distintos**
  - CT 01: [Fazer login em navegadores distintos], [Mantém duas contas logadas nos diferentes navegadores]
  - CT 04: [Abrir outro cliente em um navegador diferente], [A sessão anterior no outro navegador não é atrapalhada]
  - CT 05: [Abrir o mesmo cliente ou outro cliente em uma guia anônima], [Não interrompe nem atrapalha a navegação no outro navagador]


## RNF002: Integração
- **Cenário de Teste 01: Integração via SOAP/API Rest (SoapUI/Postman)**
  - CT 01: [Usuário e senha de integração corretos], [Código 200 (OK)]
  - CT 02: [Usuário correto e senha em branco], [Erro: Código 401 (Unauthorized)]
  - CT 03: [Usuário em branco e senha correta], [Erro: Código 401 (Unauthorized)]
  - CT 04: [Nenhuma credencial preenchida], [Erro: Código 401 (Unauthorized)]
  - CT 05: [Não enviar a tag de integração], [No SoapUI dá código 200 (OK), porém a integração não é feita na plataforma]
    - Resposta da plataforma: "Não existe ID relacionado à TAG:"
  - CT 06: [Enviar um valor não válido na tag de integração], [No SoapUI dá código 200 (OK), porém a integração não é feita na plataforma]
    - Resposta da plataforma: "Não existe ID relacionado à TAG: TESTE"
  - CT 07: [Não enviar uma tag obrigatória], [No SoapUI dá código 200 (OK), porém a integração não é feita na plataforma]
    - Resposta da plataforma: "Erro na entrada de requisição 0: Numero da requisicao cliente não informado."
  - CT 08: [Enviar uma tag incorreta], [Erro: Código 400 (Bad Request)]
  - CT 09: [Enviar uma tag que não existe], [A integração é feita com sucesso (Código 200), logo a plataforma apenas ignorou a tag inexistente]


# 3 - Componentes:

| Aluno                     | Professora                | Turma | Disciplina                     |
| ------------------------- | ------------------------- | ----- | ------------------------------ |
| Vinícius Frigulha Ribeiro | Gabriela Martins de Jesus | CC5N  | Qualidade e Testes de Software |

## 4 - Link do GitHub

[Projeto de Testes](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/projeto_parte2.md)