package C07Exception;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class C04HttpJson {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 외부데이터(api) 요청 : 서버간의 통신
        // RestTemplate, RestClient : 스프링에서 가장 많이 사용되는 라이브러리
        // Httpclient는 자바의 내장 클래스로서 별도의 역직렬화, 직렬화 작업이 필요
        ObjectMapper o1 = new ObjectMapper();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String postString = response.body();
        // String postString = response.headers();
        List<Post> postList = new ArrayList<>();
        JsonNode jsonNodes = o1.readTree(postString);
        for (JsonNode j : jsonNodes) {
            Post post = o1.readValue(j.toString(), Post.class);
            postList.add(post);
        }
        System.out.println(postString);
    }
}

class Post {


    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    private Long id;
    private String title;
    private String body;

    @Override
    public String toString() {
        return "Post{" + "userId=" + userId + ", id=" + id + ", title='" + title + '\'' + ", body='" + body + '\'' + '}';
    }
}