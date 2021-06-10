alest 1 - 2021/1
Ramiro Nascimento

*** Trabalho 1 – Geração Automática de Índice Remissivo ****


- RESUMO TRABALHO -

Basicamente, é necessário realizar a leitura de um arquivo texto, e trabalhar com o armazenamento das palavras do texto em estruturas encadeadas para gerar o índice remissivo. A saída do programa consiste na apresentação dos resultados em modo texto.


TODO LIST

(  ) - criar projeto intellij
(  ) - adicionar leitura de arquivo (codigo moodle)
	(  ) - acoplhar esse codigo disponivel na minha solução
	(  ) - transformar todas as letras em minusculas, pra evitar duplicacao
	(  ) - dividir o texto em blocos de 40 linhas. Cada bloco desses representa uma página
	(  ) - tirar todos os tipos de pontos no final ou inicio das palavras
	(  ) - caso a palavra apareça 2 vezes na pagina, nao deve ser contada 2 vezes na lista
(  ) - lista das palavras contendo dentro de cada nodo uma sublista com a pagina de cada aparição da palavra 
(  ) - menu
	(  ) -  deve perguntar ao usuario qual dos arquivos ele quer ler.
	(  ) - das as seguinte opcoes apos escolher o texto que ele quer ler:
		(  ) - 1. Exibir todo o índice remissivo (em ordem alfabética);
		(  ) - 2. Pesquisar palavra (o usuário informa uma palavra; o sistema mostra as páginas em que a palavra ocorre).


Exemplo Resultado esperado:

Carregando arquivo 'java.txt'...
	51 linhas lidas.
Gerando índice remissivo para 51 linhas de texto...
	Linhas por página: 40
	Total de páginas: 2
	Tamanho Minimo das Palavras Indexadas: 1
	Ignorando 319 stopwords.
	Índice remissivo gerado, contendo 158 palavras.
=== Índice Remissivo ===
GENERAL (1 ocorrências)
 Linhas/Págs: 6/1

PURPOSE (1 ocorrências)
 Linhas/Págs: 6/1

CONCURRENT (1 ocorrências)
 Linhas/Págs: 7/1

CLASS (1 ocorrências)
 Linhas/Págs: 7/1

OBJECT (1 ocorrências)
 Linhas/Págs: 7/1

ORIENTED (1 ocorrências)
 Linhas/Págs: 7/1

DESIGNED (1 ocorrências)
 Linhas/Págs: 8/1

DEPENDENCIES (1 ocorrências)
 Linhas/Págs: 8/1

POSSIBLE (1 ocorrências)
 Linhas/Págs: 8/1

DESIGN (1 ocorrências)
 Linhas/Págs: 10/1

GOAL (1 ocorrências)
 Linhas/Págs: 10/1

PORTABILITY (1 ocorrências)
 Linhas/Págs: 10/1

MEANS (1 ocorrências)
 Linhas/Págs: 10/1

SIMILARLY (1 ocorrências)
 Linhas/Págs: 11/1

COMBINATION (1 ocorrências)
 Linhas/Págs: 11/1

OPERATING (1 ocorrências)
 Linhas/Págs: 12/1

ADEQUATE (1 ocorrências)
 Linhas/Págs: 12/1

SUPPORT (1 ocorrências)
 Linhas/Págs: 12/1

ACHIEVED (1 ocorrências)
 Linhas/Págs: 13/1

COMPILING (1 ocorrências)
 Linhas/Págs: 13/1

INTERMEDIATE (1 ocorrências)
 Linhas/Págs: 14/1

REPRESENTATION (1 ocorrências)
 Linhas/Págs: 14/1

CALLED (1 ocorrências)
 Linhas/Págs: 14/1

INSTEAD (1 ocorrências)
 Linhas/Págs: 14/1

DIRECTLY (1 ocorrências)
 Linhas/Págs: 15/1

ARCHITECTURE (1 ocorrências)
 Linhas/Págs: 15/1

ANALOGOUS (1 ocorrências)
 Linhas/Págs: 16/1

EXECUTED (1 ocorrências)
 Linhas/Págs: 17/1

VIRTUAL (1 ocorrências)
 Linhas/Págs: 17/1

VM (1 ocorrências)
 Linhas/Págs: 17/1

COMMONLY (1 ocorrências)
 Linhas/Págs: 18/1

INSTALLED (1 ocorrências)
 Linhas/Págs: 19/1

STANDALONE (1 ocorrências)
 Linhas/Págs: 19/1

APPLICATIONS (1 ocorrências)
 Linhas/Págs: 20/1

WEB (1 ocorrências)
 Linhas/Págs: 20/1

BROWSER (1 ocorrências)
 Linhas/Págs: 20/1

