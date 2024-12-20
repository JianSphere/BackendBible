package mydataai.langchain;

import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.azure.AzureOpenAiChatModel;
import dev.langchain4j.model.chat.ChatLanguageModel;

public class ChatLanguageDemo3 {


    public static void main(String[] args) {
        ChatLanguageModel chatLanguageModel = getChatLanguageModel();
        // 第一个用户消息
        UserMessage firstUserMessage = UserMessage.from("Hello, my name is Klaus");

        // AI 基于第一个用户消息生成的响应
        AiMessage firstAiMessage = chatLanguageModel.generate(firstUserMessage).content();
        System.out.println(firstAiMessage.text());

         //第二个用户消息
        UserMessage secondUserMessage = UserMessage.from("What is my name?");
        // AI 基于之前的对话上下文和新的用户消息生成的响应
        AiMessage secondAiMessage = chatLanguageModel.generate(firstUserMessage, firstAiMessage, secondUserMessage).content();
        // 生成的响应内容：Klaus
        System.out.println(secondAiMessage.text());
    }


    public static ChatLanguageModel getChatLanguageModel() {
        return AzureOpenAiChatModel.builder()
                .endpoint("https://edu-poc-py-us2.openai.azure.com/")
                .apiKey("e8b0a172be99435294b7f366bc586d5a")
                .deploymentName("gpt-4o-05-13")
                .temperature(0.3)
                .logRequestsAndResponses(true)
                .serviceVersion("2024-02-01")
                .build();

    }
}