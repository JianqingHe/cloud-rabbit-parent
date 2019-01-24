#异常记录
配置
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.1.2.RELEASE</version>
    <relativePath/> <!-- lookup parent from repository -->
</parent>
启动抛出异常
java.lang.NoSuchMethodError: org.springframework.boot.builder.SpringApplicationBuilder
原因：spring-boot版本兼容问题
解决办法：更新版本
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>1.5.3.RELEASE</version>
    <relativePath/> <!-- lookup parent from repository -->
</parent>