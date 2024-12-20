---
title: 提示词优化的9个入门技巧
order: 1
---


出现很过类IDE无法识别的情况。

1.本地编译：

1.先要编译langchain-core  mvn clean install 不能跳过测试

因为在其他的项目中，依赖了如下配置
<dependency>
            <groupId>dev.langchain4j</groupId>
            <artifactId>langchain4j-core</artifactId>
            <classifier>tests</classifier>
            <type>test-jar</type>
            <scope>test</scope>
        </dependency>

        这种配置要本地打包

2.
 使用mvn clean install maven test.skip=true跳过所有的项目。

 3.刷新ide


 invalide caches

 如果还不行，直接删除.iml文件，重新进入即可。
 