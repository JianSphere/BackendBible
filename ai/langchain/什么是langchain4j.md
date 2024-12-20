# 示例文章

> Google 搜索**自动补全功能**的强大，相信不少朋友都能感受到，它帮助我们更快地“补全”我们所要输入的搜索关键字。那么，它怎么知道我们要输入什么内容？它又是如何工作的？在这篇文章里，我们一起来看看。


# 什么是Langchain

`Langchain` 是一个用于构建基于语言模型的应用程序的框架。它帮助开发者将大语言模型（LLMs）集成到应用程序中，并且提供了一整套工具和组件，使得大模型能够更好的被集成到应用程序中。从而更方便快速的完成基于大模型的应用。LangChain提供两种程序语言的版本：Python版与Javascript版。
LangChain提供了一个标准接口，用于将不同的语言模型（LLM）连接在一起，以及与其他工具和数据源的集成。LangChain还为常见应用程序提供端到端链，如聊天机器人、文档分析和代码生成。 LangChain是由Harrison Chase于2022年10月推出的开源软件项目。它已成为LLM开发中最受欢迎的框架之一。LangChain支持Python和JavaScript语言，并与各种业界有名的LLM一起使用。


# 为什么要使用Langchain?

作为一名基于应用开发者而言，为什么要基于Langchain？一般来说，基于语言大模型的应用通常要经过如下的步骤:

### 1. **API调用**
   - **接口集成**：Langchain提供了一个统一的接口来接入不同的模型，开发者只需要熟悉 Langchain 的 API，就可以轻松地集成多种模型。
   - **Token管理**：帮助开发者记录每次 API 调用的 Token 使用情况，方便成本管理和优化资源利用。

### 2. **提示词（Prompts）**
   - **提示模板**：创建灵活的提示模板，支持动态插入变量，使得生成的文本更符合具体需求。
   - **提示优化**：提供工具和方法来优化提示词，提升生成结果的质量和相关性。

### 3. **记忆（Memory）**
   - **短期记忆**：在单次对话或操作中保存上下文信息，确保模型在同一对话中保持连贯性。
   - **长期记忆**：在多次会话中保留重要信息，使得模型能回忆之前的交互，从而提供更加个性化的体验。

### 4. **对话管理（Conversation Management）**
   - **多轮对话**：支持多轮对话中的上下文跟踪，使得模型能够理解和响应连续的问题和请求。
   - **对话控制**：允许开发者设置对话中的关键节点，例如重定向、总结或打断当前流程。

### 5. **工具集成（Tool Integration）**
   - **数据库查询**：通过自然语言生成 SQL 查询，直接从数据库中获取所需的数据。
   - **API 调用**：集成第三方 API，允许模型从外部数据源中获取信息或执行操作。
   - **文档检索**：支持从大规模文档库中检索相关内容，结合语言模型生成更加精准的响应。

### 6. **输出控制（Output Parsers）**
   - **结构化输出**：将模型生成的文本解析为结构化数据，如 JSON 格式，以便进一步处理。
   - **自定义解析器**：开发者可以定义自定义的输出解析器，处理特定格式或类型的输出。

### 7. **代理（Agents）**
   - **行动代理**：根据用户的输入或特定条件，自动选择并执行预设的操作（例如查询数据库、调用 API 等）。
   - **代理工具**：集成多种工具和 API，构建复杂的任务处理代理。

### 8. **流（Streams）**
   - **流处理**：支持流式处理大型文本数据或多步骤任务，使得处理长文本或需要连续输出的任务更高效。
   - **实时更新**：在长时间任务或持续对话中提供实时更新和结果输出。

### 9. **模板化（Templates）**
   - **任务模板**：为常见任务提供预设模板，简化开发流程，如问答系统、文档生成等。
   - **自定义模板**：开发者可以创建和共享自己的模板，适应特定业务需求。

### 10. **部署与集成**
   - **多模型支持**：支持与多个语言模型提供商（如 OpenAI, Hugging Face）的无缝集成。
   - **本地部署**：支持模型在本地环境中的部署和调用，满足对数据隐私和安全的需求。

### 11. **分析与监控（Analytics & Monitoring）**
   - **使用分析**：跟踪和分析模型的使用情况，包括调用频率、响应时间、成功率等。
   - **错误处理与日志**：记录和处理模型生成的错误和异常情况，帮助开发者调试和优化应用。

