# development-test


# Sobre o projeto
watchMovie é uma aplicação REST (back-end) contruída com o intuito de listar, inserir, atualizar e excluir (CRUD) filmes de uma base de dados.
A aplicação consiste em um teste que faz parte do processo seleivo da empresa TKSolution. 

# Tecnologias utilizadas
<h2>BACK-END</h2>

<h3><p>Linguagem JAVA;</p> 
<p>Framework SPRING;</p>
<p>Banco de dados (local) MYSQL WORKBENCH;</p>
<p>Testes de API POSTMAN; </p></h3>

# Como executar o projeto

<h3>1 - Clone o repositório </h3>

<h3>2 - Importe o projeto em sua IDE </h3> 

<h3>3 - Rode o projeto clicando com o botão direito em cima da aplicação principal > Run As > Java Aplication </h3>

<h3>4 - Abra a pasta src/main/resources e altere Aplication properties - Alterar username e password do seu banco de dados (MySQL Workbench) </h3>
   <p alingn ="start">
   <img width="660" src="watchMovies/src/assets/aplication_propertis_LI.jpg">
   </p>
   
<h3>5 - Abra o Postman </h3>

<h3>6 - Para inserir um filme (POST-CREATE)</h3>
   Usando a URL http://localhost:8080/movies, selecione no campo de ação a opção "POST" e no campo abaixo adicione as informações no formato JSON, clique no botão "SEND":
   <p alingn ="start">
   <img width="660" src="watchMovies/src/assets/Post_1.jpg">
   </p>
   
<h3>7 - Para buscar todos os filmes inseridos (GET-READ) </h3>
    Usando a URL http://localhost:8080/movies, selecione no campo de ação a opção "GET" e clique no botão "SEND", conforme imagem a seguir: 
    <p alingn ="start">
    <img width="660" src="watchMovies/src/assets/getAll_2.jpg">
    </p>
    <h4>7a - Busca por ID, usando a URL http://localhost:8080/movies/{moviesId}, conforme demonstrado abaixo:</h4>
    <p alingn ="start">
    <img width="660" src="/watchMovies/src/assets/getID_3_LI.jpg">
    </p>
    <h4>7b - Busca por título, usando a URL http://localhost:8080/movies/title/{title}, conforme exemplo a seguir: </h4>
    <p alingn ="start">
    <img width="660" src="/watchMovies/src/assets/getTitle_4_LI.jpg">
    </p>
    <h4> Não é preciso buscar pelo título completo:</h4>
    <p alingn ="start">
    <img width="660" src="/watchMovies/src/assets/getTitleLetter_5_LI.jpg">
    </p>
    <h4>7c - Busca por gênero, usando a URL http://localhost:8080/movies/genres/{genres}, conforme imagem a seguir:</h4>
    <p alingn ="start">
    <img width="660" src="/watchMovies/src/assets/getGenres_6_LI.jpg">
    </p>
    <h4> Não é preciso buscar pelo nome completo do gênero: </h4>
    <p alingn ="start">
    <img width="660" src="/watchMovies/src/assets/getGenresLetter_7_LI.jpg">
    </p>
    
<h3>8 - Para atualizar um dado inserido (PUT-UPDATE) </h3>
     Usando a URL http://localhost:8080/movies, selecione no campo de ação a opção "PUT" e no campo abaixo escreva a alteração que deseja fazer em formato JSON, lembrando de preencher as informações {movieId} e {title} para que seja identificado o dado exato que deseja alterar:
     <p alingn ="start">
     <img width="660" src="/watchMovies/src/assets/Put_8_LI.jpg">
     </p>
     
<h3>9 - Para deletar um filme inserido (DELETE)</h3>
     Usando a URL http://localhost:8080/movies/{moviesId} (onde {moviesId} é o ID do filme que deseja deletar), selecione no campo de ação a opção "DELETE" e clique no botão "SEND":
      <p alingn ="start">
     <img width="660" src="/watchMovies/src/assets/delete_9_LI.jpg">
     </p>
    

# Autor

Washington Albuquerque de Moura

<p>Linkedin: https://linkedin.com/in/washington-albuquerque-729223aa/</p>
<p>GitHub: https://github.com/AlbuquerqueMouraW </p>
