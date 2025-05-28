# Projeto Idiomas App

## Sobre o Projeto

Este é um aplicativo Android desenvolvido como um projeto de estudo. O objetivo principal do aplicativo é aprender o uso da ferramenta DataStore, demonstrando a funcionalidade de mudança de idioma em tempo de execução, alterando dinamicamente o conteúdo exibido na tela com base na preferência do usuário.

Atualmente, o aplicativo suporta os seguintes idiomas:

*   Português
*   Inglês
*   Espanhol

A interface do usuário é construída utilizando Jetpack Compose, a moderna toolkit da UI do Android. As preferências de idioma são salvas localmente utilizando DataStore.

## Funcionalidades

*   **Seleção de Idioma:** Um menu dropdown permite ao usuário escolher entre os idiomas disponíveis (Português, Inglês, Espanhol).
*   **Interface Dinâmica:**
    *   O texto principal e a descrição mudam de acordo com o idioma selecionado.
    *   Uma imagem de bandeira correspondente ao idioma selecionado é exibida.
*   **Persistência de Preferência:** A escolha de idioma do usuário é salva e carregada quando o aplicativo é iniciado novamente.


## Tecnologias Utilizadas

*   **Kotlin:** Linguagem de programação principal.
*   **Jetpack Compose:** Para a construção da interface do usuário.
*   **DataStore (Preferences):** Para salvar as preferências de idioma do usuário de forma assíncrona.
*   **Coroutines:** Para gerenciamento de operações assíncronas (como salvar e carregar preferências).
*   **Android Studio:** IDE de desenvolvimento.