### 12. 链（Chains）
   - **简单链：** 将多个语言模型调用按顺序连接在一起，形成一个处理流程。每个步骤的输出可以作为下一个步骤的输入。
   - **复杂链：** 支持分支、并行处理等复杂逻辑，让开发者创建更具逻辑性的工作流程。

> Chains并不是必须的，因为我们完全可以自定义一些逻辑，并非要专门使用Chains。

### 13.RAG
RAG（检索增强生成）是一种结合信息检索与生成式模型的技术，旨在提高文本生成的准确性和相关性。它的典型工作流程是先从外部知识库或文档集合中检索到与问题相关的内容，然后将这些信息与大语言模型结合，用于生成更精确的回答。RAG 的优势在于，它利用了大模型的生成能力，同时通过检索增强了对具体事实和最新信息的掌握，比起finetune，是一种低成本获取精确信息的方案。
在智能问答系统、客服、法律和医学领域有较高的使用场景。

要使用RAG，必须经过文本向量化、向量存储、文档检索、相关性排序、 生成回答等诸多复杂的流程，Langchain集成了这些基础功能，使用Langchain可以很快的攒出来一个RAG流程。


**因此，Langchain是一个非常重要的AI应用开发框架，其重要性相当于Java生态体系中的Spring。**


## 什么是Langchain4j
尽管 Python 在数据科学和机器学习领域非常流行，Java 仍然是许多企业级应用的首选语言。为了填补 Java 生态中缺乏类似 LangChain 的框架这一空白，LangChain4j 应运而生。
angChain4J与LangChain的作者不同，也不属于同一个开源家族，但较晚出现的LangChain4J，极大的吸收LangChain的设计精神，并汲取Haystack与LlamaIndex部分设计，尽可能让LangChain4J能赶上LangChain。从2023年初，项目启动到如今，LangChain4j一直在持续更新，集成了诸多AI框架。因此，在java生态要基于大模型做应用，langchain4j是绝对绕不过去的一个选择。 官网地址：https://docs.langchain4j.dev/ 进行了解。



### Lanchain4J的基本功能

#### 轻松与 LLM 和 Vector Stores 交互
Langchain4J支持所有主要的商业和开源 LLM 和 Vector Store， 都可以通过统一的 API 轻松访问，从而能能够构建聊天机器人、助手等。
#### 基础AI服务、RAG、工具箱
从低级提示模板、聊天内存管理、输出解析到 RAG、代码执行引擎、常见LLM使用的工具箱（或者函数调用），Langchain4j都做了实现。
#### 集成Quarkus 和 Spring Boot 
Langchain4j集成了 Quarkus 和 Spring Boot，并且LLM和Java之间是双向集成：可以从 Java 调用 LLM，并允许 LLM 反过来调用Java 代码。



### Lanchain4J源码编译

langchain4j从上手难度讲，并不复杂，因此可以首先下载齐源码，本地编译，https://github.com/langchain4j/langchain4j

langchain4j的源码很清晰，从项目结构就可以大致看到Langchain4j集成了哪些AI模型。


出现很过类IDE无法识别的情况。

#### 1.本地编译
先要`mvn clean install`编译`langchain-core`，不能跳过测试
因为在其他的项目中，依赖了如下配置：
```xml
<dependency>
            <groupId>dev.langchain4j</groupId>
            <artifactId>langchain4j-core</artifactId>
            <classifier>tests</classifier>
            <type>test-jar</type>
            <scope>test</scope>
        </dependency>
```

 这种配置要本地打包,否则无法编译通过。

2.当Langchaincore编译完成以后，使用mvn clean install maven test.skip=true编译所有项目。

3.刷新ide：通过 invalide caches 来让idea识别，如果还不行，直接删除.iml文件，重新进入即可。
 

 快速开始

 当然，效果最好的大模型显然是OpenAPI的ChatGPT，但是其OpenAPI对限制了对中国的开放，但是微软的Azure Open AI服务却没有限制，
 因此，我们完全可以使用Azure Open AI代替其OPENAPI的官方服务。当然，我们也可以使用智普、阿里通义千问、商汤商量等国产大模型。

 
 ```java
 public class ChatLanguageDemo {

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
    }
}
```