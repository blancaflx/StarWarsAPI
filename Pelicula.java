public record Pelicula(String title, int episode_id, String opening_crawl, String director, String producer, String release_date) {
    @Override
    public String toString() {
        return "TITULO: " + title + '\n' +
                "EPISODIO:" + episode_id + '\n' +
                "OPENING CRAWL:" + opening_crawl + '\n' +
                "DIRECTOR: " + director + '\n' +
                "PRODUCTOR:" + producer + '\n' +
                "FECHA DE LANZAMIENTO: " + release_date;
    }
}
