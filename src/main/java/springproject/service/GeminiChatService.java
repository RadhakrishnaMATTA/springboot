package springproject.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GeminiChatService {

    @Value("${gemini.api.key}")
    private String apikey;

    @Value("${gemini.api.url}")
    private String apiurl;

    public String askGemini(String prompt) {

        // 1. Create RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // 2. Headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("x-goog-api-key", apikey);

        // 3. Request Body
        Map<String, Object> body = Map.of(
                "contents", List.of(
                        Map.of(
                                "parts", List.of(
                                        Map.of("text", prompt)
                                )
                        )
                )
        );

        // 4. HTTP Entity
        HttpEntity<Map<String, Object>> request =
                new HttpEntity<>(body, headers);

        
        Map<?, ?> response =
                restTemplate.postForObject(apiurl, request, Map.class);

        // 6. Extract response text
        List<?> candidates = (List<?>) response.get("candidates");
        Map<?, ?> candidate = (Map<?, ?>) candidates.get(0);
        Map<?, ?> content = (Map<?, ?>) candidate.get("content");
        List<?> parts = (List<?>) content.get("parts");
        Map<?, ?> part = (Map<?, ?>) parts.get(0);

        return part.get("text").toString();
    }
}
