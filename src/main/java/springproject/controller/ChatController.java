package springproject.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springproject.service.GeminiChatService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/chat")
public class ChatController {

    private final GeminiChatService service;

    public ChatController(GeminiChatService service) {
        this.service = service;
    }

    // POST endpoint (real AI request)
    @PostMapping
    public String chat(@RequestBody String message) {
        System.out.println("Received POST: " + message);
        return service.askGemini(message);
    }

    // GET endpoint (browser test)
    @GetMapping
    public String chatGet() {
        return "This endpoint only supports POST. Use Postman or curl to send a POST request with your prompt!";
    }
}
