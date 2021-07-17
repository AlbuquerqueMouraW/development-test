# development-test


# Sobre o projeto
watchMovie é uma aplicação REST (back-end) contruída com o intuito de listar, inserir, atualizar e excluir (CRUD) filmes de uma base de dados.
A aplicação consiste em um teste que faz parte do processo seleivo da empresa TKSolution. 

# Tecnologias utilizadas
<h2>BACK-END</h2>

<h3>Linguagem JAVA; 
Framework SPRING;
Banco de dados(local) MYSQL WORKBENCH;
Testes de APIs POSTMAN; </h3>

# Como executar o projeto

1 - <h2>Clone o repositório </h2>

2 - <h2>Import o projeto em sua IDE </h2> 

3 - <h2>Rode o projeto </h2>
    <p alingn ="start">
   <img width="360" src="/src/assets/java_aplication">
   </p> 

4 - <h2>Abra a pasta src/main/resources e altere Aplication properties - Alterar username e password do seu banco de dados (MySQL Workbench) </h2>
   <p alingn ="start">
   <img width="360" src="/watchMovies/src/assets/aplication_propertis_LI">
   </p>
   
5 - <h2>Abra o Postman </h2>

6 - <h2>Para inserir um filme (POST-CREATE):</h2>
   Usando a URL http://localhost:8080/movies, selecione no campo de ação a opção "POST" e no campo abaixo adicione as informações no formato JSON, clique no botão "SEND".
   <p alingn ="start">
   <img width="360" src="/watchMovies/src/assets/Post_1">
   </p>
   
7 - <h2>Para buscar todos os filmes inseridos (GET-READ): </h2>
    Usando a URL http://localhost:8080/movies, selecione no campo de ação a opção "GET" e clique no botão "SEND", conforme imagem a seguir: 
    <p alingn ="start">
    <img width="360" src="/watchMovies/src/assets/getAll_2">
    </p>
    <h3>Vale dizer que pode ser feita uma busca pelo ID, usando a URL http://localhost:8080/movies/{moviesId}, conforme demonstrado a seguir:</h3>
    <p alingn ="start">
    <img width="360" src="/watchMovies/src/assets/getID_3_LI">
    </p>
    <h3>Pode-se também fazer a busca por título, usando a URL http://localhost:8080/movies/title/{title}, conforme demonstrado a seguir: </h3>
    <p alingn ="start">
    <img width="360" src="/watchMovies/src/assets/getTitle_4_LI">
    </p>
    <h3>Não é preciso buscar pelo título completo</h3>
    <p alingn ="start">
    <img width="360" src="/watchMovies/src/assets/getTitleLetter_5_LI">
    </p>
    <h2>Pode ser feita a busca por gênero, usando a URL http://localhost:8080/movies/genres/{genres}, conforme demonstrado a seguir:</h2>
    <p alingn ="start">
    <img width="360" src="/watchMovies/src/assets/getGenres_6_LI">
    </p>
    <h3>Não é preciso buscar pelo nome completo do gênero </h3>
    <p alingn ="start">
    <img width="360" src="/watchMovies/src/assets/getGenresLetter_7_LI">
    </p>
    
8 - <h2>Para atualizar um dado inserido (PUT-UPDATE): </h2>
     Usando a URL http://localhost:8080/movies, selecione no campo de ação a opção "PUT" e no campo abaixo escreva a alteração que deseja fazer em formato JSON, lembrando de preencher as informações de {movieId},{title} para que seja identificado o dado exato que deseja alterar.
     <p alingn ="start">
     <img width="360" src="/watchMovies/src/assets/Put_8_LI">
     </p>
     
9 - <h2>Para deletar um filme inserido (DELETE):</h2>
     Usando a URL http://localhost:8080/movies/{moviesId} (onde {moviesId} é o ID do filme que deseja deletar), selecione no campo de ação a opção "DELETE" e clique no botão "SEND"
      <p alingn ="start">
     <img width="360" src="/watchMovies/src/assets/delete_9_LI">
     </p>
    

# Autor

Washington Albuquerque de Moura

Linkedin: linkedin.com/in/washington-albuquerque-729223aa/
GitHub: https://github.com/AlbuquerqueMouraW
