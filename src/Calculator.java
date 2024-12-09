import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class WebParser {
    public static void main(String[] args) {
        // URL веб-страницы, которую вы хотите парсить
        String url = "https://www.example.com"; // замените на нужный вам URL

        try {
            // Получаем документ HTML с указанного URL
            Document document = Jsoup.connect(url).get();

            // Извлекаем все заголовки h1
            Elements headers = document.select("h1");

            // Выводим заголовки в консоль
            for (Element header : headers) {
                System.out.println(header.text());
            }
        } catch (IOException e) {
            e.printStackTrace(); // Обработка исключений
        }
    }
}
