### Conteúdo para o README.md

```markdown
# Script de Captura de Mensagens do Comprasnet/pncp

## Bibliotecas Utilizadas

1. **Selenium**:
   - **Descrição**: Selenium é uma biblioteca para automação de navegadores web.
   - **Instalação**: `pip install selenium`
   - **Importações**:
     ```python
     from selenium import webdriver
     from selenium.webdriver.common.by import By
     from selenium.webdriver.support.ui import WebDriverWait
     from selenium.webdriver.support import expected_conditions as EC
     from selenium.common.exceptions import NoSuchElementException, StaleElementReferenceException, TimeoutException
     ```

2. **Undetected-Chromedriver (uc)**:
   - **Descrição**: `undetected-chromedriver` é uma biblioteca para usar o ChromeDriver de forma que ele não seja detectado pelos sites.
   - **Instalação**: `pip install undetected-chromedriver`
   - **Importações**:
     ```python
     import undetected_chromedriver as uc
     ```

3. **Pandas**:
   - **Descrição**: Pandas é uma biblioteca para manipulação e análise de dados.
   - **Instalação**: `pip install pandas`
   - **Importações**:
     ```python
     import pandas as pd
     ```

4. **Time**:
   - **Descrição**: Biblioteca padrão do Python para manipulação de tempo.
   - **Instalação**: Não é necessária instalação, pois é uma biblioteca padrão.
   - **Importações**:
     ```python
     import time
     ```

## Explicação do Código

1. **Configuração do Driver**:
   - A função `configurar_driver` configura o ChromeDriver para usar o navegador Brave.
   - O caminho para o executável do Brave é definido e passado para as opções do ChromeDriver.
   - O ChromeDriver é inicializado com essas opções e retornado.
     ```python
     def configurar_driver():
         brave_path = "/usr/bin/brave-browser"  # Substitua pelo caminho real do Brave no seu sistema

         # Configuração das opções do Chrome para usar o Brave
         options = uc.ChromeOptions()
         options.binary_location = brave_path

         # Inicializar o ChromeDriver com as opções configuradas
         driver = uc.Chrome(options=options)
         return driver
     ```

2. **Navegar para o Site**:
   - A função `navegar_para_site` navega para o URL especificado e espera que um elemento específico da página esteja presente.
     ```python
     def navegar_para_site(driver, url):
         driver.get(url)
         try:
             elemento_especifico = WebDriverWait(driver, 20).until(
                 EC.presence_of_element_located((By.CLASS_NAME, 'h5'))
             )
             print("Página carregada com sucesso")
         except Exception as e:
             print(f"Erro ao carregar a página: {e}")
             driver.quit()
     ```

3. **Clicar no Botão de Mensagens**:
   - A função `clicar_no_botao` encontra e clica no botão de mensagens na página carregada.
     ```python
     def clicar_no_botao(driver):
         try:
             # Esperar até que o ícone esteja presente
             icone = WebDriverWait(driver, 20).until(
                 EC.presence_of_element_located((By.XPATH, '/html/body/app-root/div/div/div/app-cabecalho-compra-acesso-publico/app-cabecalho-compra/div[4]/div[2]/div/app-botoes-cabecalho-compra/span/app-botao-mensagens-da-compra/span/app-botao-icone/span/button'))
             )
             # Encontrar o elemento pai <button> do ícone
             icone.click()
             print("Botão clicado com sucesso")
         except Exception as e:
             print(f"Erro ao clicar no botão: {e}")
     ```

4. **Capturar Mensagens da Página**:
   - A função `capturar_mensagens_pagina` captura todas as mensagens presentes na página.
   - Para cada mensagem, tenta buscar os elementos `remetente`, `texto`, `item` e `data_hora`. Caso não encontre algum elemento, continua a execução sem erro.
     ```python
     def capturar_mensagens_pagina(driver, url, pagina_atual):
         tentativas = 0
         max_tentativas = 3  # Número máximo de tentativas
         while tentativas < max_tentativas:
             time.sleep(10)
             try:
                 mensagens = WebDriverWait(driver, 20).until(
                     EC.presence_of_all_elements_located((By.CLASS_NAME, 'cp-mensagens-compra'))
                 )
                 lista_mensagens = []
                 def buscar_texto(elemento, by, value):
                     try:
                         return elemento.find_element(by, value).text
                     except NoSuchElementException:
                         return None
                 for mensagem in mensagens:
                     remetente = buscar_texto(mensagem, By.CLASS_NAME, 'mensagens-remetente')
                     texto = buscar_texto(mensagem, By.CLASS_NAME, 'mensagens-texto')
                     item = buscar_texto(mensagem, By.CLASS_NAME, 'mensagens-item')
                     data_hora = buscar_texto(mensagem, By.CLASS_NAME, 'mensagens-data')
                     dados_mensagem = {
                         'remetente': remetente,
                         'texto': texto,
                         'item': item,
                         'data_hora': data_hora
                     }
                     lista_mensagens.append(dados_mensagem)
                     print(f"Remetente: {dados_mensagem['remetente']}")
                     if dados_mensagem['item']:
                         print(f"Item: {dados_mensagem['item']}")
                     print(f"Texto: {dados_mensagem['texto']}")
                     if dados_mensagem['data_hora']:
                         print(f"Data/Hora: {dados_mensagem['data_hora']}")
                     print("-" * 40)
                 return lista_mensagens
             except TimeoutException:
                 tentativas += 1
                 print(f"TimeoutException na página {pagina_atual}. Tentativa {tentativas} de {max_tentativas}...")
                 if tentativas >= max_tentativas:
                     print(f"Máximo de tentativas alcançado na página {pagina_atual}. Pulando esta página.")
                     return []
     ```

5. **Navegar para a Próxima Página**:
   - A função `navegar_para_proxima_pagina` clica no botão de próxima página, ou tenta clicar no botão da próxima página específica se o botão de próxima página não for encontrado.
     ```python
     def navegar_para_proxima_pagina(driver, pagina_atual):
         try:
             botao_proxima_pagina = WebDriverWait(driver, 20).until(
                 EC.element_to_be_clickable((By.CSS_SELECTOR, "button.p-paginator-next"))
             )
             if botao_proxima_pagina and botao_proxima_pagina.is_enabled():
                 WebDriverWait(driver, 10).until(
                     EC.element_to_be_clickable((By.CSS_SELECTOR, "button.p-paginator-next"))
                 )
                 driver.execute_script("arguments[0].click();", botao_proxima_pagina)
                 print(f"Página {pagina_atual} processada")
                 return True
             else:
                 try:
                     botao_pagina_atual = WebDriverWait(driver, 20).until(
                         EC.element_to_be_clickable((By.XPATH, f"//button[@aria-label='Page {pagina_atual + 1}']"))
                     )
                     driver.execute_script("arguments[0].click();", botao_pagina_atual)
                     print(f"Botão da página {pagina_atual + 1} clicado com sucesso")
                     return True
                 except Exception as e:
                     print(f"Erro ao clicar no botão da página {pagina_atual + 1}: {e}")
                     return False
         except NoSuchElementException:
             print("Botão 'Próxima página' não encontrado.")
             return False
         except Exception as e:
             print(f"Erro ao clicar no botão 'Próxima página': {e}")
             return False
     ```

6. **Bloco Principal**:
   - Configura o driver, navega para o site, clica no botão de mensagens, captura mensagens de todas as páginas e salva os dados em um arquivo Excel.
     ```python
     if __name__ == "__main__":
         driver = configurar_driver()
         url = 'https://cnetmobile.estaleiro.serpro.gov.br/comprasnet-web/public/compras/acompanhamento-compra?compra=990192059

00062024'
         navegar_para_site(driver, url)
         clicar_no_botao(driver)
         todas_mensagens = []
         pagina_atual = 1
         while True:
             todas_mensagens.extend(capturar_mensagens_pagina(driver, url, pagina_atual))
             time.sleep(10)
             pagina_atual += 1
             if not navegar_para_proxima_pagina(driver, pagina_atual):
                 break
         df = pd.DataFrame(todas_mensagens)
         df.to_excel('mensagens_chat.xlsx', index=False, engine='openpyxl')
         print("Dados exportados para mensagens_chat.xlsx")
         driver.close()
     ```

## Forma de Instalação

Para instalar todas as bibliotecas necessárias, execute os seguintes comandos:

```bash
pip install selenium undetected-chromedriver pandas openpyxl
```

## Conclusão

Este script automatiza a captura de mensagens de um site específico, navega por todas as páginas disponíveis e salva os dados em um arquivo Excel. As funções são bem definidas para configurar o driver, navegar no site, clicar em elementos específicos e capturar dados de forma robusta, lidando com possíveis exceções e tentativas falhas.
```

