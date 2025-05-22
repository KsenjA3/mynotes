FROM postgres:13.2-alpine
ENV POSTGRES_DB mynotes
ENV POSTGRES_USER mynotes
ENV POSTGRES_PASSWORD 12345

# docker run --name mynewdb -e POSTGRES_DB=mynewdb -e POSTGRES_USER=myuser -e POSTGRES_PASSWORD=11111 -p 5432:5432 -d postgres
# docker exec -it mynewdb psql -U myuser mynewdb
#  запуск..интерактивный режим..имя_контейнера..имя_бд..имя_user..название_бд_в_контейнере