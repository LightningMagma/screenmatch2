/*
package com.modules.screenmatch2.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obtenerTraduccion(String texto) {
        OpenAiService service = new OpenAiService("sk-proj-khGEVvKbE5httsbl2FhxT3BlbkFJId7v6nrgI0VYc9j9JiUT");

        CompletionRequest requisicion = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduce a español el siguiente texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        var respuesta = service.createCompletion(requisicion);
        return respuesta.getChoices().get(0).getText();
    }
}*/