APPLETS (1 ocorrências)
 Linhas/Págs: 20/1

LIBRARIES (1 ocorrências)
 Linhas/Págs: 22/1

PROVIDE (1 ocorrências)
 Linhas/Págs: 22/1

GENERIC (1 ocorrências)
 Linhas/Págs: 22/1

WAY (1 ocorrências)
 Linhas/Págs: 22/1

ACCESS (1 ocorrências)
 Linhas/Págs: 22/1

FEATURES (1 ocorrências)
 Linhas/Págs: 23/1

GRAPHICS (1 ocorrências)
 Linhas/Págs: 23/1

THREADING (1 ocorrências)
 Linhas/Págs: 23/1

NETWORKING (1 ocorrências)
 Linhas/Págs: 23/1

UNIVERSAL (1 ocorrências)
 Linhas/Págs: 25/1

MAKES (1 ocorrências)
 Linhas/Págs: 25/1

PORTING (1 ocorrências)
 Linhas/Págs: 25/1

SIMPLE (1 ocorrências)
 Linhas/Págs: 25/1

OVERHEAD (1 ocorrências)
 Linhas/Págs: 26/1

INTERPRETING (1 ocorrências)
 Linhas/Págs: 26/1

INTERPRETED (1 ocorrências)
 Linhas/Págs: 27/1

SLOWLY (1 ocorrências)
 Linhas/Págs: 27/1

NATIVE (1 ocorrências)
 Linhas/Págs: 27/1

EXECUTABLES (1 ocorrências)
 Linhas/Págs: 28/1

JUST (1 ocorrências)
 Linhas/Págs: 28/1

TIME (1 ocorrências)
 Linhas/Págs: 28/1

JIT (1 ocorrências)
 Linhas/Págs: 28/1

COMPILERS (1 ocorrências)
 Linhas/Págs: 28/1

COMPILE (1 ocorrências)
 Linhas/Págs: 28/1

BYTECODES (1 ocorrências)
 Linhas/Págs: 28/1

INTRODUCED (1 ocorrências)
 Linhas/Págs: 29/1

EARLY (1 ocorrências)
 Linhas/Págs: 29/1

STAGE (1 ocorrências)
 Linhas/Págs: 29/1

CORPORATION (1 ocorrências)
 Linhas/Págs: 30/1

CURRENT (1 ocorrências)
 Linhas/Págs: 30/1

OWNER (1 ocorrências)
 Linhas/Págs: 30/1

FOLLOWING (1 ocorrências)
 Linhas/Págs: 31/1

ACQUISITION (1 ocorrências)
 Linhas/Págs: 31/1

MICROSYSTEMS (1 ocorrências)
 Linhas/Págs: 32/1

JANUARY (1 ocorrências)
 Linhas/Págs: 32/1

27 (1 ocorrências)
 Linhas/Págs: 32/1

2010 (1 ocorrências)
 Linhas/Págs: 32/1

ORIGINAL (1 ocorrências)
 Linhas/Págs: 33/1

AVAILABLE (1 ocorrências)
 Linhas/Págs: 34/1

MICROSOFT (1 ocorrências)
 Linhas/Págs: 34/1

WINDOWS (1 ocorrências)
 Linhas/Págs: 34/1

WORKS (1 ocorrências)
 Linhas/Págs: 34/1

XP (1 ocorrências)
 Linhas/Págs: 35/1

LATER (1 ocorrências)
 Linhas/Págs: 35/1

VERSIONS (1 ocorrências)
 Linhas/Págs: 35/1

CURRENTLY (1 ocorrências)
 Linhas/Págs: 35/1

OFFICIALLY (1 ocorrências)
 Linhas/Págs: 35/1

SUPPORTED (1 ocorrências)
 Linhas/Págs: 35/1

MACOS (1 ocorrências)
 Linhas/Págs: 36/1

LINUX (1 ocorrências)
 Linhas/Págs: 36/1

SOLARIS (1 ocorrências)
 Linhas/Págs: 36/1

LACKS (1 ocorrências)
 Linhas/Págs: 36/1

FORMAL (1 ocorrências)
 Linhas/Págs: 36/1

STANDARDIZATION (1 ocorrências)
 Linhas/Págs: 37/1

RECOGNIZED (1 ocorrências)
 Linhas/Págs: 37/1

ECMA (1 ocorrências)
 Linhas/Págs: 37/1

INTERNATIONAL (1 ocorrências)
 Linhas/Págs: 37/1

ISO (1 ocorrências)
 Linhas/Págs: 37/1

IEC (1 ocorrências)
 Linhas/Págs: 37/1

ANSI (1 ocorrências)
 Linhas/Págs: 37/1

