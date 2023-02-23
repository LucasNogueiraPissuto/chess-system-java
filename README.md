# Tabuleiro de Xadrez

<!---Esses são exemplos. Veja https://shields.io para outras pessoas ou para personalizar este conjunto de escudos. Você pode querer incluir dependências, status do projeto e informações de licença aqui--->

![GitHub repo size](https://img.shields.io/github/repo-size/iuricode/README-template?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/iuricode/README-template?style=for-the-badge)

<img src="exemplo-image.png" alt="exemplo imagem">

> O projeto consiste em um jogo de xadrez feito 100% em JAVA, tendo como objetivo reforçar os conhecimentos na linguagem. Trata-se de um jogo offline com interação a partir do terminal.

### Funcionalidades

Tudo que um jogo de xadrez pode proporcionar:

- [x] Eliminar peças do oponente.
- [x] Movimentos especiais.
- [x] Movimentos especificos para cada tipo de peça.
- [x] Turnos
- [x] Programação defensiva com tratamento de exceções. 
- [x] Vitória com checkmate.

## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:
<!---Estes são apenas requisitos de exemplo. Adicionar, duplicar ou remover conforme necessário--->
* Você instalou a versão `17.0.5` ou superior do `JAVA`
* Você tem uma máquina `Windows / Linux / Mac`.

## 🚀 Instalando o Xadrez

Para instalar o Xadrez, crie um diretório e siga estas etapas:

Linux, macOS, Windows:
```
git clone https://github.com/LucasNogueiraPissuto/chess-system-java.git
```

## ☕ Usando o Xadrez

A partir do diretório raiz do projeto rode o seguinte comando no CMD:

```
java -cp out/production/chess-system application.Program

```
## 🎮 Como Jogar

| 1° Tela Inicial  | 2° Selecione a peça origem (Source)  | 3° Selecione a peça destino (Target)  | 4° Peça movida, turno/player trocado  |
|---|---|---|---|
| ![Screenshot_1](https://user-images.githubusercontent.com/56324728/90350890-e12cd180-e014-11ea-819f-ae9f66638d24.png)  | ![Screenshot_1](https://user-images.githubusercontent.com/56324728/90351151-c1e27400-e015-11ea-9359-b37b1ae7a6b0.png)  | ![Screenshot_1](https://user-images.githubusercontent.com/56324728/90351243-1be33980-e016-11ea-8570-c39c178a2515.png)  | ![image](https://user-images.githubusercontent.com/56324728/90351276-3c12f880-e016-11ea-9891-211e715d2241.png)  |

5. **Observações:** :pencil:
- Peças: Peão, Torre, Cavalo, Bispo, Rainha e Rei

| Pawn(Peão) | Rook(Torre) |  Knight(Cavalo) | Bishop(Bispo)  |  Queen(Rainha) | King(Rei)  |
|---|---|---|---|---|---|
| **P** | **R** | **N** | **B** | **Q** | **K** |

- A mecânica do jogo é baseada em **linhas**(_1, 2, 3, 4, 5, 6, 7, 8_) e **colunas**(_a, b, c, d, e, f, g, h_)
- Para **escolher** uma peça é necessário selecionar _primeiramente_ a **coluna** e logo em seguida(sem espaços) selecionar a **linha**, exemplo: **c2**
- Em **Captured pieces** o jogo armazena as peças capturadas.
- O **Turn** exibe o turno(rodada) em que o jogo está.
- **Waiting player** exibe qual é o jogador a jogar a próxima peça.
- **Source** é a origem, ou seja, a peça no qual o jogador irá jogar.
- **Target** é o destino, ou seja, o local no qual o jogador irá mover a peça.
- O jogo possui sistema de **Check** e **CheckMate**
- Alguns movimentos especiais:
  - Castling(Roque)
  - En Passant
  - Promotion(Promoção)
