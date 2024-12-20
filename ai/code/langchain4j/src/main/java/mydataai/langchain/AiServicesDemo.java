package mydataai.langchain;

import dev.langchain4j.model.azure.AzureOpenAiChatModel;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.service.AiServices;

public class AiServicesDemo {
    interface Assistant {
        String chat(String message);
    }


    public static void main(String[] args) {
        ChatLanguageModel model = AzureOpenAiChatModel.builder()
                .endpoint("#Your Endpoint")
                .apiKey("#API KEY")
                .deploymentName("#Azure Deployment Name")
                .temperature(0.3)
                .logRequestsAndResponses(true)
                .serviceVersion("2024-02-01")
                .build();
      System.out.println(model.generate("介绍一下自己"));
        Assistant assistant = AiServices.builder(Assistant.class)
                .chatLanguageModel(model)
                .build();
        String question = "介绍一下自己";
        String answer = assistant.chat(question);
        System.out.println("Answer: " + answer);
    }

}