PARTY (1 ocorrências)
 Linhas/Págs: 38/1

STANDARDS (1 ocorrências)
 Linhas/Págs: 38/1

ORGANIZATION (1 ocorrências)
 Linhas/Págs: 38/1

FACTO (1 ocorrências)
 Linhas/Págs: 39/1

PACKAGED (1 ocorrências)
 Linhas/Págs: 41/2

DIFFERENT (1 ocorrências)
 Linhas/Págs: 41/2

DISTRIBUTIONS (1 ocorrências)
 Linhas/Págs: 42/2

CONTAINS (1 ocorrências)
 Linhas/Págs: 42/2

PARTS (1 ocorrências)
 Linhas/Págs: 43/2

REQUIRED (1 ocorrências)
 Linhas/Págs: 43/2

KIT (1 ocorrências)
 Linhas/Págs: 44/2

JDK (1 ocorrências)
 Linhas/Págs: 44/2

SOFTWARE (1 ocorrências)
 Linhas/Págs: 45/2

DEVELOPERS (1 ocorrências)
 Linhas/Págs: 45/2

INCLUDES (1 ocorrências)
 Linhas/Págs: 45/2

TOOLS (1 ocorrências)
 Linhas/Págs: 46/2

COMPILER (1 ocorrências)
 Linhas/Págs: 46/2

JAVADOC (1 ocorrências)
 Linhas/Págs: 46/2

JAR (1 ocorrências)
 Linhas/Págs: 46/2

DEBUGGER (1 ocorrências)
 Linhas/Págs: 46/2

NOTABLE (1 ocorrências)
 Linhas/Págs: 48/2

LICENSED (1 ocorrências)
 Linhas/Págs: 48/2

GNU (1 ocorrências)
 Linhas/Págs: 49/2

STARTED (1 ocorrências)
 Linhas/Págs: 49/2

BEGAN (1 ocorrências)
 Linhas/Págs: 49/2

RELEASING (1 ocorrências)
 Linhas/Págs: 50/2

SOURCE (1 ocorrências)
 Linhas/Págs: 50/2

7 (1 ocorrências)
 Linhas/Págs: 50/2

REFERENCE (1 ocorrências)
 Linhas/Págs: 51/2

PROGRAMMING (2 ocorrências)
 Linhas/Págs: 3/1 6/1

BASED (2 ocorrências)
 Linhas/Págs: 7/1 33/1

SPECIFICALLY (2 ocorrências)
 Linhas/Págs: 7/1 17/1

WRITTEN (2 ocorrências)
 Linhas/Págs: 11/1 17/1

HARDWARE (2 ocorrências)
 Linhas/Págs: 12/1 18/1

SPECIFIC (2 ocorrências)
 Linhas/Págs: 15/1 22/1

INSTRUCTIONS (2 ocorrências)
 Linhas/Págs: 16/1 26/1

HOST (2 ocorrências)
 Linhas/Págs: 18/1 22/1

END (2 ocorrências)
 Linhas/Págs: 18/1 44/2

USERS (2 ocorrências)
 Linhas/Págs: 18/1 44/2

USE (2 ocorrências)
 Linhas/Págs: 18/1 25/1

ENVIRONMENT (2 ocorrências)
 Linhas/Págs: 18/1 42/2

JRE (2 ocorrências)
 Linhas/Págs: 19/1 42/2

STANDARD (2 ocorrências)
 Linhas/Págs: 22/1 39/1

OFFICIAL (2 ocorrências)
 Linhas/Págs: 30/1 51/2

DEVELOPMENT (2 ocorrências)
 Linhas/Págs: 44/2 45/2

OPENJDK (2 ocorrências)
 Linhas/Págs: 48/2 51/2

GPL (2 ocorrências)
 Linhas/Págs: 49/2 50/2

LANGUAGE (3 ocorrências)
 Linhas/Págs: 3/1 6/1 13/1

PROGRAMS (3 ocorrências)
 Linhas/Págs: 10/1 27/1 43/2

PLATFORM (3 ocorrências)
 Linhas/Págs: 11/1 31/1 43/2

RUN (3 ocorrências)
 Linhas/Págs: 11/1 27/1 43/2

INTENDED (3 ocorrências)
 Linhas/Págs: 16/1 44/2 45/2

SUN (3 ocorrências)
 Linhas/Págs: 32/1 33/1 49/2

RUNTIME (4 ocorrências)
 Linhas/Págs: 12/1 18/1 29/1 42/2

BYTECODE (4 ocorrências)
 Linhas/Págs: 14/1 15/1 25/1 26/1

ORACLE (4 ocorrências)
 Linhas/Págs: 30/1 33/1 38/1 41/2

SE (4 ocorrências)
 Linhas/Págs: 31/1 43/2 48/2 50/2

CODE (5 ocorrências)
 Linhas/Págs: 13/1 15/1 16/1 29/1 50/2

MACHINE (6 ocorrências)
 Linhas/Págs: 15/1 16/1 17/1 19/1 26/1 29/1

IMPLEMENTATION (10 ocorrências)
 Linhas/Págs: 8/1 31/1 32/1 33/1 34/1 38/1 41/2 48/2 49/2 51/2

JAVA (22 ocorrências)
 Linhas/Págs: 3/1 6/1 10/1 11/1 13/1 14/1 15/1 18/1 19/1 20/1 31/1 33/1 36/1 42/2 43/2 43/2 44/2 46/2 48/2 50/2 50/2 51/2

========================
Página 1 contém 178 palavras indexadas.
Página 2 contém 61 palavras indexadas.
Página com mais palavras indexadas = 1
Total de palavras no texto: 388
Total de stopwords no texto: 149
Percentual de stopwords: 38,40%
Buscando a palavra 'java': [1, 2]
----------------------------------------------------------- Pg. 1


THE [JAVA] PROGRAMMING LANGUAGE


[JAVA] IS A GENERAL-PURPOSE COMPUTER PROGRAMMING LANGUAGE THAT IS
CONCURRENT, CLASS-BASED, OBJECT-ORIENTED, AND SPECIFICALLY
DESIGNED TO HAVE AS FEW IMPLEMENTATION DEPENDENCIES AS POSSIBLE.

ONE DESIGN GOAL OF [JAVA] IS PORTABILITY, WHICH MEANS THAT PROGRAMS
WRITTEN FOR THE [JAVA] PLATFORM MUST RUN SIMILARLY ON ANY COMBINATION
OF HARDWARE AND OPERATING SYSTEM WITH ADEQUATE RUNTIME SUPPORT.
THIS IS ACHIEVED BY COMPILING THE [JAVA] LANGUAGE CODE TO AN
INTERMEDIATE REPRESENTATION CALLED [JAVA] BYTECODE, INSTEAD OF
DIRECTLY TO ARCHITECTURE-SPECIFIC MACHINE CODE. [JAVA] BYTECODE
INSTRUCTIONS ARE ANALOGOUS TO MACHINE CODE, BUT THEY ARE INTENDED
TO BE EXECUTED BY A VIRTUAL MACHINE (VM) WRITTEN SPECIFICALLY FOR
THE HOST HARDWARE. END USERS COMMONLY USE A [JAVA] RUNTIME ENVIRONMENT
(JRE) INSTALLED ON THEIR OWN MACHINE FOR STANDALONE [JAVA]
APPLICATIONS, OR IN A WEB BROWSER FOR [JAVA] APPLETS.

STANDARD LIBRARIES PROVIDE A GENERIC WAY TO ACCESS HOST-SPECIFIC
FEATURES SUCH AS GRAPHICS, THREADING, AND NETWORKING.

THE USE OF UNIVERSAL BYTECODE MAKES PORTING SIMPLE. HOWEVER, THE
OVERHEAD OF INTERPRETING BYTECODE INTO MACHINE INSTRUCTIONS MADE
INTERPRETED PROGRAMS ALMOST ALWAYS RUN MORE SLOWLY THAN NATIVE
EXECUTABLES. JUST-IN-TIME (JIT) COMPILERS THAT COMPILE BYTECODES TO
MACHINE CODE DURING RUNTIME WERE INTRODUCED FROM AN EARLY STAGE.
ORACLE CORPORATION IS THE CURRENT OWNER OF THE OFFICIAL
IMPLEMENTATION OF THE [JAVA] SE PLATFORM, FOLLOWING THEIR ACQUISITION
OF SUN MICROSYSTEMS ON JANUARY 27, 2010. THIS IMPLEMENTATION IS
BASED ON THE ORIGINAL IMPLEMENTATION OF [JAVA] BY SUN. THE ORACLE
IMPLEMENTATION IS AVAILABLE FOR MICROSOFT WINDOWS (STILL WORKS FOR
XP, WHILE ONLY LATER VERSIONS CURRENTLY OFFICIALLY SUPPORTED),
MACOS, LINUX, AND SOLARIS. BECAUSE [JAVA] LACKS ANY FORMAL
STANDARDIZATION RECOGNIZED BY ECMA INTERNATIONAL, ISO/IEC, ANSI, OR
OTHER THIRD-PARTY STANDARDS ORGANIZATION, THE ORACLE IMPLEMENTATION
IS THE DE FACTO STANDARD.

-------------------------------------------------------------------